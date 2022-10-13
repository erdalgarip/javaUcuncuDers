package JavaOdev3.databaseAccess;

import JavaOdev3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		
	System.out.println("Kurs Hibernate Veritabanına Eklendi");
		
	}

}
