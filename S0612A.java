package rlawlals0612;


class Men {
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
	}
	
}








public class S0612A {

}
