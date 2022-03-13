/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author citrusoliversweet
 */

public class StudentResults {
    
    static String Full_name ;
    private String Exam_name ;
    private String Exam_grade ;
    
    StudentResults st = new StudentResults() ;
    
    public StudentResults()
    {
        
    }
    
    public void  FullName  (String aName)
    {
        String name = aName ;
      //  StudentResults st = new StudentResults() ;
        Full_name = name ;
        System.out.println("My full name is " + name ) ;
    }
    public static void main(String[] args)
    {
        Full_name = "Sunday" ;
        FullName("sun") ;
       // st.Exam_name = "reytui" ;
        Integer y = Integer.parseInt("200") ;
    }
    
}
