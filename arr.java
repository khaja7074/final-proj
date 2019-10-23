import java.util.*;
import java.lang.*;
class arr
{
public static void main(String args[])
{
int a[]=new int[5];

int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 array elements");

for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the five numbers are");
for(i=0;i<5;i++)
System.out.println(a[i]);
}
}


