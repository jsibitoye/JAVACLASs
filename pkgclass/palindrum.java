/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;
import java.util.*;
/**
 *
 * @author citrusoliversweet
 */
public class palindrum 
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Please input your text");
     String opu = sc.nextLine();
     int l= opu.length();
     l-=1;
     String name="";
     for (int i = l; i>=0; i--)
     {
         name= name + opu.charAt(i); 
     }
     System.out.println("Reading "+ opu+" from the right gives  :"+ name);
     if (name== opu)
     {
         System.out.println("Hence "+ opu+" is a palindromic word!!" );
     }
     else
     {
     System.out.println("Hence "+ opu+" is obviously not  a palindromic word!!" );
     }
    }
}
