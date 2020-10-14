package com.sbs.example.laptopexam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Article article1 = new Article();
		
		Article article2 = new Article();
		
		int no = 0;
		


		while (true) {
			System.out.printf("명령어) ");
			String command = scanner.nextLine();
			if (command.startsWith("detail")) {
				int inputedId = Integer.parseInt(command.split("l")[1]);
				// else if (command.equals("detail1")) {
				
				if (inputedId == 1) {
					System.out.println("==게시물 상세==");
					if (article1.no == 0) {
						System.out.println(inputedId + "번 게시물은 존재 하지 않습니다.");
						continue;
					}
					System.out.println("번호: " + article1.no);
					System.out.println("제목: " + article1.sub);
					System.out.println("내용: " + article1.con);
				}
				// else if (command.equals("detail2")) {
				else if (inputedId == 2) {
					System.out.println("==게시물 상세==");
					if (article2.no == 0) {
						System.out.println(inputedId + "번 게시물은 존재 하지 않습니다.");
						continue;
					}
					System.out.println("번호: " + article2.no);
					System.out.println("제목: " + article2.sub);
					System.out.println("내용: " + article2.con);
				}
			}
			else if (command.equals("add")) {
				System.out.println("==게시물 등록==");

				int id = no + 1;
				String sub;
				String con;
				System.out.printf("제목: ");
				sub = scanner.nextLine();
				System.out.printf("내용: ");
				con = scanner.nextLine();
				System.out.println(id + "번째 게시물이 등록 되었습니다."); // System.out.printf("%s번째 게시물이 등록 되었습니다.\n", id);로 대체 가능

				no = id;

				if (no == 1) {
					article1.sub = sub;
					article1.con = con;
					article1.no = no;
				}
				if (no == 2) {
					article2.sub = sub;
					article2.con = con;
					article2.no = no;
				}

			} else if (command.equals("list")) {
				System.out.println("==게시물 목록==");

				if (no == 0) {
					System.out.println("저장된 게시물이 없습니다.");
				}
				if (no >= 1) {
					System.out.println("번호 / 제목");
					System.out.println(article1.no + " / " + article1.sub);
				}
				if (no >= 2) {
					System.out.println("번호 / 제목");
					System.out.println(article2.no + " / " + article2.sub);
				}
			}

			 else if (command.equals("exit")) {
				System.out.println("==프로그램 종료==");
				break;
			} else {
				System.out.println("**명령어 오류");
			}
		}
		scanner.close();
	}
}
