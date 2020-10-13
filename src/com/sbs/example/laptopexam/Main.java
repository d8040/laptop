package com.sbs.example.laptopexam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int art = 0;
		int id1 = 0;
		String title1 = "";
		String body1 = "";

		int id2 = 0;
		String title2 = "";
		String body2 = "";

		while (true) {
			System.out.printf("명령어) ");
			String command = scanner.nextLine();
			int id = art + 1;
			String title;
			String body;
			if (command.equals("add")) {
				System.out.println("==게시물 등록==");

				System.out.printf("제목: ");
				title = scanner.nextLine();
				System.out.printf("내용: ");
				body = scanner.nextLine();
				System.out.println(id + "번 게시물이 생성되었습니다.");

				art = id;

				if (id == 1) {
					id1 = id;
					title1 = title;
					body1 = body;
				}
				if (id == 2) {
					id2 = id;
					title2 = title;
					body2 = body;
				}

			} else if (command.equals("list")) {
				System.out.println("==게시물 목록==");
				if (art == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				System.out.println("번호 / 제목");
				if (id >= 1) {

					System.out.println(id1 + " / " + title1);
				}
				if (id >= 2) {

					System.out.println(id2 + " / " + title2);
				}
			} else if (command.equals("exit")) {
				System.out.println("==프로그램 종료==");
				break;
			} else {
				System.out.println("명령어 에러");
			}
		}
		scanner.close();
	}
}