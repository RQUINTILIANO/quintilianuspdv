package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.FornecedorController;
//importar o 
import model.Fornecedores;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frmFornecedor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textNome;
	private JTextField textFone;
	private JTextField textEmail;
	private JTextField textID;

	private FornecedorController controller;
	private Fornecedores fornecedor;

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
		setResizable(false);
		setTitle("Fonerncedores");
		setBounds(100, 100, 640, 480);
		
		//criar objeto controller
		//controller = new FornecedorController(); //SINTAXE MODERNA
		controller = new FornecedorController();
		//criar obj fornecedor
		fornecedor = new Fornecedores();
		
		//iniciar centralizado
		//setLocalRelative
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
			JLabel lblFone = new JLabel("Fone:");
			lblFone.setBounds(49, 202, 46, 14);
			contentPanel.add(lblFone);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("E-mail:");
			lblNewLabel_2.setBounds(49, 300, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}

		textNome = new JTextField();
		textNome.setBounds(49, 121, 384, 20);
		contentPanel.add(textNome);
		textNome.setColumns(10);

		textFone = new JTextField();
		textFone.setBounds(49, 216, 231, 20);
		contentPanel.add(textFone);
		textFone.setColumns(10);

		textEmail = new JTextField();
		textEmail.setBounds(49, 317, 384, 20);
		contentPanel.add(textEmail);
		textEmail.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Enviar o objeto para o controller
				
				FornecedorController controller = new FornecedorController();
				try {
					// CRUD create
					// Transferir os dados da tela para o objeto
					fornecedor.setNome(textNome.getText());
					fornecedor.setFone(textFone.getText());
					fornecedor.setEmail(textEmail.getText());
                    //enviar objeto para controller
					controller.adicionar(fornecedor);
					//Mensagem de confirmação
					JOptionPane.showMessageDialog(null,"Fornecedor adicionado com sucesso.");
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		btnAdicionar.setBounds(49, 362, 89, 23);
		contentPanel.add(btnAdicionar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(191, 362, 89, 23);
		contentPanel.add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(338, 362, 89, 23);
		contentPanel.add(btnExcluir);

		JButton btnTodos = new JButton("Todos");
		btnTodos.setBounds(493, 362, 89, 23);
		contentPanel.add(btnTodos);

		textID = new JTextField();
		textID.setBounds(49, 58, 255, 20);
		contentPanel.add(textID);
		textID.setColumns(10);

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
	}
}
