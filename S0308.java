package jump_to_java;
import java.util.HashMap;

public class S0308 {
	public static void main(String[] args) {
		HashMap<String, String> map =new HashMap<>();
		map.put("people","사람");
		map.put("baseball","야구");
		System.out.println(map.keySet());
		//System.out.println(map.remove("people")); // "사람" 출력
		System.out.println(map.size());
		System.out.println(map.containsKey("people"));  // true 출력
        System.out.println(map.get("people")); // "사람" 출력
	}
}
