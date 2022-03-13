/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author citrusoliversweet
 */
import java.util.Scanner ;
public class Mummy {
    static int aa,bb ;
    public static void main(String[] arg)
    {
        initial() ;
    }
    public static void initial()
    {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("To add press 1, To subtract press 2, To multiply press 3, To divide press 4, To get modulus press 5");
        int op = scan.nextInt() ;
        System.out.println("Enter first num") ;
         aa = scan.nextInt() ;
        System.out.println("Enter second num") ;
         bb = scan.nextInt() ; 
         oper(op) ;
    }
    public static void oper(int opp)
    {
        if (opp == 1)
        {
             System.out.println( add(aa,bb) );
        }
        else if (opp == 2)
        {
           System.out.println( sub(aa,bb) );
        }
        System.out.println("Do you wish to continue ? Y FOR YES , N FOR NO ");
        Scanner scan2 = new Scanner(System.in) ;
        String st = scan2.next() ;
        if (st.equals("Y"))
        {
            initial() ;
        }
    }
    public static int add (int a , int b)
    {
        return a + b ;
    }
    public static int sub (int a , int b)
    {
        return a - b ;
    }
    public int div (int a , int b)
    {
        return a / b ;
    }
    
}
