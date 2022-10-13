package JavaOdev3.bussines;

import JavaOdev3.core.Logger;
import JavaOdev3.databaseAccess.EducatorDao;
import JavaOdev3.entities.Educator;

public class EducatorManager {
	
private EducatorDao educatorDao;

private Logger[] loggers;

public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
	super();
	this.educatorDao = educatorDao;
	this.loggers = loggers;
}

public void add(Educator educator) {
	
	educatorDao.add(educator);
	
	for (Logger logger : loggers) {
		logger.log(educator.getEducatorName());
		
	}
	
}

	
	

}
