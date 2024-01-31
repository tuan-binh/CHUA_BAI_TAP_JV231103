package model;

import config.InputMethods;
import service.DepartmentService;
import service.IDepartmentService;

public class Department {
	private String departmentId;
	private String departmentName;
	private int totalMembers;
	
	public Department() {
	}
	
	public Department(String departmentId, String departmentName, int totalMembers) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.totalMembers = totalMembers;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public int getTotalMembers() {
		return totalMembers;
	}
	
	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}
	
	
	public void inputData(IDepartmentService departmentService) {
		while (true) {
			System.out.print("Nhập vào tên phòng ban: ");
			this.departmentName = InputMethods.getString();
			if (departmentService.existsDepartmentName(this.departmentName)) {
				System.err.println("Tên phòng ban đã tồn tại");
			} else {
				break;
			}
		}
		
		
	}
	
	public void displayData() {
		System.out.println("[ ID: " + this.departmentId + " | Name: " + this.departmentName + " | Members: " + this.totalMembers + " ]");
	}
	
}
