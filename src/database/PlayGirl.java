package database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import login.SerializeFactory;

public class PlayGirl {

	public static void main(String[] args) {
		menu();
	}
	static Scanner sc = new Scanner(System.in);
	static ArrayList<HotGirl> girls = new ArrayList<>();
	private static void menu() {
		do {
			System.out.println("*************************");
			System.out.println("1. Nhập thông tin em gái");
			System.out.println("2. Thay đổi thông tin em gái");
			System.out.println("3. Xem thông tin em gái");
			System.out.println("4. Lưu thông tin em gái");
			System.out.println("5. Mở thông tin em gái");
			
			System.out.println("0. Thoát");
			System.out.println("Your choice: 1-6");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				nhap();
				break;
			case 2:
				thaydoi();
				break;
			case 3:
				xem();
				break;
			case 4:
				luu();
				break;
			case 5:
				load();
				break;
			
			default:
				System.err.println("Tạm biệt nhé!!!");
				System.exit(0);
				break;
			}
		} while(true);
	}
	private static void load() {
		Object girl = SerializeFactory.loadFile("D:/Hot girls.dat");
		girls = (ArrayList<HotGirl>) girl;
	}
	private static void luu() {
		boolean kq = SerializeFactory.saveFile(girls, "D:/Hot girls.dat");
		System.out.println(kq);
	}
	private static void xem() {
		for(HotGirl girl : girls)
		{
			System.out.println(girl);
		}
	}
	private static void thaydoi() {
		boolean flag = true;
		do {
		System.out.println("Nhập hành động muốn thực hiện:");
		System.out.println("1. Xóa em gái khỏi danh sách");
		System.out.println("2. Sửa thông tin em gái");
		System.out.println("3. Sắp xếp theo tuổi");
		System.out.println("4. Sắp xếp theo mã số");
		System.out.println("5. Quay lại");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			xoa();
			break;
		case 2:
			sua();
			break;
		case 3:
			Collections.sort(girls, new RankGirls());
			break;
		case 4:
			Collections.sort(girls, new RankGirlsByID());
			break;

		default:
			flag = false;
			break;
		}} while (flag == true);
	}
		private static void sua() {
		System.out.println("Nhập mã số em gái muốn sửa");
		int code = sc.nextInt();
		for(HotGirl girl : girls)
		{
			if(girl.getCode()==code) {
				System.out.println("Nhập tên mới:");
				girl.setName(new Scanner(System.in).nextLine());
				System.out.println("Nhập body mới:");
				girl.setBody(new Scanner(System.in).nextLine());
				System.out.println("Nhập năm sinh mới:");
				int year = sc.nextInt();
				girl.setAge(year);
			}
		}
	}
	private static void xoa() {
		System.out.println("Nhập mã số em gái muốn xóa");
		int code = sc.nextInt();
		for(HotGirl girl : girls)
		{
			if (girl.getCode()==code)
			{
				girls.remove(code);
				break;
			}
		}
	}
	private static void nhap() {
		System.out.print("Nhập mã số");
		int code = sc.nextInt();
		System.out.println("Nhập tên");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Nhập số đo toàn thân: Cao - Nặng - Ngực - Eo - Mông");
		String body = new Scanner(System.in).nextLine();
		System.out.println("Nhập năm sinh");
		int year = sc.nextInt();
		HotGirl girl = new HotGirl(code, name, body, year);
		girls.add(girl);
	}

}
