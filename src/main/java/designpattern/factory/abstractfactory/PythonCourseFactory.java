package designpattern.factory.abstractfactory;

import designpattern.factory.ICourse;
import designpattern.factory.PythonCourse;

/**
 *
 */
public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }


    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
