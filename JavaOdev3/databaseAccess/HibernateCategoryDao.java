package JavaOdev3.databaseAccess;

import JavaOdev3.entities.Category;

public class HibernateCategoryDao  implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate Veritabanına Eklendi");
		
	}

}
