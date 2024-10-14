import java.util.*;
class Student
{
	private int id,p,c,m,t;
	private String name;	
	public void accept()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Enter marks in phy,chem and maths");
		p=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		t=p+c+m;
	}
	public boolean greater(Student s)
	{
		if(t<s.t) return true;
		return false;
	}
	public void disp()
	{
		System.out.println(id+"\t"+name+"\t"+p+"\t"+c+"\t"+m+"\t"+t);
	}
}
class e5p5
{
	public static void main(String args[])
	{	
		int i,j;
		Student temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		Student s[]= new Student[n];
		for(i=0;i<n;i++)
		{
			s[i]= new Student();
			s[i].accept();
		}

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(s[i].greater(s[j+1]))
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}	
	
		System.out.println("ID"+"\t"+"Name"+"\t"+"Phy"+"\t"+"Chem"+"\t"+"Maths"+"\t"+"Tot");
		
		for(i=0;i<n;i++)
		{
			s[i].disp();
		}
	}
}
