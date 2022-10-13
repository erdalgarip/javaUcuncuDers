package JavaOdev3.bussines;

import java.util.ArrayList;

import JavaOdev3.core.Logger;
import JavaOdev3.databaseAccess.CourseDao;
import JavaOdev3.entities.Course;

public class CourseManager {

private CourseDao courseDao;
private Logger[] loggers;

private ArrayList<String> CourseList = new ArrayList<String>();

public CourseManager(CourseDao courseDao, Logger[] loggers) {
	super();
	this.courseDao = courseDao;
	this.loggers = loggers;
}





public void add(Course course) throws Exception {
	
	if(course.getCoursePrice()<0) {
		
		throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz !");
	}
	
	if(CourseList.contains(course.getCourseName())) {
		
		throw new Exception("Kurs Adı Tekrar Edemez !");	
	}

	CourseList.add(course.getCourseName());
	courseDao.add(course);
	
	for (Logger logger : loggers) {
	
		logger.log(course.getCourseName());
		
	}
	
	
}

	
	
	
	
}
