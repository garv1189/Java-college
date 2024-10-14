import java.util.*;
import java.io.*;

class Greatest1
{ 
	Scanner sc = new Scanner(System.in);
	void get_data(int n)
	{
		int a[]= new int [n];
		for(int i =0;i<n;i++)
		{
			System.out.println(								"Enter element atposition"+i);
			a[i]=sc.nextInt();
		}
	}
	void greatest_num(int n)
	{
		int a[]= new int [n];
		int greatest=a[0];
		for(int j=0;j<n;j++)
		{
			if (a[j]>greatest)
			greatest = a[j];
		}
	}

class calc_greatest
{ 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int c = sc.nextInt();
		greatest1 g = new greatest1();
		g.get_data(c);
		g.greatest_num(c);
	}//main
}//class