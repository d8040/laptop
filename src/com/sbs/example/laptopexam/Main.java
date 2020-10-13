package com.sbs.example.laptopexam;

import java.util.Scanner; //scanner java 실행

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력설정
		
		//1번 저장소 넘버링
		String sub2 = "";
		String co2 = "";
		int no2 = 0;
		
		//2번 저장소 넘버링
		String sub1 = "";
		String co1 = "";
		int no1 = 0;
		
		int no = 0; //게시물 번호 초기설정

		while (true) { //범위안에서 반복 실행
			System.out.printf("명령어) ");
			String command = scanner.nextLine();
			if (command.equals("add")) {
				
				int id = 1 + no; // 등록 시 게시물 번호 증가 설정
				String sub;
				String co;
				
				System.out.println("==게시물 등록==");
				System.out.printf("제목: ");
				sub = scanner.nextLine();
				System.out.printf("내용: ");
				co = scanner.nextLine();
				
				no = id;
				
				if (id == 1) { //1번 게시물 작성시 내용, 제목, 번호 저장 설정
					no1= id;
					sub1 = sub;
					co1 = co;
				}
				if (id == 2) { //2번 게시물 작성시 내용, 제목, 번호 저장 설정
					no2= id;
					sub2 = sub;
					co2 = co;
				}
				System.out.println(id+"번 게시물이 등록되었습니다."); //또는 System.out.println("%d번 게시물이 생성되었습니다.\n", id);
				
			}

			else if (command.equals("list")) {
				System.out.println("==게시물 목록==");
				if (no == 0) {
					System.out.println("게시물이 없습니다.");
					continue;					
				}
				System.out.println("번호 / 제목");
				if (no >= 1) {
					System.out.println(no1+" / "+sub1);
				}
				if (no >= 2) {
					System.out.println(no2+" / "+sub2);
				}
				
				
			}

			else if (command.equals("exit")) { 
				System.out.println("==프로그램 종료==");
				break; // while문 종료
			}

			else { // 모든 값이 참이 아닐 경우
				System.out.println("==명령문 에러==");
			}

		}
		scanner.close();
	}
}
