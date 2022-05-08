import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing extends JFrame {
	 JButton button;
     JFrame jFrame;
     JLabel label;
    public javaswing()
    {
        jFrame = new JFrame("Guess the character");
        
        ImageIcon image = new ImageIcon("start.jpg");
    	label = new JLabel();
    	label.setIcon(image);
    	label.setBounds(150,30,300,300);
    	label.setVisible(true);
    	
    	
        //for start button
        button=new JButton("Start");
        button.setBounds(400,550,150,30);
        button.setBackground(Color.cyan);
        button.setBorderPainted(true);
        button.setOpaque(true);
        button.setFont(new Font("Verdana", Font.ITALIC, 18));
        


        //for intro text
        JLabel L = new JLabel(("<html><body>Hi I am Viru sahastra bhudhi<br>I can read your mind<br>Answer simple questions in YES or NO <br>I will guess the character you are thinking of<br><br>Give it a try!!!!!!</body></html>"));
        L.setFont(new Font("Verdana", Font.ITALIC, 18));
        L.setBounds(85,350,400,175);
        L.setForeground(Color.RED);
        jFrame.add(L);



        //for jFrame Don't touch this code
        jFrame.add(button);
        jFrame.add(label);
        jFrame.getContentPane().setBackground(Color.BLACK);
        jFrame.setLayout(null);
        jFrame.setSize(650,700);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }
}