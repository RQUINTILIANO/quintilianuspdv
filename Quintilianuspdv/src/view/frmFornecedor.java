<<<<<<< HEAD
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
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;
	private JTextField txtID;

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

		txtNome = new JTextField();
		txtNome.setBounds(49, 121, 384, 20);
		contentPanel.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(49, 216, 231, 20);
		contentPanel.add(txtFone);
		txtFone.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(49, 317, 384, 20);
		contentPanel.add(txtEmail);
		txtEmail.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(49, 362, 89, 23);
		contentPanel.add(btnAdicionar);

		JButton btnEditar = new JButton("Editar");
		
		//==============CRUD Update -  Editar Fornecedor======================
		btnEditar.setBounds(188, 362, 89, 23);
		contentPanel.add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(338, 362, 89, 23);
		contentPanel.add(btnExcluir);

		JButton btnTodos = new JButton("Todos");
		btnTodos.setBounds(493, 362, 89, 23);
		contentPanel.add(btnTodos);

		txtID = new JTextField();
		txtID.setBounds(49, 58, 255, 20);
		contentPanel.add(txtID);
		txtID.setColumns(10);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(49, 33, 46, 14);
		contentPanel.add(lblId);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(446, 120, 89, 23);
		contentPanel.add(btnBuscar);
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
	} // fim construtor

	// LIMPAR CAMPOS
	void limparCampos() {
		txtID.setText(null);
		txtNome.setText(null);
		txtFone.setText(null);
		txtEmail.setText(null);
		txtNome.requestFocus();
	}

}// fim do código
=======
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
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;
	private JTextField txtID;

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

		txtNome = new JTextField();
		txtNome.setBounds(49, 121, 384, 20);
		contentPanel.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(49, 216, 231, 20);
		contentPanel.add(txtFone);
		txtFone.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(49, 317, 384, 20);
		contentPanel.add(txtEmail);
		txtEmail.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(49, 362, 89, 23);
		contentPanel.add(btnAdicionar);

		JButton btnEditar = new JButton("Editar");
		
		//==============CRUD Update -  Editar Fornecedor======================
		btnEditar.setBounds(188, 362, 89, 23);
		contentPanel.add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(338, 362, 89, 23);
		contentPanel.add(btnExcluir);

		JButton btnTodos = new JButton("Todos");
		btnTodos.setBounds(493, 362, 89, 23);
		contentPanel.add(btnTodos);

		txtID = new JTextField();
		txtID.setBounds(49, 58, 255, 20);
		contentPanel.add(txtID);
		txtID.setColumns(10);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(49, 33, 46, 14);
		contentPanel.add(lblId);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(446, 120, 89, 23);
		contentPanel.add(btnBuscar);
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
	} // fim construtor

	// LIMPAR CAMPOS
	void limparCampos() {
		txtID.setText(null);
		txtNome.setText(null);
		txtFone.setText(null);
		txtEmail.setText(null);
		txtNome.requestFocus();
	}

}// fim do código
>>>>>>> b7e6e85 (260826)
