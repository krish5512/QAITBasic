package basicJavaPrograms;

public class basicCodes {

	public static void main(String[] args) {
		int i,j,z,temp=1;
		int x=1;		
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i<=4)
				{
				if(j==i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
				}
				else
				{
					if(j==i-x)
					{
						System.out.print(j);
						x=x+2;
					}
					else
					{
						System.out.print(" ");
					}
					
				}
			}
			System.out.print("\n");
		}

	}

}
