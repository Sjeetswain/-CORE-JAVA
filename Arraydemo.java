import java.util.*;
class Arraydemo
{
 	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int a[]={10,20,30};
		int []b=new int[]{40,50,60};
		int c[]=new int[4];
		c[0]=70;
		c[1]=80;
		c[2]=90;
		c[3]=100;
		int d[]=new int[4];
		System.out.println("Enter values...");
		for(int i=0;i<4;i++)
		{
			int y=sc.nextInt();
			d[i]=y;
					
		}
		System.out.println("First array...");
		for(int i=0;i<3;i++)
			System.out.println(a[i]);
	

		System.out.println("second array...");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	
		System.out.println("Third array...");
		for(int x:c)
			System.out.println(x);
		
		System.out.println("fourth array...");
		for(int z:d)
			System.out.println(z);
		
		


	}
}
	