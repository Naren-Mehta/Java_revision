import java.lang.reflect.Method;

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

		while (c != null) {
			System.out.println(c + " " + c.getName());
			c = c.getSuperclass();
		}

		char chArr[] = { 'a', 'b', 'c', 'd' };
		String newtr = new String(chArr);
		System.out.println(newtr);

		String test = "This is a new test";
		System.out.println(test.length()); // 18
		System.out.println(test.charAt(5)); // i
		System.out.println(test.substring(5, 13)); // is a new
		System.out.println(test.concat(" appended at end")); // This is a new test appended at end
		System.out.println(test);

		test = "This is new test that has test and test and test and all type of test.";
		System.out.println(test.indexOf("test"));
		System.out.println(test.lastIndexOf("test"));

		String str1 = "helloword";
		String str2 = "HelloWord";
		String str3 = "HELLOWORD";

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));

		String str4 = "Geeks", str5 = "forGeeks";

		System.out.println(str4.compareTo(str5));
		System.out.println("a".compareTo("b"));
		System.out.println("a".compareTo("a"));
		System.out.println("b".compareTo("a"));
		
		System.out.println("b".compareTo("B"));
		
		System.out.println("b".compareToIgnoreCase("B"));
		
		System.out.println("hello".compareTo("HELLO"));
		System.out.println("hello".compareToIgnoreCase("HELLO"));

		
		System.out.println("hello".toUpperCase());
		System.out.println("HELLO".toLowerCase());
		
		System.out.println("    hello     ".trim());
		
		System.out.println("hello".replace('l', '_'));
		
		
		
//		Class cls = StringBuffer.class;
//		Method[] methods = cls.getDeclaredMethods();
//		
//		var index = 0;
//		for(Method method : methods) {
//			index++;
//			System.out.println(index +" "+ method.getName());
//		}
		

	}

}
