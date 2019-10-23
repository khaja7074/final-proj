
import java.util.*;
import java.lang.*;
class Student
{
	int rollno;
	String name,address;
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno,name and address");
		rollno=ob.nextInt();name=ob.next();address=ob.next();
	}
	void display()
	{
	System.out.println("rollno :"+rollno+"name :"+name+" address :"+address);
	}
}



	class First extends Student
	{
		int m1,m2,m3,tot,avg;
		void input()
		{
			super.input();
			Scanner ob=new Scanner(System.in);
			System.out.println("enter 3 subjects marks");
			m1=ob.nextInt();m2=ob.nextInt();m3=ob.nextInt();
			tot=m1+m2+m3;
			avg=tot/3;
		}
		void display()
		{
			super.display();
			System.out.println("the total is "+tot);
			System.out.println("the average is "+avg);
		}
		public static void main(String args[]) 
		{
		First ob=new First();
		ob.input();
		ob.display();
		}
}