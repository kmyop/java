package rlawlals0616;
import java.util.Scanner;


class Menu{
	String name;
	int price;
	
	Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	/*this 명령어를 쓰지 않는 생성자
	  Menu(String n, int p) {
	  		name = n;
	  		price = p;
	  	}
	 */
	
	void printMenu(int number) {
		System.out.println(number+". "+name+'(' + price+"원)");
		
	}
	
	//수량을 입력받아 총 가격을 계산하는 getPrice 메서드(return)
	int getPrice(int quantity) {
		return price*quantity;
	}
	
}


public class kioskMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu m1 = new Menu("햄버거",5000);
		Menu m2 = new Menu("감자튀김",2500);
		Menu m3 = new Menu("콜라",2000);
		
		int number,quatity, total=0;
		
		
		System.out.println("=== 키오스크 프로그램 ===");
		m1.printMenu(1);
		m2.printMenu(2);
		m3.printMenu(3);
		
		System.out.println("메뉴 번호 선택: ");
		number = sc.nextInt();
		
		System.out.println("수량 입력: ");
		quatity = sc.nextInt();
		
		if(number == 1) {
			System.out.println(m1.name+ ": "+quatity+"개 주문");
			total = m1.getPrice(quatity);
		} else if(number == 2) {
			System.out.println(m2.name+ ": "+quatity+"개 주문");
		} else if(number == 3) {
			System.out.println(m3.name+ ": "+quatity+"개 주문");
		}
		
		System.out.println("총 결제 금액: "+total+"원");
		sc.close();		
	}
}
