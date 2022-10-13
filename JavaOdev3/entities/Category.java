package JavaOdev3.entities;

public class Category {

	int CategoryID;
	String CategoryName;
	
	public Category() {
		super();

	}

	public Category(int categoryID, String categoryName) {
		super();
		CategoryID = categoryID;
		CategoryName = categoryName;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	
	
	
	
	
}
