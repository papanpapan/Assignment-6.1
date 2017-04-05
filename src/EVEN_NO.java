import java.util.Scanner;
public class EVEN_NO {
	
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the all elements");
		int a[]=new int[10];
		

		for(int i=1;i<10;i++)
		{
			a[i]= s1.nextInt();
		}
		System.out.print("Even Numbers :");
		for(int i=1;i<10;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}

		

	}

}
