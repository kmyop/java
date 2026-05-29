package rlawlals0529;
import java.util.Scanner;

public class SquareStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("높이: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<num ; j++) {
		
				System.out.println("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<num; i++) {
			for(int j=0; j<=i ; j++) {
		
				System.out.println("*");
			}
			System.out.println();
		
	}
	}
}
