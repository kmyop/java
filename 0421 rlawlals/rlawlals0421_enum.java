package rlawlals0421;
import java.util.HashSet;

public class rlawlals0421_enum {
	public class Sample {
	    enum CoffeeType {
	        AMERICANO,
	        ICE_AMERICANO,
	        CAFE_LATTE
	    };

	    public static void main(String[] args) {
	        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
	        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
	        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력
	        
	        
	            for(CoffeeType type: CoffeeType.values()) {
	                System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
	                
	                
	       }
	    }
	}
}
