import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frame;
	private JTextField textField_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Password Generator (@oguzhannx)");
		frame.setBounds(100, 100, 482, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_UpperCase = new JLabel("Upper Cases:");
		lbl_UpperCase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_UpperCase.setBounds(10, 10, 248, 44);
		frame.getContentPane().add(lbl_UpperCase);

		JRadioButton radio_Upper = new JRadioButton("");
		radio_Upper.setBounds(264, 10, 43, 44);
		frame.getContentPane().add(radio_Upper);

		JLabel lbl_lowerCase = new JLabel("Lower Case");
		lbl_lowerCase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_lowerCase.setBounds(10, 60, 248, 44);
		frame.getContentPane().add(lbl_lowerCase);

		JRadioButton radio_Lower = new JRadioButton("");
		radio_Lower.setBounds(264, 60, 43, 44);
		frame.getContentPane().add(radio_Lower);

		JLabel lbl_Digits = new JLabel("Digits:");
		lbl_Digits.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Digits.setBounds(10, 110, 248, 44);
		frame.getContentPane().add(lbl_Digits);

		JRadioButton radio_Digits = new JRadioButton("");
		radio_Digits.setBounds(264, 110, 43, 44);
		frame.getContentPane().add(radio_Digits);

		JLabel lbl_Punctuation = new JLabel("Punctuation:");
		lbl_Punctuation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Punctuation.setBounds(10, 160, 248, 44);
		frame.getContentPane().add(lbl_Punctuation);

		JRadioButton radio_Punctuation = new JRadioButton("");
		radio_Punctuation.setBounds(264, 160, 43, 44);
		frame.getContentPane().add(radio_Punctuation);

		JLabel lbl_Length = new JLabel("Length:");
		lbl_Length.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Length.setBounds(10, 214, 248, 44);
		frame.getContentPane().add(lbl_Length);

		JSpinner lengthCounter = new JSpinner();
		lengthCounter.setBounds(264, 214, 43, 44);
		frame.getContentPane().add(lengthCounter);

		textField_Password = new JTextField();
		textField_Password.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		textField_Password.setBounds(39, 290, 385, 61);
		frame.getContentPane().add(textField_Password);
		textField_Password.setColumns(10);

		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassworGenerator passworGenerator = new PassworGenerator(radio_Upper.isSelected(),
						radio_Lower.isSelected(), radio_Digits.isSelected(), radio_Punctuation.isSelected(),(int)lengthCounter.getValue());
				 textField_Password.setText(passworGenerator.Generate());
				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(317, 214, 141, 44);
		frame.getContentPane().add(btnNewButton);
	}

}
