import config.InputMethods;
import controller.DepartmentController;

public class Main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("************************ MENU ************************");
			System.out.println("1. Quản lý phòng ban");
			System.out.println("2. Quản lý nhân viên");
			System.out.println("3. Thoát");
			System.out.println("Nhập vào lựa chọn của bạn: ");
			int choice = InputMethods.getInteger();
			switch (choice) {
				case 1:
					new DepartmentController();
					break;
				case 2:
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.err.println("Vui lòng nhập từ 1 đến 3");
					break;
			}
		}
		
	}
}