package java8.stream;

import java8.Person;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.test.Test;

import javax.swing.text.html.Option;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  上午10:58
 * @Version 1.0
 */
public class testMain {




    public static void main(String[] args) {

        Long a1 = 128L;
        Long a2 = 128L;
        System.out.println(a1 == a2);
        System.out.println(Objects.equals(a1,a2));
        System.out.println("==");
        System.out.println(a1==128L);

          a1 = 127L;
          a2 = 127L;
        System.out.println(a1 == a2);
        System.out.println(a1==127L);



        List<Vehicle> vehicles = new ArrayList<>();
        List<String> imeis = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            List<String> singleVehicleDevices = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                String imei = RandomStringUtils.randomAlphanumeric(15);
                singleVehicleDevices.add(imei);
            }
            imeis.add(StringUtils.join(singleVehicleDevices,','));
        }
        vehicles.add(new Vehicle("KPTSOA1K67P081452","17620411498","9420",1,4.5,imeis.get(0)));
        vehicles.add(new Vehicle("KPTCOB1K18P057071","15073030945","张玲",2,1.4,imeis.get(1)));
        vehicles.add(new Vehicle("KPTS0A1K87P080237","19645871598","sanri1993",1,3.0,imeis.get(2)));
        vehicles.add(new Vehicle("KNAJC526975740490","15879146974","李种",1,3.9,imeis.get(3)));
        vehicles.add(new Vehicle("KNAJC521395884849","13520184976","袁绍",2,4.9,imeis.get(4)));

        vehicles.forEach(vehicle -> System.out.println(vehicle));

        int a = 0;

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.forEach((k,v) -> {
            System.out.println(a);
            System.out.println("key:"+k+"  value:"+v);
        });

        //Map<Integer,List<Vehicle>> comapnyVechicles = vehicles.stream().collect(Collectors.groupingBy(Vehicle::getCompanyId));

        //System.out.println(comapnyVechicles.toString());
        //Map<Integer,Double> comapnyVechicles1 = vehicles.stream().collect(Collectors.groupingBy(Vehicle::getCompanyId,Collectors.summingDouble(Vehicle::getScore)));
        //
        //System.out.println(comapnyVechicles1);


        //vehicles.sort((v1,v2) -> v2.getScore().compareTo(v1.getScore()));

        //System.out.println(vehicles);


        //List<Vehicle> collect2 = vehicles.stream().sorted(Comparator.comparing(Vehicle::getScore).reversed()).collect(
        //    Collectors.toList());
        //System.out.println(collect2);


        //List<Vehicle> collect3 = vehicles.stream().sorted(Comparator.comparing(Vehicle::getScore).reversed().thenComparing(Comparator.comparing(Vehicle::getCompanyId))).collect(
        //    Collectors.toList());

        //List<String> collect4  = vehicles.stream();.map(vehicle -> {
        //   String deviceNo = vehicle.getDeviceNos();
        //   return StringUtils.split(deviceNo,",");
        //}).`flatMap(Arrays::stream).collect(Collectors.toList());
        //System.out.println(collect4);



        List<String> cities = Arrays.asList("Milan",
            "London",
            "New York",
            "San Francisco");
        String citiesCommaSeparated = String.join(",", cities);
        System.out.println(citiesCommaSeparated);
        //Output: Milan,London,New York,San Francisco

        //cities = null;

        String citiesCommaSeparated1 = Optional.ofNullable(cities).orElse(new ArrayList<>()).stream()
            .collect(Collectors.joining(","));
        System.out.println("=====[[[     ");
        System.out.println(citiesCommaSeparated1.length());
        //Output: Milan,London,New York,San Francisco

        System.out.println("<><><><><><");

        Double reduce = vehicles.stream().parallel().map(Vehicle::getScore).reduce(0d,Double::sum);

        //System.out.println(reduce);
        System.out.println("==========");
        Vehicle vehicle = new Vehicle();
        Optional<Vehicle> can = Optional.ofNullable(vehicle);
        System.out.println("==========");
        Vehicle vehicle1 = null;
         String str = null;
      //Optional.of(str).ifPresent((values)->{
      //      System.out.println(123);
      //  });
        Optional.ofNullable(str).ifPresent((values)->{
            System.out.println(123);
        });
        String result = Optional.ofNullable(str).orElse("xxx");
        System.out.println(result);

        String result1 = Optional.ofNullable(str).orElseGet(Vehicle::aaa);
        System.out.println(result1);



        String str3 = "123";
        String result2 = Optional.ofNullable(str3).orElseGet( () -> {
            String  v = new String();
            String ab = Optional.ofNullable(v).orElse("12");
                return ab;
        });
        System.out.println(result2);
        String str4 = null;
        Optional<String> upperName = Optional.ofNullable(str4).map((value) ->{
            System.out.println(123);
            return value.toUpperCase()+"   fwwfwe";
        });
        System.out.println(upperName.orElse("no data"));


        String result5  = Optional.ofNullable(str4).map((value) ->{
            System.out.println(123);
            return value.toUpperCase()+"   fwwfwe";
        }).orElse("no data 5");
        System.out.println(result5);


        Optional result6 =  Optional.ofNullable(str4).flatMap((value) -> Optional.ofNullable(value.toUpperCase()));



        String result7 = Optional.ofNullable(str4).filter((value) -> value.length()>6).orElse("no datafilter");
        System.out.println(result7);

        TestObj testObj2 = null;
        testObj2 = Optional.ofNullable(testObj2).orElseGet(TestObj::new);
        System.out.println(testObj2==null?"xxxxx":"uyyyyyyy");

        TestObj testObj3 = null;
        testObj3 = Optional.ofNullable(testObj3).orElse(testObj3);
        System.out.println(testObj3==null?"xxxxx":"uyyyyyyy");
        //Optional<String> name = Optional.of("Sanaulla");
        //name.ifPresent((value) -> {
        //    System.out.println(":");
        //});
        //
        //



        //System.out.println(can.isPresent());
        //System.out.println(can.get());
        //
        //can.ifPresent(Vehicle::a);
        //can.orElse(vehicle);


            //List<String> strings = vehicles.stream().map(Vehicle::getVin).collect(Collectors.toList());
        //System.out.println(strings);


        //List<Vehicle> collect = vehicles.stream().filter(vehicle ->  vehicle.getScore() >=3).collect(Collectors.toList());
        //System.out.println(collect);

    }
}
