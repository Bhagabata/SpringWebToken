import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Loginform implements ActionListener{
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("user-ID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel MessageLabel = new JLabel("This is a Demo");
	HashMap<String,String> loginfo = new HashMap<String,String>();

Loginform(HashMap<String,String> loginfoOriginal){
	
     loginfo = loginfoOriginal;
     userIDLabel.setBounds(50,100,75,25);
     userPasswordLabel.setBounds(50,150,75,25);
     
     MessageLabel.setBounds(125,250,250,35);
     MessageLabel.setFont(new Font(null,Font.ITALIC,25));
     
     userIDField.setBounds(125,100,200,25);
     userPasswordField.setBounds(125,150,200,25);
     
     loginButton.setBounds(125,200,100,25);
     loginButton.setFocusable(false);
     loginButton.addActionListener(this);
     
     resetButton.setBounds(225,200,100,25);
     loginButton.setFocusable(false);
     resetButton.addActionListener(this);
     
     frame.add(userIDLabel);
     frame.add(userPasswordLabel);
     frame.add(MessageLabel);
     frame.add(userIDField);
     frame.add(userPasswordField);
     frame.add(loginButton);
     frame.add(resetButton);
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(420,420);
     frame.setLayout(null);
     frame.setVisible(true);
     frame.getContentPane().setBackground(Color.gray);
}
@Override
public void actionPerformed(ActionEvent e) {

	if(e.getSource()==resetButton) {
		userIDField.setText("");
		userPasswordField.setText("");
	}
	if(e.getSource()==loginButton) {
		String userID = userIDField.getText();
		String password = String.valueOf(userPasswordField.getPassword());
		
		if(loginfo.containsKey(userID)) {
			if(loginfo.get(userID).equals(password)) {
				MessageLabel.setForeground(Color.green);
				MessageLabel.setText("Login successful");
				frame.dispose();
				WelcomePage welcomePage = new WelcomePage(userID);
				
			}
			else {
				MessageLabel.setForeground(Color.red);
				MessageLabel.setText("Wrong Password!");
			}
		}
			else {
				MessageLabel.setForeground(Color.red);
				MessageLabel.setText("Username Not Found!");
			}
		
	}
}


}

