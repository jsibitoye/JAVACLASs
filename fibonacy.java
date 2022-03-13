/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.*;
public class fibonacy
{
       tak t= new tak();
	public static void main(String[] args)
	{       
		Scanner input = new Scanner(System.in);
		System.out.println(" Please specify the kind of operation you will like to perform: ");
		//String[] v msg="press";
		System.out.println(" press 1  fo addition ");
		System.out.println(" press 2  fo subtraction ");
		System.out.println(" press 3  fo multiplication ");
		int op = input.nextInt();
               // 
                char opt;
		switch(op)
		{
			case 1: tak.take('+');
			break;
			case 2: tak.take('-');
			break;
			case 3: tak.take('*');
		}
	}
}
 
class tak
{
  public static void take(char opp)
    { 
       int A[][]= new int[2][2]; 
       int B[][] = new int[2][2];
       int C[][] = new int[2][2];
       Scanner input = new Scanner(System.in);
       for(int i=1; i<=2; i++)
		{
                    int c1= 0, c2=0;  
			for(int i2=0; i2<=1; i2++)
			{	
                            c1++;
			  for(int i3=0; i3<=1; i3++)
				{ 
                                    c2++;
                                     if (i==1)
                                     {
                                         System.out.print("please supply Matrix A" + c1+c2+" : ");
					int gba = input.nextInt();
                                        System.out.println();
                                        A[i2][i3] =gba;
                                     }
                                     else if(i==2)
                                        {
                                          System.out.print("please supply Matrix B" + c1+c2+" : ");
                                          int gba = input.nextInt();
                                          System.out.println();
                                          B[i2][i3] =gba;
                                        }
					
				}
                          c2=0;
			}
		}
    for (int ie=0; ie<=1; ie++)
    {
      for (int ii=0; ii<=1; ii++)
       { 
         switch(opp)
           {
             case '+':{C[ie][ii]=A[ie][ii] - B[ie][ii];} break;
             case '-':{C[ie][ii]=A[ie][ii] - B[ie][ii];} break;
             case '*':
             {
                int kk =0;
                  for (int i=0; i<=1;i++)
                  {
                  for (int j=0; j<=1; j++)
                  {
                        kk++;
                        int cc =1;
                        switch (kk)
                        {
                         case 1:{ C[i][j]=(A[i][j]*B[i][j])+(A[i][cc]*B[cc][i]);} break;
                         case 2:{ C[i][j]=(A[i][j]*B[j][j])+(A[i][i]*B[i][j]);} break;
                         case 3:{ C[i][j]=(A[i][j]*B[j][j])+(A[i][i]*B[i][j]);} break;
                         case 4:{ cc =0;
                                C[i][j] =(A[i][cc]*B[cc][i])+(A[cc][i]*B[i][j]);
                                }
                         }
                   }
                }
           
             }
           }
       }
    }
    for (int i=0; i<=1;i++)
       {
         for (int j=0; j<=1; j++)
           {
               if(j==1)
               { System.out.println("\t" + C[i][j]+"      ");
               System.out.println();
               }
              else
               {System.out.print("\t" + C[i][j]+"      ");
           }
       }
   }
}