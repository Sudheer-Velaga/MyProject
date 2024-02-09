import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name :");
		String name = sc.next();
		System.out.println("Enter Science Marks :");
		int science = sc.nextInt();
		System.out.println("Enter Social Marks :");
		int social = sc.nextInt();
		System.out.println("Enter Maths Marks :");
		int maths = sc.nextInt();
		int total,avg;
		total = social + science + maths;
		avg = total / 3;
		char grade = ' ';
		if(avg>=70)
		{
			grade = 'A';
		}
		else if (avg>=60 && avg<70)
		{
			grade = 'B';
		}
		else if (avg>=50 && avg<60)
		{
			grade = 'C';
		}
		else if (avg>=35 && avg<50)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		System.out.println("Hey "+name+"\nyour total marks "+total+"\naverage "+avg+"\ngrade is "+grade);
		sc.close();
	}
}
