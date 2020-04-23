package designpattern.factory.abstractfactory;

import designpattern.factory.ICourse;
import designpattern.factory.JavaCourse;

/**
 *
 */
public class JavaCourseFactory implements CourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
