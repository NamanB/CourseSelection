package classPicker;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassPicker {

	private JFrame frame;
	private JTextField id;
	private JTextField txtName;
	private JTextField txtGrade_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassPicker window = new ClassPicker();
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
	public ClassPicker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1292, 676);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(15, 16, 313, 617);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 16, 319, 588);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 16, 283, 95);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		id = new JTextField();
		id.setBackground(SystemColor.info);
		id.setEditable(false);
		id.setBounds(15, 52, 253, 26);
		panel_1.add(id);
		id.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setBounds(15, 16, 253, 20);
		panel_1.add(lblStudentId);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 127, 289, 445);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(15, 227, 69, 20);
		panel_3.add(lblName);
		
		txtName = new JTextField();
		txtName.setBackground(SystemColor.info);
		txtName.setEditable(false);
		txtName.setBounds(99, 224, 146, 26);
		panel_3.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setBounds(15, 263, 69, 20);
		panel_3.add(lblGrade);
		
		txtGrade_1 = new JTextField();
		txtGrade_1.setBackground(SystemColor.info);
		txtGrade_1.setEditable(false);
		txtGrade_1.setBounds(99, 266, 146, 26);
		panel_3.add(txtGrade_1);
		txtGrade_1.setColumns(10);
		
		JPanel Picture = new JPanel();
		Picture.setBounds(15, 16, 190, 195);
		panel_3.add(Picture);
	}

}
