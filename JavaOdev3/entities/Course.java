package JavaOdev3.entities;

public class Course {

	int CourseId;
	String CourseName;
	double CoursePrice;
	
	
	public Course() {
		super();

	}


	public Course(int courseId, String courseName, double coursePrice) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CoursePrice = coursePrice;
	}


	public int getCourseId() {
		return CourseId;
	}


	public void setCourseId(int courseId) {
		CourseId = courseId;
	}


	public String getCourseName() {
		return CourseName;
	}


	public void setCourseName(String courseName) {
		CourseName = courseName;
	}


	public double getCoursePrice() {
		return CoursePrice;
	}


	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	
	
	
	
	
	
	
	
	
	
	
}
