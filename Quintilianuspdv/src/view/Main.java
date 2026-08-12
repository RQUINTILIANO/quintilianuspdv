package view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnProdutos;
	private JButton btnPdv;
	private JButton btnVendas;
	private JButton btnSair;
	private JButton btnSobre;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Uso da biblioteca FlatLat (Deixar mais moderno)
		FlatLightLaf.setup();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/japdv.png")));
		setResizable(false);
		setTitle("Quintilianus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1512, 1068);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 181));
		panel.setBounds(0, 0, 286, 774);
		contentPane.add(panel);
		panel.setLayout(null);

		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 80, 79);
		panel.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (1).png")));

		JLabel lblNewLabel = new JLabel("Quintilianus-PDV");
		lblNewLabel.setBackground(new Color(255, 153, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 153, 153));
		lblNewLabel.setBounds(75, 11, 201, 44);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sistema de PDV");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(84, 49, 110, 26);
		panel.add(lblNewLabel_1);

		JButton btnFornecedores = new JButton("FORNECEDORES");
		btnFornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFornecedores.setBackground(Color.WHITE);
		btnFornecedores.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFornecedores.setForeground(Color.PINK);
		btnFornecedores.setHorizontalAlignment(SwingConstants.LEFT);
		btnFornecedores.setIcon(new ImageIcon(Main.class.getResource("/img/2.png")));
		btnFornecedores.setBounds(10, 101, 252, 81);
		panel.add(btnFornecedores);

		btnProdutos = new JButton("PRODUTOS");
		btnProdutos.setBackground(Color.WHITE);
		btnProdutos.setHorizontalAlignment(SwingConstants.LEFT);
		btnProdutos.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (2).png")));
		btnProdutos.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnProdutos.setForeground(new Color(255, 175, 175));
		btnProdutos.setBounds(10, 194, 252, 79);
		panel.add(btnProdutos);

		btnPdv = new JButton("PDV");
		btnPdv.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPdv.setForeground(new Color(255, 175, 175));
		btnPdv.setBackground(Color.WHITE);
		btnPdv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPdv.setBounds(10, 284, 252, 81);
		panel.add(btnPdv);

		btnVendas = new JButton("VENDAS");
		btnVendas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVendas.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (3).png")));
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVendas.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnVendas.setForeground(Color.PINK);
		btnVendas.setBackground(Color.WHITE);
		btnVendas.setBounds(10, 376, 252, 81);
		panel.add(btnVendas);

		btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?",
						"Confirmar saída", JOptionPane.YES_NO_OPTION);
				// Apoio ao entendimento da lógica
				System.out.println(resposta);
				if (resposta == 0) {
					System.exit(0); // encerrar o sistema
				}
			}
		});
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (4).png")));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSair.setBackground(Color.WHITE);
		btnSair.setForeground(Color.PINK);
		btnSair.setBounds(10, 468, 252, 81);
		panel.add(btnSair);

		JLabel lblNewLabel_2 = new JLabel("_________________________________");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.PINK);
		lblNewLabel_2.setBounds(10, 560, 252, 33);
		panel.add(lblNewLabel_2);

		btnSobre = new JButton("SOBRE");
		btnSobre.setHorizontalAlignment(SwingConstants.LEFT);
		//Ativar a tela sobre
		//Sobre sobre = new sobre();
		//sobre.setVisible(true);
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (5).png")));
		btnSobre.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSobre.setBackground(Color.WHITE);
		btnSobre.setForeground(Color.PINK);
		btnSobre.setBounds(10, 614, 252, 81);
		panel.add(btnSobre);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(1098, 107, 373, 143);
		contentPane.add(panel_3_1);

		JPanel panel_3_2_3 = new JPanel();
		panel_3_2_3.setBounds(307, 440, 1164, 323);
		contentPane.add(panel_3_2_3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.PINK);
		panel_2_1.setBounds(285, 0, 1211, 88);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);

		lblData = new JLabel("");
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblData.setBounds(1009, 30, 142, 36);
		panel_2_1.add(lblData);

		JLabel lblCalendario_icon = new JLabel("");
		lblCalendario_icon.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (7).png")));
		lblCalendario_icon.setBounds(939, 0, 74, 77);
		panel_2_1.add(lblCalendario_icon);

		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(698, 107, 362, 143);
		contentPane.add(panel_3_1_1);

		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBounds(307, 107, 362, 143);
		contentPane.add(panel_3_1_2);

		JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setBounds(307, 273, 362, 143);
		contentPane.add(panel_3_1_2_1);

		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBounds(698, 273, 362, 143);
		contentPane.add(panel_3_1_1_1);

		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setBounds(1098, 273, 373, 143);
		contentPane.add(panel_3_1_3);
		
		JPanel panel_3_2_3_1 = new JPanel();
		panel_3_2_3_1.setBounds(0, 774, 1496, 255);
		contentPane.add(panel_3_2_3_1);

		// para iniciar centralizar
		setLocationRelativeTo(null);

		// Iniciar com a tela cheia
		//setExtendedState(JFrame.MAXIMIZED_BOTH);

		atualizarData();

	} // fim do construtor

	// Função (método) para atualizar data do sistema
	private void atualizarData() {
		// Obtem a data do sistema operacional
		LocalDate hoje = LocalDate.now();
		// Formatar data dia/mes/ano(4 digitos)
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Alterar o texto de lblData
		lblData.setText(hoje.format(formato));
	}
}
