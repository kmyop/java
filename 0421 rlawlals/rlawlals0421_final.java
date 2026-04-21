package rlawlals0421;
import java.util.ArrayList;
import java.util.Arrays;

public class rlawlals0421_final {
	public class Sample {
	    public static void main(String[] args) {
	        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
	        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
	    }
	}


}
