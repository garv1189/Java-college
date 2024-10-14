import java.util.*;
class e2p2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		int n=0,i=0,j=0,totalmarks=0;
		System.out.println("Enter the number of students");
		n = sc.nextInt();
		int Student[][]=new int [n][5];
		 int maxmarks=Student[0][0];
		 int maxRoll=0;
		for(i=0;i<n;i++)
		{	
			System.out.println("Enter the roll-number and the marks in three subjects");
			for(j=0;j<4;j++)
			{
				Student[i][j]=sc.nextInt();
				if(j!=0)
				totalmarks+=Student[i][j];
			}
			
			Student[i][4]=totalmarks;
			totalmarks=0;
			if(Student[i][4]>=maxmarks)
			{
				maxmarks = Student[i][4];
				maxRoll = Student[i][0];
			}
		}
		System.out.println("Roll-no\t\tSubject1\tSubject3\tSubject4\tTotalMarks");

		for(i=0;i<n;i++)
		{
			for(j=0;j<5;j++)
			{ 
				System.out.print(Student[i][j]+"\t\t");
			}
			System.out.println("");
		}
		System.out.println("The student with maximum marks is Roll-No "+maxRoll+" with total marks "+maxmarks);
	}
}
