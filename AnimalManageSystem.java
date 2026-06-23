package rlawlals0623;




class Animal {
	String name;
	int age;
	
	
	//생성자 작성
	Animal(String n, int a) {
		name = n;
		age = a;
	}
	//sound()메소드: 출력
	void sound() {
		System.out.println(name+"이(가) 운다.");
	}
	//sound() 메소드 : 출력 ~번 운다. 입력O
	void sound(int count) {
		System.out.println(count + "번 운다.");

	}
}
// 상속: Animal을 상속받음. 부모 => Animal
class Dog extends Animal {
	int speed;
	//생성자 오버로드
	Dog(String n, int a, int s) {
		super(n, a);
		speed = s;
	}
	//sound() 메소드 오버로드: 출력하는 입력이 없는
	void sound() {
		System.out.println(name+ " 멍멍!");
	}
	//run() 메소드 : 시간을 입력받아서 ..m로 달렸습니다.
	void run(int time) {
		System.out.println((speed*time)+ "m 달림.");
	}
	
	
	
}




public class AnimalManageSystem {
	public static void main(String[] args) {
		Dog dog = new Dog("smart", 10, 10);
		dog.sound();
		dog.sound(3);
		dog.run(5);  //50m 달림.
	}
}
