package basicJavaPrograms;

public class reverseOfString {

	public static void main(String[] args) {

		String input = "krishna is a good boy";
		int i;
		String reverseString="";
		int stringLength = input.length();
		for (i = stringLength-1;i>=0;i--)
		{
			reverseString = reverseString + input.charAt(i);
		}
		System.out.println(reverseString);
	}

}
