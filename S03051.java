package jump_to_java;

public class S03051 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		sb.insert(0,  "hello");
		System.out.println(sb.toString());
		
		
		StringBuffer sb = new StringBuffer():
		sb.append("Hello jump to java");
		sb.delete(6, 11);
		System.out.println(sb.toString());
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello jump to java");
		System.out.println(sb.substring(0,4));
	}
}
