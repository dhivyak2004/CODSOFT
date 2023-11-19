import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField txtnum2;
	private JTextField txtnum1;
	private JTextField txtnum3;
	private JTextField txtnum4;
	private JTextField txtnum5;
	private JTextField txtavg;
	private JTextField txttot;
	private JTextField txtgrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 863, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), null, null, null));
		panel.setBounds(28, 26, 789, 602);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(347, 149, 152, 28);
		panel.add(txtnum2);
		txtnum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" Sub 1 Mark");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(160, 90, 115, 28);
		panel.add(lblNewLabel);
		
		JLabel lblSubMark = new JLabel(" Sub 2 Mark");
		lblSubMark.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubMark.setBounds(160, 145, 115, 28);
		panel.add(lblSubMark);
		
		JLabel lblSubMark_1 = new JLabel(" Sub 3 Mark");
		lblSubMark_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubMark_1.setBounds(160, 197, 115, 28);
		panel.add(lblSubMark_1);
		
		JLabel lblSubMark_2 = new JLabel(" Sub 4 Mark");
		lblSubMark_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubMark_2.setBounds(160, 249, 115, 28);
		panel.add(lblSubMark_2);
		
		JLabel lblSubMark_3 = new JLabel(" Sub 5 Mark");
		lblSubMark_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubMark_3.setBounds(160, 309, 115, 28);
		panel.add(lblSubMark_3);
		
		txtnum1 = new JTextField();
		txtnum1.setColumns(10);
		txtnum1.setBounds(347, 94, 152, 28);
		panel.add(txtnum1);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(347, 205, 152, 28);
		panel.add(txtnum3);
		
		txtnum4 = new JTextField();
		txtnum4.setColumns(10);
		txtnum4.setBounds(347, 257, 152, 28);
		panel.add(txtnum4);
		
		txtnum5 = new JTextField();
		txtnum5.setColumns(10);
		txtnum5.setBounds(347, 313, 152, 28);
		panel.add(txtnum5);
		
		txtavg = new JTextField();
		txtavg.setColumns(10);
		txtavg.setBounds(347, 452, 152, 28);
		panel.add(txtavg);
		
		txttot = new JTextField();
		txttot.setColumns(10);
		txttot.setBounds(347, 384, 152, 28);
		panel.add(txttot);
		
		txtgrade = new JTextField();
		txtgrade.setColumns(10);
		txtgrade.setBounds(347, 525, 152, 28);
		panel.add(txtgrade);
		
		JLabel lblSubMark_3_1 = new JLabel("Total");
		lblSubMark_3_1.setForeground(new Color(255, 0, 0));
		lblSubMark_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubMark_3_1.setBounds(160, 384, 115, 28);
		panel.add(lblSubMark_3_1);
		
		JLabel lblSubMark_3_2 = new JLabel("Average");
		lblSubMark_3_2.setForeground(new Color(255, 0, 0));
		lblSubMark_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubMark_3_2.setBounds(160, 452, 115, 28);
		panel.add(lblSubMark_3_2);
		
		JLabel lblSubMark_3_3 = new JLabel("Grade");
		lblSubMark_3_3.setForeground(new Color(255, 0, 0));
		lblSubMark_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubMark_3_3.setBounds(160, 525, 115, 28);
		panel.add(lblSubMark_3_3);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int m1=Integer.parseInt(txtnum1.getText());
				int m2=Integer.parseInt(txtnum2.getText());
				int m3=Integer.parseInt(txtnum3.getText());
				int m4=Integer.parseInt(txtnum4.getText());
				int m5=Integer.parseInt(txtnum5.getText());
				int tot=m1+m2+m3+m4+m5;
				
				double avg=tot/5;
				
				if(avg>85) {
					txtgrade.setText("A");
				}
				else if(avg>75) {
					txtgrade.setText("B");
				}
				else if(avg>60) {
					txtgrade.setText("C");
				}
				else if(avg>45) {
					txtgrade.setText("D");
				}
				else  {
					txtgrade.setText("E");
				}
				
				txttot.setText(String.valueOf(tot));
				txtavg.setText(String.valueOf(avg));
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(601, 149, 115, 47);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtnum1.setText("");
				txtnum2.setText("");
				txtnum3.setText("");
				txtnum4.setText("");
				txtnum5.setText("");
				txttot.setText("");
				txtavg.setText("");
				txtgrade.setText("");
				txtnum1.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(601, 274, 115, 47);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnExit.setBounds(601, 411, 115, 63);
		panel.add(btnExit);
		
		JLabel lblStudentMarksCalculator = new JLabel("   Student Marks Calculator");
		lblStudentMarksCalculator.setForeground(new Color(0, 0, 255));
		lblStudentMarksCalculator.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblStudentMarksCalculator.setBounds(228, 21, 397, 28);
		panel.add(lblStudentMarksCalculator);
	}
}
