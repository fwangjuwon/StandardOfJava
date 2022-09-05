package chapter02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("두자리 정수를 입력해주세요");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(input);
		System.out.printf("num=%d%n", num);
		
	}

}
