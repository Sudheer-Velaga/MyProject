import java.util.Scanner;
class  HealthCheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you feeling fever(true\false)");
		boolean b1=sc.nextBoolean();
		System.out.println("Are you feeling cold(true\false)");
		boolean b2=sc.nextBoolean();
		if(b1||b2)
		{
			System.out.println("Your health is not good goto hospital");
		}
		else
		{
			System.out.println("Your health is  good goto college");
		}
	}
}
