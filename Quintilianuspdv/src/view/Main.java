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
		setTitle("Fornecedores");
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
		btnFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFornecedor fornecedor = new frmFornecedor();
				fornecedor.setVisible(true);
			}
		});
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
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (8).png")));
		lblNewLabel_5.setBounds(83, 9, 67, 64);
		panel_3_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Sem Estoque");
		lblNewLabel_10_1_1.setForeground(Color.PINK);
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10_1_1.setBounds(148, 33, 155, 29);
		panel_3_1.add(lblNewLabel_10_1_1);

		JPanel panel_3_2_3 = new JPanel();
		panel_3_2_3.setBounds(307, 440, 1164, 312);
		contentPane.add(panel_3_2_3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.PINK);
		panel_2_1.setBounds(285, 0, 1211, 88);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);

		lblData = new JLabel("");
		lblData.setBounds(1009, 30, 142, 36);
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_1.add(lblData);

		JLabel lblCalendario_icon = new JLabel("");
		lblCalendario_icon.setBounds(939, 0, 74, 77);
		lblCalendario_icon.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (7).png")));
		panel_2_1.add(lblCalendario_icon);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (16).png")));
		lblNewLabel_9.setBounds(28, 19, 64, 47);
		panel_2_1.add(lblNewLabel_9);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblDashboard.setBackground(new Color(255, 153, 153));
		lblDashboard.setBounds(102, 11, 303, 44);
		panel_2_1.add(lblDashboard);
		
		JLabel lblNewLabel_1_1 = new JLabel("Visão geral do seu negócio");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 205));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(102, 51, 284, 26);
		panel_2_1.add(lblNewLabel_1_1);

		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(698, 107, 362, 143);
		contentPane.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(50, 11, 64, 64);
		lblNewLabel_4.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (10).png")));
		panel_3_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_10_1 = new JLabel("Estoque Baixo");
		lblNewLabel_10_1.setForeground(Color.PINK);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10_1.setBounds(124, 33, 179, 29);
		panel_3_1_1.add(lblNewLabel_10_1);

		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBounds(307, 107, 362, 143);
		contentPane.add(panel_3_1_2);
		panel_3_1_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (9).png")));
		lblNewLabel_3.setBounds(51, 11, 64, 64);
		panel_3_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_10 = new JLabel("Produtos");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setForeground(Color.PINK);
		lblNewLabel_10.setBounds(135, 33, 142, 29);
		panel_3_1_2.add(lblNewLabel_10);

		JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setBounds(307, 273, 362, 143);
		contentPane.add(panel_3_1_2_1);
		panel_3_1_2_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (17).png")));
		lblNewLabel_6.setBounds(51, 21, 64, 69);
		panel_3_1_2_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_10_2 = new JLabel("Vendas Hoje");
		lblNewLabel_10_2.setForeground(Color.PINK);
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10_2.setBounds(126, 38, 200, 29);
		panel_3_1_2_1.add(lblNewLabel_10_2);

		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBounds(698, 273, 362, 143);
		contentPane.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (12).png")));
		lblNewLabel_7.setBounds(53, 23, 64, 64);
		panel_3_1_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Itens vendidos hoje");
		lblNewLabel_10_2_1.setForeground(Color.PINK);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10_2_1.setBounds(116, 40, 246, 29);
		panel_3_1_1_1.add(lblNewLabel_10_2_1);

		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setBounds(1098, 273, 373, 143);
		contentPane.add(panel_3_1_3);
		panel_3_1_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Main.class.getResource("/img/Sem nome (64 x 64 px) (14).png")));
		lblNewLabel_8.setBounds(63, 24, 64, 64);
		panel_3_1_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10_2_1_1 = new JLabel("Faturamento hoje");
		lblNewLabel_10_2_1_1.setForeground(Color.PINK);
		lblNewLabel_10_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10_2_1_1.setBounds(137, 40, 246, 29);
		panel_3_1_3.add(lblNewLabel_10_2_1_1);
		
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
