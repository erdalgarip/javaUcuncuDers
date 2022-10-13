package JavaOdev3.databaseAccess;

import JavaOdev3.entities.Category;

public class SqlCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Kategori Sql Veritabanına Eklendi");
		
	}

}
