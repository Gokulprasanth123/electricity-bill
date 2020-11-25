package electricity;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login  implements ActionListener{
JLabel l3;
JButton login_button,signup,create,calculate;
JTextField username,unit;
JPasswordField password;
JCheckBox showpassword;
JFrame l,k,m;
Login(){
JPanel heading;
//font
l=new JFrame();
Font f=new Font("serif",Font.BOLD, 30);

//heading

heading=new JPanel();
heading.setBackground(new Color(0,0,0,80));
heading.setBounds(0,0,1600,100);
JLabel name = new JLabel("LOGIN PAGE");
name.setForeground(Color.WHITE);
name.setBounds(200,80,400,50);
name.setFont(f);
heading.add(name);
l.setVisible(true);

//login panel

JPanel login=new JPanel();
login.setSize(400,350);
login.setBackground(new Color(0,0,0,60));
login.setBounds(580,225,400,350);
login.setLayout(null);
//label
JLabel user=new JLabel("username:");
user.setBounds(60,50,60,30);
user.setForeground(Color.WHITE);
login.add(user);
//username
username=new JTextField(16);
username.setBounds(50,90,300,30);
username.setBackground(new Color(180,125,120));
username.setForeground(Color.WHITE);
login.add(username);
//label
JLabel pass=new JLabel("password:");
pass.setBounds(60,120,60,30);
pass.setForeground(Color.WHITE);
login.add(pass);
//password
password=new JPasswordField(16);
password.setBounds(50,150,300,30);
password.setForeground(Color.WHITE);
password.setBackground(new Color(180,125,120));
login.add(password);
//show password
showpassword=new JCheckBox("show password");
showpassword.setBounds(50,190,130,30);
showpassword.setForeground(Color.WHITE);
showpassword.setBackground(new Color(180,125,120));
login.add(showpassword);
//signup button
signup=new JButton("sign up");
signup.setBounds(50,250,100,30);
signup.setBackground(new Color(180,152,145));
login.add(signup);
//login button
login_button=new JButton("login");
login_button.setBounds(250,250,100,30);
login_button.setBackground(new Color(180,152,145));
login.add(login_button);
//background image
ImageIcon background_image=new ImageIcon("C:\\Users\\LENOVO\\Downloads\\backg.jpg");
Image img=background_image.getImage();
Image temp=img.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
background_image=new ImageIcon(temp);
l3=new JLabel("",background_image,JLabel.CENTER);
l3.setBounds(0,0,1600,900);
l3.add(heading);
l3.add(login);
l.add(l3);
l.setLayout(null);
l.setSize(400,400);
l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
login_button.addActionListener(this);
signup.addActionListener(this);
showpassword.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==login_button)
	{
		String UserText;
		String PwdText;
		UserText=username.getText();
		PwdText=password.getText();
		if((UserText.equals("gokul"))&&(PwdText.equals("12345")))
        {
		 k=new JFrame();
		 Font f=new Font("serif",Font.BOLD, 30);

		//heading

		JPanel head=new JPanel();
		head.setBackground(new Color(0,0,0,80));
		head.setBounds(0,0,1600,100);
		JLabel nam = new JLabel("BILLING PAGE");
		nam.setForeground(Color.WHITE);
		nam.setBounds(200,80,400,50);
		nam.setFont(f);
		head.add(nam);
		k.setVisible(true);

		//Billing panel

		JPanel billing=new JPanel();
		billing.setSize(400,350);
		billing.setBackground(new Color(0,0,0,60));
		billing.setBounds(580,225,400,350);
		billing.setLayout(null);
		//label
		JLabel units=new JLabel("enter the units:");
		units.setBounds(60,50,180,30);
		units.setForeground(Color.WHITE);
		billing.add(units);
		//unit
		unit=new JTextField(16);
		unit.setBounds(50,90,300,30);
		unit.setBackground(new Color(180,125,120));
		unit.setForeground(Color.WHITE);
		billing.add(unit);
		//calculate button
		calculate =new JButton("calculate");
		calculate.setBounds(50,250,100,30);
		calculate.setBackground(new Color(180,152,145));
		billing.add(calculate);
		//background image
		ImageIcon background_imag=new ImageIcon("C:\\Users\\LENOVO\\Downloads\\backg.jpg");
		Image imag=background_imag.getImage();
		Image tem=imag.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
		background_imag=new ImageIcon(tem);
		JLabel k1=new JLabel("",background_imag,JLabel.CENTER);
		k1.setBounds(0,0,1600,900);
		k1.add(head);
		k1.add(billing);
		k.add(k1);
	     k.setSize(400,400);
	     k.setLayout(null);
	     calculate.addActionListener(this);
         
        }
        else
        {
        	JOptionPane.showMessageDialog(l,"login failed");	
        }
		
		
	}
	if(e.getSource()==calculate)
	{
		String units;
		units=unit.getText();
		if(units.equals("100"))
		{
			double voltage= 100*1.2;
			JOptionPane.showMessageDialog(k,""+voltage);
		}
	}
	if(e.getSource()==showpassword)
	{
		if(showpassword.isSelected())
		{
			password.setEchoChar((char)0);
		}
		else
		{
			password.setEchoChar('*');
		}
	}
	if(e.getSource()==signup)
	{
		m=new JFrame();
		 Font f=new Font("serif",Font.BOLD, 30);

		//heading

		JPanel headin=new JPanel();
		headin.setBackground(new Color(0,0,0,80));
		headin.setBounds(0,0,1600,100);
		JLabel sign = new JLabel("SIGN PAGE");
		sign.setForeground(Color.WHITE);
		sign.setBounds(200,80,400,50);
		sign.setFont(f);
		headin.add(sign);
		m.setVisible(true);

		//sign up  panel

		JPanel signPan=new JPanel();
		signPan.setSize(600,900);
		signPan.setBackground(new Color(0,0,0,60));
		signPan.setBounds(580,225,400,350);
		signPan.setLayout(null);
		//label
		JLabel conName=new JLabel("consumerName:");
		conName.setBounds(60,10,180,30);
		conName.setForeground(Color.WHITE);
		signPan.add(conName);
		//consumer name
		JTextField Cname=new JTextField(16);
		Cname.setBounds(50,40,300,30);
		Cname.setBackground(new Color(180,125,120));
		Cname.setForeground(Color.WHITE);
		signPan.add(Cname);
		//label
		JLabel consNum=new JLabel("consumer number:");
		consNum.setBounds(60,70,180,30);
		consNum.setForeground(Color.WHITE);
		signPan.add(consNum);
		//consumer number
		JTextField Cnum=new JTextField(16);
		Cnum.setBounds(50,100,300,30);
		Cnum.setBackground(new Color(180,125,120));
		Cnum.setForeground(Color.WHITE);
		signPan.add(Cnum);
		//label
		JLabel consAddr=new JLabel("consumer address:");
		consAddr.setBounds(60,133,180,30);
		consAddr.setForeground(Color.WHITE);
		signPan.add(consAddr);
		//address
		JTextArea add=new JTextArea(6,4);
		add.setBounds(50,160,300,30);
		add.setBackground(new Color(180,125,120));
		add.setForeground(Color.WHITE);
		signPan.add(add);
		//label
		JLabel conNumb=new JLabel("phone num:");
		conNumb.setBounds(60,190,180,30);
		conNumb.setForeground(Color.WHITE);
		signPan.add(conNumb);
		//phone number
		JTextField num=new JTextField(16);
		num.setBounds(50,215,300,30);
		num.setBackground(new Color(180,125,120));
		num.setForeground(Color.WHITE);
		signPan.add(num);
		//label
		JLabel pass2=new JLabel("password:");
		pass2.setBounds(60,240,60,30);
		pass2.setForeground(Color.WHITE);
		signPan.add(pass2);
		//password
		JPasswordField password1=new JPasswordField(16);
		password1.setBounds(50,270,300,30);
		password1.setForeground(Color.WHITE);
		password1.setBackground(new Color(180,125,120));
		signPan.add(password1);
		//create button
		create =new JButton("create");
		create.setBounds(50,310,100,30);
		create.setBackground(new Color(180,152,145));
		signPan.add(create);
		//background image
		ImageIcon background_imag=new ImageIcon("C:\\Users\\LENOVO\\Downloads\\backg.jpg");
		Image imag=background_imag.getImage();
		Image tem=imag.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
		background_imag=new ImageIcon(tem);
		JLabel k2=new JLabel("",background_imag,JLabel.CENTER);
		k2.setBounds(0,0,1600,900);
		k2.add(headin);
		k2.add(signPan);
		m.add(k2);
	     m.setSize(400,400);
	     m.setLayout(null);
	     create.addActionListener(this);
	}
	if(e.getSource()==create)
	{
		JOptionPane.showMessageDialog(m,"created");	
	}
}
public static void main(String args[]) throws Exception
{
	new Login();
	
}
}
