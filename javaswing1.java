import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class javaswing1 extends JFrame {
	JFrame jFrame;
	JLabel label;
	
	javaswing1(){
	jFrame = new JFrame("Guess the character");
	
	int x = (int) (Math.random()*6+1);
	
	if(x==1) {
	ImageIcon image1 = new ImageIcon("sasuke.jpg");
	label = new JLabel();
	label.setIcon(image1);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==2) {
	ImageIcon image2 = new ImageIcon("deathnote.jpg");
	label = new JLabel();
	label.setIcon(image2);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==3) {
	ImageIcon image3 = new ImageIcon("onepiece.jpg");
	label = new JLabel();
	label.setIcon(image3);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==4) {
	ImageIcon image4 = new ImageIcon("jujutsukaisen.jpg");
	label = new JLabel();
	label.setIcon(image4);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==5) {
	ImageIcon image5 = new ImageIcon("levi.jpg");
	label = new JLabel();
	label.setIcon(image5);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==6) {
	ImageIcon image6 = new ImageIcon("kgf.jpg");
	label = new JLabel();
	label.setIcon(image6);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	if(x==7) {
	ImageIcon image7 = new ImageIcon("moneyheist.jpg");
	label = new JLabel();
	label.setIcon(image7);
	label.setBounds(0,0,650,366);
	label.setVisible(true);
	}
	
	JLabel L = new JLabel(("<html><body><h2 class = \"Question\" id = \"Question\"> Question Content: What is the of the character in the Game in the class of the world</h2></body></html>"));
    L.setFont(new Font("Verdana", Font.ITALIC, 100));
    L.setBounds(50,375,500,150);
    L.setForeground(Color.WHITE);
    
    
	JButton Yes=new JButton("Yes");
    Yes.setBounds(20,560,125,30);
    Yes.setBackground(new Color(0x3d8c40));
    Yes.setForeground(Color.WHITE);
    Yes.setBorderPainted(true);
    Yes.setOpaque(true);
    Yes.setFont(new Font("Verdana", Font.ITALIC, 18));
    
    JButton Probably=new JButton("Probably");
    Probably.setBounds(165,560,125,30);
    Probably.setBackground(new Color(0xffff00));
    Probably.setForeground(Color.BLACK);
    Probably.setBorderPainted(true);
    Probably.setOpaque(true);
    Probably.setFont(new Font("Verdana", Font.ITALIC, 18));
    
    JButton No=new JButton("No");
    No.setBounds(315,560,125,30);
    No.setBackground(new Color(0x2a9df4));
    No.setForeground(Color.WHITE);
    No.setBorderPainted(true);
    No.setOpaque(true);
    No.setFont(new Font("Verdana", Font.ITALIC, 18));
    
    JButton dont=new JButton("Dont't know");
    dont.setBounds(460,560,150,30);
    dont.setBackground(new Color(0xff595e));
    dont.setForeground(Color.WHITE);
    dont.setBorderPainted(true);
    dont.setOpaque(true);
    dont.setFont(new Font("Verdana", Font.ITALIC, 18));
    
    
    
    jFrame.add(label);
    jFrame.add(L);
    jFrame.add(Yes);
    jFrame.add(No);
    jFrame.add(dont);
    jFrame.add(Probably);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFrame.getContentPane().setBackground(Color.BLACK);
    jFrame.setLayout(null);
    jFrame.setSize(650,700);
    jFrame.setResizable(false);
    jFrame.setVisible(true);
	}
}

