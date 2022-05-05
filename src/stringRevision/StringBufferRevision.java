package stringRevision;

public class StringBufferRevision {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("GeeksForGeeks");
		System.out.println(s);

		StringBuffer s2 = s.append("this is test this is test this is test this is test this is test");
		System.out.println(s == s2);
		System.out.println(s + " " + s2);

		String s3 = new String(s2);
		System.out.println(s3.getClass());

		System.out.println(s2.length());
		System.out.println(s2.capacity());

		System.out.println(s2.delete(5, 10));
		System.out.println(s2.deleteCharAt(0));
	}

}
