import javax.swing.*;
import java.awt.*;

public class javaswing2 {
	
	JFrame jFrame1;
	
	javaswing2(){
		jFrame1 = new JFrame("Guess the character");
		
		JLabel label1 = new JLabel();
		label1.setText("I am Thinking of ");
		label1.setBounds(50, 35, 300, 50);
		label1.setFont(new Font("Verdana", Font.ITALIC, 25));
		label1.setForeground(Color.WHITE);
		
		String html = "<html>"
				      + "<img src=\""
				         + javaswing2.class.getResource("deathnote.jpg")
				         + "\">"
				         + "</html>";
		JLabel label2 = new JLabel(html);
		label2.setBounds(0,115,650,366);
		label2.setVisible(true);
		
		
		JLabel label3 = new JLabel(("<html><body><h4 class = \"Answer\" id = \"Answer\"><h1> Madara Uchiha </h1></body></html>"));
		label3.setFont(new Font("Verdana", Font.ITALIC, 25));
		label3.setBounds(350, 470, 300, 100);
		label3.setBackground(Color.WHITE);
		label3.setForeground(Color.RED);
		label3.setVisible(true);
		
		
		
		jFrame1.add(label1);
		jFrame1.add(label2);
		jFrame1.add(label3);
		jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame1.getContentPane().setBackground(Color.BLACK);
	    jFrame1.setLayout(null);
	    jFrame1.setSize(650,700);
	    jFrame1.setResizable(false);
	    jFrame1.setVisible(true);
	}
}
