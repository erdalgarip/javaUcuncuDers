package JavaOdev3;

import JavaOdev3.bussines.CategoriesManager;
import JavaOdev3.bussines.CourseManager;
import JavaOdev3.bussines.EducatorManager;
import JavaOdev3.core.DatabaseLogger;
import JavaOdev3.core.FileLogger;
import JavaOdev3.core.Logger;
import JavaOdev3.core.MailLogger;
import JavaOdev3.databaseAccess.HibernateCategoryDao;
import JavaOdev3.databaseAccess.HibernateEducatorDao;
import JavaOdev3.databaseAccess.JdbcCategoryDao;
import JavaOdev3.databaseAccess.JdbcCourseDao;
import JavaOdev3.databaseAccess.JdbcEducatorDao;
import JavaOdev3.entities.Category;
import JavaOdev3.entities.Course;
import JavaOdev3.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Course course = new Course(1, "Java", 10);
		// Course course2 = new Course(1,"Php",10);
		// Course course3 = new Course(1,"Java2",10);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		// courseManager.add(course2);
		// courseManager.add(course3);

		Category category = new Category(1, "Eğitim");
		// Category category2 = new Category(2,"Videolar");
		// Category category3 = new Category(3,"Eğitim2");
		CategoriesManager categoriesManager = new CategoriesManager(new HibernateCategoryDao(), loggers);
		categoriesManager.add(category);
		// categoriesManager.add(category2);
		// categoriesManager.add(category3);

		Educator educator = new Educator(1, "Adı", "Soyadı");
		EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
		educatorManager.add(educator);

	}

}
