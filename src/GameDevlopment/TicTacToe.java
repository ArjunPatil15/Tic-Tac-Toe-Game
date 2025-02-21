package GameDevlopment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;
	private JTextField txtPlayerX;
	private JTextField txtPlayerO;
	private JFrame f1;
	
	int xCount;
	int oCount;
	int btnCount;
	
	private String initString = "X";
	
	int b1=2;
	int b2=2;
	int b3=2;
	int b4=2;
	int b5=2;
	int b6=2;
	int b7=2;
	int b8=2;
	int b9=2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void switchPlayers() {
		if(initString.equalsIgnoreCase("X")) {
			initString = "O";
		}else {
			initString = "X";
		}
	}
	
	void checkWin() {
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b4==1 && b5==1 && b6==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b1==7 && b8==1 && b9==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b1==1 && b4==1 && b7==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b2==1 && b5==1 && b8==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b3==1 && b6==1 && b9==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b1==1 && b5==1 && b9==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b3==1 && b5==1 && b7==1) {
			JOptionPane.showMessageDialog(f1,"Player X Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
		}else if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b4==0 && b5==0 && b6==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b7==0 && b8==0 && b9==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b1==0 && b4==0 && b7==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b3==0 && b6==0 && b9==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b1==0 && b5==0 && b9==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else  if(b3==0 && b5==0 && b7==0) {
			JOptionPane.showMessageDialog(f1,"Player O Wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtPlayerO.setText(String.valueOf(oCount));
		}else if(btnCount==9) {
			JOptionPane.showMessageDialog(f1,"No Body Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.red);
					b1=1;
				}else {
					btn1.setForeground(Color.orange);
					b1=0;
				}
				
				switchPlayers();
				checkWin();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(initString);
				btnCount++;
				
				
				if(initString.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.red);
					b2=1;
				
				}else {
					btn2.setForeground(Color.orange);
					b2=0;
				}
				
				switchPlayers();
				checkWin();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.red);
					b3=1;
				}else {
					b3=0;
					btn3.setForeground(Color.orange);
				}
				
				switchPlayers();
				checkWin();
		
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtPlayerX = new JTextField();
		txtPlayerX.setText("0");
		txtPlayerX.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(txtPlayerX, BorderLayout.CENTER);
		txtPlayerX.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.red);
					b4=1;
				}else {
					btn4.setForeground(Color.orange);
					b4=0;
				}
				
				switchPlayers();
				checkWin();
						
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.red);
					b5=1;
				}else {
					btn5.setForeground(Color.orange);
					b5=0;
				}
				
				switchPlayers();
				checkWin();
						
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.red);
					b6=1;
				}else {
					btn6.setForeground(Color.orange);
					b6=0;
				}
				
				switchPlayers();
				checkWin();
						
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Player O");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		txtPlayerO = new JTextField();
		txtPlayerO.setText("0");
		txtPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayerO.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_10.add(txtPlayerO, BorderLayout.CENTER);
		txtPlayerO.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.red);
					b7=1;
				}else {
					b7=0;
					btn7.setForeground(Color.orange);
				}
				
				switchPlayers();
				checkWin();
		
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 80));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.red);
					b8=1;
				}else {
					btn8.setForeground(Color.orange);
					b8=0;
				}
				
				switchPlayers();
				checkWin();
						
			}
		});
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(initString);
				btnCount++;
				
				if(initString.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.red);
					b9=1;
				}else {
					btn9.setForeground(Color.orange);
					b9=0;
				}
				
				switchPlayers();
				checkWin();
						
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				
				initString= "X";
				
				b1=b2=b3=b4=b5=b6=b7=b8=b9=2;
				
				btnCount= 0;
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(f1,"Do you want to exit ?","TicTacToe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setForeground(new Color(255, 0, 0));
		panel_15.add(btnExit, BorderLayout.CENTER);
		frame.setForeground(new Color(255, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\arjun\\OneDrive\\Desktop\\GDG\\genai.PNG"));
		frame.setTitle("TicTacToe");
		frame.setBounds(350, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
