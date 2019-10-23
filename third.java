import java.lang.*;
import java.util.*;
class third

{
public static void main(String args[])
{
System.out.println("enter three numbers");
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a>b && a>c)
{
System.out.println("a is big");
}
else if (b>c && b>a)
{
System.out.println("b is big");
}
else
{

System.out.println("c is big");
}
}
}