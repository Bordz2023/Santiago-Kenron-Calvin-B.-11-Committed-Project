import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class FrameLogin extends JFrame {

	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/facebook.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(FrameLogin.class.getResource("res/user.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(FrameLogin.class.getResource("res/lock.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_log_in = new ImageIcon(FrameLogin.class.getResource("res/sign-in-alt.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_logo_2 = new ImageIcon(FrameLogin.class.getResource("res/facebook.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(175, 218, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconPassword.setBounds(0, 0, 46, 40);
		lblIconPassword.setIcon(new ImageIcon(img_password));
		panel.add(lblIconPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(48, 11, 170, 20);
		panel.add(txtPassword);
		txtPassword.setEchoChar((char)0);
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
		      if(txtPassword.getText().equals("Password")) {
				txtPassword.setEchoChar('●');
				txtPassword.setText("");
		      }
		      else {
		    	  txtPassword.selectAll();
		      }
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Courier New", Font.BOLD, 14));
		txtPassword.setText("Password");
		
		JPanel panel_1 = new JPanel();
		panel_1.addFocusListener(new FocusAdapter() {
			
			}
		);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(175, 167, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconUsername.setBounds(0, 0, 46, 40);
		lblIconUsername.setIcon(new ImageIcon(img_username));
		panel_1.add(lblIconUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(49, 11, 170, 20);
		panel_1.add(txtUsername);
		txtUsername.setText("Username");
		txtUsername.addFocusListener(new FocusAdapter() {
			
			
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Username");
			}
			    }
			}
	    );
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Courier New", Font.BOLD, 14));
		txtUsername.setColumns(10);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("Kenron") && txtPassword.getText().equals("Unggoy")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") ||
				        txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requirements!");
				}
				else {
					lblLoginMessage.setText("Invalid Username or Password.");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground( Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(Color.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(Color.DARK_GRAY);
			}
		});
		pnlBtnLogin.setBackground(Color.GRAY);
		pnlBtnLogin.setBounds(175, 298, 250, 50);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOG IN");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel.setBounds(98, 11, 53, 28);
		pnlBtnLogin.add(lblNewLabel);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setBounds(216, 0, 53, 50);
		pnlBtnLogin.add(lblIconLogin);
		lblIconLogin.setIcon(new ImageIcon(img_log_in));
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
					FrameLogin.this.dispose();
					
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(570, 11, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(175, 35, 250, 112);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(175, 269, 250, 18);
		contentPane.add(lblLoginMessage);
		
		JLabel lblIconLogo2 = new JLabel("");
		lblIconLogo2.setBounds(10, 0, 20, 28);
		contentPane.add(lblIconLogo2);
		lblIconLogo2.setIcon(new ImageIcon(img_logo_2));
		
		JLabel lblNewLabel_1 = new JLabel("Facebook");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 10));
		lblNewLabel_1.setBounds(26, 0, 60, 28);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}