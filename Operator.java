package rlawlals0526;
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		while(true) {
			System.out.print("월 입력: );"
			month = sc.nextInt();
			
			if(month >= 1 && month <= 12) {
				sc.close();
				break;
			} else {
				System.out.print("다시 입력하세요. ");
			}
		}
		
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		sc.close();
		
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}	else {
			System.out.println("봄이 아니다.");
		}
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		}	else {
			System.out.println("봄이 아니다.");
		}
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이다.");
			break;
		default:
			System.out.println("봄이 아니다.");
		}
		
	}
}
