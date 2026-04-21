package rlawlals0421;

public class rlawlals0421_gudqusghks5 {
	public class Sample {
	    public static void main(String[] args) {
	        int n1 = 123;
	        double d1 = n1;  // 정수를 실수로 바꿀 때는 캐스팅이 필요없다.
	        System.out.println(d1);  // 123.0 출력

	        double d2 = 123.456;
	        int n2 = (int) d2; // 실수를 정수로 바꿀 때는 반드시 정수형으로 캐스팅해야 한다.
	        System.out.println(n2);  // 소수점이 제거된 123 출력
	    }
	}


}
