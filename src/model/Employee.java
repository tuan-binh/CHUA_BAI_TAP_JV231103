package model;

import config.InputMethods;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	private boolean sex;
	private double salary;
	private Employee manager;
	private Department department;
	
	public Employee() {
	}
	
	public Employee(String employeeId, String employeeName, LocalDate dateOfBirth, boolean sex, double salary, Employee manager, Department department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.salary = salary;
		this.manager = manager;
		this.department = department;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public boolean isSex() {
		return sex;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee getManager() {
		return manager;
	}
	
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void inputData(List<Employee> employees, List<Department> departments) {
		System.out.print("Nhập tên nhân viên: ");
		this.employeeName = InputMethods.getString();
		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		this.dateOfBirth = InputMethods.getLocalDate();
		System.out.print("Nhập giới tính (true->Nam , false->Nữ): ");
		this.sex = InputMethods.getBoolean();
		System.out.print("Nhập lương cứng: ");
		this.salary = InputMethods.getDouble();
		this.manager = InputMethods.getManager(employees);
		this.department = InputMethods.getDepartment(departments);
	}
	
	public void displayData() {
		System.out.println("[ ID: " + this.employeeId + " | Name: " + this.employeeName + " | DOB: " + this.dateOfBirth + " ]");
		System.out.println("[ Gender: " + (this.sex ? "Nam" : "Nữ") + " | Salary: " + this.salary + " ]");
		System.out.println("[ Manager: " + this.manager.getEmployeeName() + " | Department: " + this.department.getDepartmentName() + " ]");
	}
	
}
