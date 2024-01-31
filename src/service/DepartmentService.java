package service;

import model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService implements IDepartmentService {
	
	private static final List<Department> departments = new ArrayList<>();
	
	@Override
	public List<Department> findAll() {
		return departments;
	}
	
	@Override
	public Department findById(String id) {
		for (Department d : departments) {
			if (d.getDepartmentId().equals(id)) {
				return d;
			}
		}
		return null;
	}
	
	@Override
	public void save(Department department) {
		if (department.getDepartmentId() == null) {
			department.setDepartmentId(getNewId());
			departments.add(department);
		} else {
			departments.set(departments.indexOf(findById(department.getDepartmentId())), department);
		}
	}
	
	@Override
	public boolean existsDepartmentName(String name) {
		for (Department d : departments) {
			if (d.getDepartmentName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void delete(String id) {
		if (findById(id) == null) {
			System.err.println("ID không tồn tại");
		} else {
			departments.remove(findById(id));
		}
	}
	
	@Override
	public String getNewId() {
		String id = "D";
		int idMax = 0;
		for (Department d : departments) {
			int departmentId = Integer.parseInt(d.getDepartmentId().replace("D", "0"));
			if (idMax < departmentId) {
				idMax = departmentId;
			}
		}
		idMax += 1;
		return "D" + String.format("%03d", idMax);
	}
}
