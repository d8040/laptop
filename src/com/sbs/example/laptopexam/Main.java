package com.sbs.example.laptopexam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.printf("명령어) ");
		
		String command = scanner.nextLine();
		
		System.out.println(command);
	
		if (command.equals("article add")) {
			System.out.println("게시물 추가");
		} else if (command.equals("article list")) {
			System.out.println("게시물 목록");
		} else {
			System.out.println("잘못된 명령어");
		}

		scanner.close();
	}

}
