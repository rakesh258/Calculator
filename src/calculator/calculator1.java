package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator1 {

	private JFrame frame;
	private JTextField Num1;
	private JTextField textField_1;
	private JTextField Num2;
	private JTextField Ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator1 window = new calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1 = new JTextField();
		Num1.setBounds(26, 11, 172, 40);
		frame.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 47, 172, -32);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(234, 11, 162, 40);
		frame.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,ans;
				try{
				number1 = Integer.parseInt(Num1.getText());	
				number2 = Integer.parseInt(Num2.getText());	
				ans = number1+number2;
				Ans.setText(Integer.toString(ans));
				
				
				
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,"plz enter the valid number");
					
				}
			}
		});
		btnNewButton.setBounds(36, 111, 148, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,ans;
				try{
				number1 = Integer.parseInt(Num1.getText());	
				number2 = Integer.parseInt(Num2.getText());	
				ans = number1-number2;
				Ans.setText(Integer.toString(ans));
				
				
				
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,"plz enter the valid number");
					
				}	
			}
		});
		btnNewButton_1.setBounds(36, 172, 148, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		Ans = new JTextField();
		Ans.setBounds(249, 153, 147, 50);
		frame.getContentPane().add(Ans);
		Ans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("     THE ANSWER IS:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(234, 94, 179, 24);
		frame.getContentPane().add(lblNewLabel);
	}

}
