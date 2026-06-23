package rlawlals0623;

class Member {
	String name;
	int point;
	//생성자
	Member(String n, int p) {
		name = n;
		point = p;
	}
	
	//showInfo()메소드: 이름 포인트 출력 입력X 
	void showInfo() {
		System.out.println(name + "회원 정보");
	}
	//showInfo()메소드 오버로드: 입력O, 포인트 적립함
	void showInfo(int addPoint) {
		System.out.println("총 포인트: "+ (point + addPoint));
	}
}

class VIPMember extends Member{
	double discountRate;
	
	
	VIPMember(String n, int p, double d) {
		super(n,p);
		discountRate = d;
		
	}
	//showInfo() 메소드: 이름+VIP 회원 정보 출력
	void showInfo() {
		System.out.println(name +" VIP 회원 정보");
	}
	void useCoupon(int price) {
		System.out.println((int)(price*discountRate)+ "원 할인");
	}
}

public class MemberManager {
	public static void main(String[] args) {
		//VIPMember 객체 생성 => 이름: smart, 포인트:2500, 할인율: 0.15
		VIPMember member = new VIPMember("smart", 25000, 0.15);
		member.showInfo(); // smart " VIP 회원 정보"
		member.showInfo(500); // "총 포인트: " 25500
		member.useCoupon(30000); // 4500원 할인
		
	}
}
