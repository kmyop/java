package rlawlals0612;

import java.util.Scanner;

class Menu {
	String name;
	int price;
	
	Menu(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	void printMenu(int number) {
		System.out.println(number +". " +name +"("+price+"원)");
	}
	
	void getPrice(int quantity) {
		System.out.println("총가격: " + (price * quantity));
		total =+ (price * quantity);
	}
	
}

public class KioskMain {
	static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		Menu m1 = new Menu("햄버거", 5000);
		Menu m2 = new Menu("감자튀김", 2500);
		Menu m3 = new Menu("콜라", 2000);
		
		int number, quantity, total;
		
		number = sc.nextInt();
		quantity = sc.nextInt();

		m1.printMenu(1);
		m2.printMenu(2);
		m3.printMenu(3);
		
		if(number == 1) {
			System.out.println(m1 + quantity);
		} else if (number == 2) {
			System.out.println(m2 + quantity);
		} else if (number == 3) {
			System.out.println(m3 + quantity);
		}

		
		
		
		
		
		sc.close();
		
	}

}
