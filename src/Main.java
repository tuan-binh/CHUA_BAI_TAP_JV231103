import config.InputMethods;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//		while (true) {
//			System.out.println("************************ MENU ************************");
//			System.out.println("1. Quản lý phòng ban");
//			System.out.println("2. Quản lý nhân viên");
//			System.out.println("3. Thoát");
//			System.out.println("Nhập vào lựa chọn của bạn: ");
//			int choice = InputMethods.getInteger();
//			switch (choice) {
//				case 1:
//					new DepartmentController();
//					break;
//				case 2:
//					break;
//				case 3:
//					System.exit(0);
//					break;
//				default:
//					System.err.println("Vui lòng nhập từ 1 đến 3");
//					break;
//			}
//		}
		
		System.out.print("Nhập vào chuỗi: ");
		String str = InputMethods.getString();
		
		Set<StringBuilder> arr = new HashSet<>();
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				result.append(str.charAt(i));
				arr.add(result);
			} else {
				char a = str.charAt(i + 1);
				char b =  str.charAt(i);
				if (Character.compare(a,b) > 0) {
					result.append(str.charAt(i));
				} else {
					result.append(str.charAt(i));
					arr.add(result);
					result = new StringBuilder();
				}
			}
		}
		System.out.println(arr);
		
		List<StringBuilder> newList = new ArrayList<>(arr);
		newList.sort(Comparator.comparing(StringBuilder::toString));
		
		System.out.println(newList.get(newList.size() - 1));
		
	}
}