package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmFornecedor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmFornecedor dialog = new frmFornecedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmFornecedor() {
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBounds(49, 106, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Fone:");
			lblNewLabel_1.setBounds(49, 202, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("E-mail:");
			lblNewLabel_2.setBounds(49, 300, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		
		textField = new JTextField();
		textField.setBounds(49, 121, 384, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(49, 216, 231, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(49, 317, 384, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(49, 362, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(188, 362, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(338, 362, 89, 23);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Todos");
		btnNewButton_3.setBounds(493, 362, 89, 23);
		contentPanel.add(btnNewButton_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(49, 58, 255, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(49, 33, 46, 14);
		contentPanel.add(lblId);
		
		JButton btnNewButton_4 = new JButton("Buscar");
		btnNewButton_4.setBounds(446, 120, 89, 23);
		contentPanel.add(btnNewButton_4);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
