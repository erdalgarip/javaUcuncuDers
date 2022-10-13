package JavaOdev3.databaseAccess;

import JavaOdev3.entities.Educator;

public class SqlEducatorDao  implements EducatorDao{

	@Override
	public void add(Educator educator) {
   
    System.out.println("Eğitmen Sql Veritabanına Eklendi");
		
	}

	
}
