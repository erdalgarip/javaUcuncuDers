package JavaOdev3.entities;

public class Educator {
int EducatorId;
String EducatorName;
String EducatorSurname;

public Educator() {
	super();

}

public Educator(int educatorId, String educatorName, String educatorSurname) {
	super();
	EducatorId = educatorId;
	EducatorName = educatorName;
	EducatorSurname = educatorSurname;
}

public int getEducatorId() {
	return EducatorId;
}

public void setEducatorId(int educatorId) {
	EducatorId = educatorId;
}

public String getEducatorName() {
	return EducatorName;
}

public void setEducatorName(String educatorName) {
	EducatorName = educatorName;
}

public String getEducatorSurname() {
	return EducatorSurname;
}

public void setEducatorSurname(String educatorSurname) {
	EducatorSurname = educatorSurname;
}








}
