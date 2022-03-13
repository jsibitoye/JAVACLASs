/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;
import java.util.Scanner;

/**
 *
 * @author citrusoliversweet
 */
public class Oper {

    /**
     * @param args the command line arguments
     */
    static int e,f;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        operate();
        Scanner scan = new Scanner(System.in);
        System.out.println("To perform another operation press 6");
        int opt = scan.nextInt();
        if(opt == 6)
        {
             operate();
        }
        
        
    }
    
    static void operate()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        e = scan.nextInt();
        System.out.println("Input the second number");
        f = scan.nextInt();
        
        System.out.println("To add press 1, To subtract press 2, To multiply press 3, To divide press 4, To get modulus press 5");
        int optn = scan.nextInt();
        if(optn == 1)
        {
            add();
            return;
        }
        if(optn == 2)
        {
            sub();
            return;
        }
        if(optn == 3)
        {
            mul();
            return;
        }
        if(optn == 4)
        {
            div();
            return;
        }
        if(optn == 5)
        {
            mod();
            //return;
        }
        
        else
        {
            System.out.println("Incorrect option");
            System.out.println("To perform another operation press 6");
        }
    }
    
    static void add()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int x = scan.nextInt();
        if(x<2)
        {
            System.out.println("You cant add less than two numbers");
            return;
        }
        //else
        //{
            System.out.println("Input the first number");
            int a = scan.nextInt();
            int i = 2;
            int c = a;
            while(i<=x)
            {
                System.out.println("Input the next number");
                int b = scan.nextInt();
                c = c + b; 
                i++;
            }
            System.out.println("The sum is " + c);
        //}
    }
    
    static void sub()
    {
        int c = e-f;
        System.out.println("The difference between "+e+" and " +f+" is " + c);
    }
    static void mul()
    {
        int c = e*f;
        System.out.println("The product of "+e+" and " +f+" is " + c);
    }
    static void div()
    {
        float c = e/f;
        System.out.println("The division of "+e+" by " +f+" is " + c);
    }
    static void mod()
    {
        int c = e%f;
        System.out.println(e+" modulus " +f+" is " + c);
    }
    
}
