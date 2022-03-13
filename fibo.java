import java.util.*;
public class fibo
{
 int[] numar[][] = new int[2][2][2];
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" Please specify the kind of operation you will like to perform: ");
		//String[] v msg="press";
		System.out.println(" press 1  fo addition ");
		System.out.println(" press 2  fo subtraction ");
		System.out.println(" press 3  fo multiplication ");
		int op = input.nextInt();
		for(int i=1; i<=2; i++)
		{ 
		if (i==1)
			{char[] mat = " A ";}
		else
			{char[] mat= "B";}
			for(int i2=1; i2<=2; i2++)
			{	
			  for(int i3=1; i3<=2; i3++)
				{
					System.out.print("please supply Matrix "+ mat+i2+i3+" : ");
					numar[i2][i3] = input.nextInt();
				}
			}
		}
		switch(op)
		{
			case 1: System.out.println("welcom");
			break;
			case 2: System.out.println("welcom");
			break;
			case 3: System.out.println("welcom");
		}
	}
}