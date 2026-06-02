package rlawlals0602;
import java.util.Scanner;

class Student{
	String name;
	int age;
	int score;
	String grade; 
	
	// 생성자 생성
	Student(String name){
		this.name = name;
	}
	
	//생성자 오버로드
	Student(String name, int age){
		this.name = name;
		this.age = age;
		this.score = 100;
		
	}
	
	void info() {
		
		System.out.println(this.name);
		System.out.println(this.score);
	}
	
	String setGrade(int score) {
		this.score = score;
			this.grade = "A";
		if (score >= 90) {
			System.out.println("Grade A");
		} else if(score >= 70) {
			System.out.println("Grade B");
		} else if(score >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade F");
		}
		return grade;
	}
}

public class S0602A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		sc.close();
		
		
		String grade;
		Student s1 = new Student(name);
		s1.info();
		System.out.println("등급: "+ s1.setGrade(78));
		grade = s1.setGrade(78);
		System.out.println("등급: "+ grade);
		System.out.println("등급: "+ s1.grade);
		
		Student s2 = new Student(name, 18);
		s2.info();
		s2.setGrade(100);
		
		Student[] st = new Student[3];
		st[0] = new Student("철수");
		st[0] = new Student("영희", 15);
		st[0] = new Student("스마트", 18);
		st[0].info();
		st[1].info();
	}
}
