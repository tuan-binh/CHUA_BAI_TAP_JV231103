package service;

import model.Department;

public interface IDepartmentService extends IGenericService<Department, String> {
	String getNewId();
	
	boolean existsDepartmentName(String name);
}
