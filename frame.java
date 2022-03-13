/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author citrusoliversweet
 */
import javax.swing.JFrame;
import javax.swing.JPanel ;
import javax.swing.JButton ;
public class frame{
    frame()
    {
        JButton jb = new JButton("CLICK TO SAY HI") ;
        JPanel jp = new JPanel() ;
        JFrame jf = new JFrame() ;
        jf.setBounds(20, 20, 500, 500);
        jf.setTitle("Calculator");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jp.add(jb) ;
        jf.add(jp) ;
    }

    public static void main(String[] args)
    {
        frame ff = new frame() ;
    }
}
