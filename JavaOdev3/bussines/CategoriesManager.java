package JavaOdev3.bussines;

import java.util.ArrayList;

import JavaOdev3.core.Logger;
import JavaOdev3.databaseAccess.CategoryDao;
import JavaOdev3.entities.Category;

public class CategoriesManager {
	
private CategoryDao categoryDao;
private Logger[] loggers;
private ArrayList<String> newCategoryList = new ArrayList<String>();

public CategoriesManager(CategoryDao categoryDao, Logger[] loggers) {
	super();
	this.categoryDao = categoryDao;
	this.loggers = loggers;
}





public void add(Category category) throws Exception {
	
	if(newCategoryList.contains(category.getCategoryName())) {
		
		throw new Exception("Kategori AdıTekrar Edemez ! ");
	}
	
	
	newCategoryList.add(category.getCategoryName());
	categoryDao.add(category);
	
	for (Logger logger : loggers) {
		
		logger.log(category.getCategoryName());
	}
	
}






	

}
