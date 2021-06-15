package com.suam.aps2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txb_num;
	private JTextField txb_nome;
	private JTextField txb_desc;
	private JTextField txb_local_valor;
	private JTextField txb_valor;

	/**
	 * Launch the application.
	 */
	private int escolha;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void limpaSelecao() {
		txb_num.setText("");
		txb_nome.setText("");
		txb_desc.setText("");
		txb_local_valor.setText("");
		txb_valor.setText("");
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEMA DE CONTROLE DE OCORRENCIA POLICIAL");
		lblNewLabel.setBounds(22, 11, 629, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
	
		txb_num = new JTextField();
		txb_num.setVisible(false);
		txb_num.setBounds(221, 141, 430, 20);
		txb_num.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(txb_num);
		txb_num.setColumns(10);
		
		JLabel lbl_num = new JLabel("Numero da ocorrencia: ");
		lbl_num.setVisible(false);
		lbl_num.setBounds(22, 144, 168, 14);
		lbl_num.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lbl_num);
		
		JLabel lbl_nome = new JLabel("Nome da vitima:");
		lbl_nome.setVisible(false);
		lbl_nome.setBounds(22, 179, 168, 14);
		lbl_nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lbl_nome);
		
		txb_nome = new JTextField();
		txb_nome.setVisible(false);
		txb_nome.setBounds(221, 176, 430, 20);
		txb_nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txb_nome.setColumns(10);
		contentPane.add(txb_nome);
		
		JLabel lbl_desc = new JLabel("Descri\u00E7\u00E3o da ocorrencia:");
		lbl_desc.setVisible(false);
		lbl_desc.setBounds(22, 213, 178, 14);
		lbl_desc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lbl_desc);
		
		txb_desc = new JTextField();
		txb_desc.setVisible(false);
		txb_desc.setBounds(221, 210, 430, 20);
		txb_desc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txb_desc.setColumns(10);
		contentPane.add(txb_desc);
		
		JLabel lbl_local_valor = new JLabel("Local do assassinato:");
		lbl_local_valor.setVisible(false);
		lbl_local_valor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_local_valor.setBounds(22, 248, 178, 14);
		contentPane.add(lbl_local_valor);
		
		JLabel lbl_valor = new JLabel("Valor roubado:");
		lbl_valor.setVisible(false);
		lbl_valor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_valor.setBounds(22, 283, 178, 14);
		contentPane.add(lbl_valor);
		
		txb_local_valor = new JTextField();
		txb_local_valor.setVisible(false);
		txb_local_valor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txb_local_valor.setColumns(10);
		txb_local_valor.setBounds(221, 245, 430, 20);
		contentPane.add(txb_local_valor);
		
		txb_valor = new JTextField();
		txb_valor.setVisible(false);
		txb_valor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txb_valor.setColumns(10);
		txb_valor.setBounds(221, 280, 430, 20);
		contentPane.add(txb_valor);
		
		JButton btn_ok = new JButton("OK");
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					switch(escolha) {
					case 1:
						OcorrenciaLartocínio larto = new OcorrenciaLartocínio();
						
						larto.setNumero(Integer.parseInt(txb_num.getText()));
						larto.setNomeVitima(txb_nome.getText());			
						larto.setDescricaoOcorrencia(txb_desc.getText());
						larto.informaLocalAssassinato(txb_local_valor.getText());
						larto.informaValorRoubado(Integer.parseInt(txb_valor.getText()));
						
						JOptionPane.showMessageDialog(null, larto.exibeInfoOcorrencia());
						limpaSelecao();
						break;
					case 2:
						OcorrenciaFurto furt = new OcorrenciaFurto();
						
						furt.setNumero(Integer.parseInt(txb_num.getText()));
						furt.setNomeVitima(txb_nome.getText());			
						furt.setDescricaoOcorrencia(txb_desc.getText());
						furt.informaValorRoubado(Integer.parseInt(txb_local_valor.getText()));
						limpaSelecao();
						JOptionPane.showMessageDialog(null, furt.exibeInfoOcorrencia());
						break;
					case 3:
						OcorrenciaHomicídio homi = new OcorrenciaHomicídio();
						
						homi.setNumero(Integer.parseInt(txb_num.getText()));
						homi.setNomeVitima(txb_nome.getText());			
						homi.setDescricaoOcorrencia(txb_desc.getText());
						homi.informaLocalAssassinato(txb_local_valor.getText());
											
						JOptionPane.showMessageDialog(null, homi.exibeInfoOcorrencia());
						limpaSelecao();
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida");
						break;
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Usuário entrou com um dado inválido, o programa será fechado");
					limpaSelecao();
				}
			}
		});
		
		
		JButton btn_morte = new JButton("HOMICIDIO");
		btn_morte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolha = 3;
				lbl_num.setVisible(true);
				txb_num.setVisible(true);
				lbl_nome.setVisible(true);
				txb_nome.setVisible(true);
				lbl_desc.setVisible(true);
				txb_desc.setVisible(true);
				lbl_local_valor.setVisible(true);
				lbl_local_valor.setText("Local do assassinato:");
				txb_local_valor.setVisible(true);
				lbl_valor.setVisible(false);	
				txb_valor.setVisible(false);
				btn_ok.setVisible(true);
				limpaSelecao();
			}
			
		});
		btn_morte.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_morte.setBounds(466, 67, 155, 54);
		contentPane.add(btn_morte);
		
		btn_ok.setVisible(false);
		btn_ok.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ok.setBounds(259, 311, 155, 54);
		contentPane.add(btn_ok);
		
		JButton btn_roubo = new JButton("ROUBO");
		btn_roubo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolha = 2;
				lbl_num.setVisible(true);
				txb_num.setVisible(true);
				lbl_nome.setVisible(true);
				txb_nome.setVisible(true);
				lbl_desc.setVisible(true);
				txb_desc.setVisible(true);
				lbl_local_valor.setVisible(true);
				lbl_local_valor.setText("Valor roubado:");
				txb_local_valor.setVisible(true);
				lbl_valor.setVisible(false);	
				txb_valor.setVisible(false);
				btn_ok.setVisible(true);
				
				limpaSelecao();
				
			}
		});
		btn_roubo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_roubo.setBounds(259, 67, 155, 54);
		contentPane.add(btn_roubo);

		
		JButton btn_latro = new JButton("LATROCINIO");
		btn_latro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolha = 1;
				lbl_num.setVisible(true);
				txb_num.setVisible(true);
				lbl_nome.setVisible(true);
				txb_nome.setVisible(true);
				lbl_desc.setVisible(true);
				txb_desc.setVisible(true);
				lbl_local_valor.setVisible(true);
				lbl_local_valor.setText("Local do assassinato:");
				txb_local_valor.setVisible(true);
				lbl_valor.setVisible(true);	
				txb_valor.setVisible(true);
				btn_ok.setVisible(true);
				limpaSelecao();
			}
		});
		btn_latro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_latro.setBounds(52, 67, 155, 54);
		contentPane.add(btn_latro);
	}
}
