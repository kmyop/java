package rlawlals0609;
import java.util.Scanner;

class Animal {
	String name;

	
	Animal(String name) {
		this.name = name;
	}
	void bark() {
		System.out.println("멍멍");
	}
}


public class T0609A {
	public static void main(String[] args) {
		Animal dog = new Animal("puppy");
		dog.bark();
	}
}
