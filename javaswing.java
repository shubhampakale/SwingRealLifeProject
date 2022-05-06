import javax.swing.*;
import java.awt.*;

public class javaswing extends JFrame {

     JFrame jFrame;
    public javaswing()
    {
        jFrame = new JFrame("Guess the character");

        //for start button
        JButton next=new JButton("Start");
        next.setBounds(450,300,100,20);
        next.setBackground(Color.cyan);
        next.setBorderPainted(true);
        next.setOpaque(true);
        next.setFont(new Font("Verdana", Font.ITALIC, 18));
        jFrame.add(next);


        //for intro text
        JLabel L = new JLabel(("<html><body>Hi I am Viru sahastra bhudhi<br>I can read your mind<br>Answer simple questions in YES or NO <br>I will guess the character you are thinking of<br><br>Give it a try!!!!!!</body></html>"));
        L.setFont(new Font("Verdana", Font.ITALIC, 15));
        L.setBounds(50,100,400,150);
        L.setForeground(Color.RED);
        jFrame.add(L);




        //for jFrame Don't touch this code
        jFrame.getContentPane().setBackground(Color.BLACK);
        jFrame.setLayout(null);
        jFrame.setSize(600,400);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }


    public static void main(String[] args) {

        new javaswing();

    }
}


