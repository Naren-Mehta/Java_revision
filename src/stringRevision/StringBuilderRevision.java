package stringRevision;

public class StringBuilderRevision {
	public static void main(String[] args) {
		
		
		StringBuilder s1 = new StringBuilder("test");
		System.out.println(s1);
		
		StringBuilder s2 = s1.append(" test again");
		
		System.out.println(s1 + " " + s2);
		System.out.println(s1 == s2);
	}
}
