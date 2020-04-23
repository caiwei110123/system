package exceltojson;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/23  下午5:57
 * @Version 1.0
 */

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelTranslatorToJsonStr {

    public static void main(String[] args) {
        String cfgFile = "position_job.xlsx";
        if (args.length > 0) {
            cfgFile = args[0];
        }
        new ExcelTranslatorToJsonStr().translateFile(cfgFile);
        //new ExcelTranslator().test();
    }

    private void test() {
        JSONArray array1 = new JSONArray();
        array1.add(12);
        array1.add(22);
        JSONArray array2 = new JSONArray();
        array2.add(21);
        array2.add(22);
        JSONArray array = new JSONArray();
        array.add(array1);
        array.add(array2);
        System.out.println(array.toString());
    }


    Sheet sheet;
    Workbook book;

    private void translateFile(String cfgFile) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(cfgFile);
        URL url = classLoader.getResource(cfgFile);
        File file = new File("/Users/cw/eclipse-workspace/testm/src/main/java/exceltojson/alldata.xls");
        System.out.println(url);
        try {
            book = Workbook.getWorkbook(file);
            sheet = book.getSheet(0);
            outputToJSON(sheet);
        } catch (BiffException | IOException e) {
            e.printStackTrace();
        }
    }

    private void outputToJSON(Sheet sheet2) throws IOException {
        JSONArray arr = new JSONArray();
        for (int i =0; i < sheet.getRows(); i++) {
            JSONArray rowarr = new JSONArray();
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j, i);
                rowarr.add(cell.getContents());
            }
            arr.add(rowarr);
        }
        System.out.println("============================================================");

        //writeToFile(arr.toString(),".json");
        List<String> s = new ArrayList<>();
        System.out.println(arr.toString());
        for (int i = 1;i<arr.size();i++){
            JSONArray nickArr = arr.getJSONArray(i);
            s.add("'"+nickArr.getString(0)+"'");
        }
        System.out.println("============================================================");
        System.out.println(s.toString());
    }

    public void outputToTxt(Sheet sheet) throws IOException {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sheet.getRows(); i++) {

            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j, i);
                builder.append(cell.getContents() + "|");
            }
            builder.append("\r\n");
        }
        writeToFile(builder.toString(),".txt");
    }

    public void writeToFile(String info,String filePostfix) throws IOException {
        String path =  "/Users/cw/"+ sheet.getName() + filePostfix;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);// true,表示:文件追加内容，不重新生成,默认为false
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null) {
                System.out.println(line);
            }
            inputStreamReader.close();
            fileInputStream.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public void printOutContent(Sheet sheet) {
        for (int i = 0; i < sheet.getRows(); i++) {

            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j, i);
                System.out.print(cell.getContents() + "|");
            }
            System.out.println();
        }
    }
}
