package stringRevision;

public class StringRevise {

	public static void main(String args[]) {

		/*
		 * Strings in Java are objects that are backed internally by char array Since
		 * array are immutable(cannot grow), String are immutable as well. Whenever a
		 * change to a String is made, an entirely new String is created.
		 */

		// 1. String as a Literal and Object will be created in String constant pool
		String s1 = "Hello";

		// 2. String via new operator i.e. dynamically allocated .
		// (assigned a new memory in a HEAP)
		// This string will not be added to String constant pool.

		String s2 = new String("Hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
//		If you want to store this string in the constant pool then you will need to “intern” it.
		String internedString = s2.intern();
		System.out.println("after intern =>" + (internedString == s1));
		
		Class c = s2.getClass();
		
		while(c != null) {
			System.out.println(c + " " +c.getName());
			c = c.getSuperclass();
		}
	}

}
