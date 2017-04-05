import java.util.Scanner;
public class Prime_No {
public static void main(String[] args) {
	System.out.println("Enter the all elements :");
	Scanner s1=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=0;i<10;i++)
	{
		a[i]=s1.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		boolean flag=true;
		for(int j=2;j<i;j++)
		{
			if(a[i]%j==0)
			{
				flag=false;
				break;
			}
			if(flag==true)
			{
				System.out.print("Prime_No :");
				System.out.print(i+" ");
			}
		}
	}
}
}


	

	


