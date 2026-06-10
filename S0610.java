package rlawlals0610;
//도서관 
import java.util.Scanner;

//Book 클래스
class Book {
	String title;
	String author;
	int year; //발행 년도
	boolean borrow; //대출여부 저장
	
	//생성자
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
		borrow = false; //생성자에서 값 지정 가능
		
	}
	
	//메소드(반환X)
	void show() {
		System.out.println("제목: "+ title);
		System.out.println("저자: "+ author);
		System.out.println("출판년도: "+ year);
	}
	
	//대출하는 메소드
	String borrowOf() {
		if (borrow) {
			return "대출 중";
		} else {
			borrow = true; // 대출 
			return "대출 완료";
		}
	}

	
	
	
}


class Novel extends Book {
	String genre;
	
	
	Novel(String title, String genre,String author,int year) {
		super(title, author, year);
		this.genre = genre;
	}



	}



class Science extends Book {
	int level;
	
	
	Science(String title, int level,String author,int year) {
		super(title, author, year);
		this.level = level;
	}



	}







public class S0610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목: ");
		String title = sc.next();
		System.out.println("저자: ");
		String author = sc.next();
		System.out.println("발행연도: ");
		int year = sc.nextInt();
		
		//객체 생성, 배열형태이용,
		//배열은 import X, 리스트 import O
		Book[] book = new Book[2];
		book[0] = new Novel(title,author,year,"코믹");
		book[1] = new Science("양자컴퓨터","누군가",2025, 3);
		
		
		for(int i = 0; i < book.length; i++ ) {
			book[i].show();
		}
		
		
	}
}
