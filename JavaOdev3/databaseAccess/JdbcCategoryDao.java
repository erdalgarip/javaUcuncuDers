package JavaOdev3.databaseAccess;

import JavaOdev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
 
		System.out.println("Kategori Jdbc Veritabanına Eklendi");
		
	}

}
