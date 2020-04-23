package designpattern.factory.factorymethod;

import designpattern.factory.ICourse;
import designpattern.factory.PythonCourse;

/**
 *
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
