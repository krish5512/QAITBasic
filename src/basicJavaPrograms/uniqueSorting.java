package basicJavaPrograms;

public class uniqueSorting {

	public static void main(String[] args) {

		String input = "malayalam";
		
		int n = input.length();
		int i;
		int start = 0;
		int end = n-1;
		int middle = (start + end)/2;
		
		for( i = 0 ; i <= middle; i++ )
		{
			if(input.charAt(start) == input.charAt(end))
			{
				start++;
				end--;
			}
			else
			{
				break;
			}
		}
		
		if(i == middle+1)
		{
			System.out.println("The string is palindrome");
					}
		else
		{
			System.out.println("The string is not palindrome");
			
		}
		
		
	}

}
