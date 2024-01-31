package controller;

import config.InputMethods;
import model.Department;
import service.DepartmentService;
import service.IDepartmentService;

public class DepartmentController {
	
	private IDepartmentService departmentService = new DepartmentService();
	
	public DepartmentController() {
		while (true) {
			System.out.println("************************ MENU ************************");
			System.out.println("1. Hiển thị danh sách phòng ban\n" +
					  "2. Thêm mới phòng ban\n" +
					  "3. Chỉnh sửa tên phòng ban\n" +
					  "4. Hiển thị danh sách nhân viên của phòng ban theo mã phòng\n" +
					  "5. Xóa phòng ban (chỉ xóa khi ko có nhân viên nào)\n" +
					  "6. Thoát");
			System.out.print("Lựa chọn đi bạn: ");
			int choice = InputMethods.getInteger();
			switch (choice) {
				case 1:
					handleShowAll();
					break;
				case 2:
					handleAddNewDepartment();
					break;
				case 3:
					handleEditDepartment();
					break;
				case 4:
					handleShowEmployeeByDepartmentId();
					break;
				case 5:
					handleDeleteDepartment();
					break;
				case 6:
					return;
				default:
					System.err.println("Lựa chọn lại đê:");
					break;
			}
		}
	}
	
	public void handleShowAll() {
		for (Department d : departmentService.findAll()) {
			d.displayData();
		}
	}
	
	public void handleAddNewDepartment() {
		System.out.print("Mày muốn thêm bao nhiêu: ");
		int n = InputMethods.getInteger();
		for (int i = 0; i < n; i++) {
			Department department = new Department();
			department.inputData(departmentService);
			departmentService.save(department);
		}
	}
	
	public void handleEditDepartment() {
	}
	
	public void handleShowEmployeeByDepartmentId() {
	}
	
	public void handleDeleteDepartment() {
	}
	
}
