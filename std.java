import java.lang.*;
import java.util.*;
class std

{

String name;
int total;
float avg;
int s1,s2,s3;
void input()
{

Scanner sc=new Scanner(System.in);

System.out.println("enter your roll number");
int roll=sc.nextInt();
System.out.println("enter your subject1 marks");
int s1=sc.nextInt();
System.out.println("enter your subject2 marks");
int s2=sc.nextInt();
System.out.println("enter your subject3 marks ");
int s3=sc.nextInt();
total=s1+s2+s3;
avg=total/3;
}
void display()
{

System.out.println("total marks are===" +total);

System.out.println("average of three subjects ===" +avg);
if(avg>75)
{
System.out.println("first division");
} 
else if(avg>55)
{
System.out.println("second division");

}
else
{ 
System.out.println("fail");
}
}
public static void main(String args[])
{
std s=new std();
s.input();
s.display();

}
}


