package com.suam.aps2;

import javax.swing.JOptionPane;

public class GeradorOcorrencia{
	
	private static String getMenu() {
		String menu;
		menu = "O que você deseja fazer?\n1- Fazer um BO de um Latrocínio\n2 - Fazer um BO de um Furto\n3 - Fazer um BO de um Homicídio";
		return menu;
	}
	
	public static void main(String[] args){
	
		int escolha;
		try {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(getMenu()));
			switch(escolha) {
			case 1:
				OcorrenciaLartocínio larto = new OcorrenciaLartocínio();
				
				larto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				larto.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				larto.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrencia"));
				larto.informaLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
				larto.informaValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
				
				JOptionPane.showMessageDialog(null, larto.exibeInfoOcorrencia());
				break;
			case 2:
				OcorrenciaFurto furt = new OcorrenciaFurto();
				
				furt.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				furt.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				furt.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrencia"));	
				furt.informaValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
				JOptionPane.showMessageDialog(null, furt.exibeInfoOcorrencia());
				break;
			case 3:
				OcorrenciaHomicídio homi = new OcorrenciaHomicídio();
				
				homi.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				homi.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				homi.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrencia"));
				homi.informaLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
				
				JOptionPane.showMessageDialog(null, homi.exibeInfoOcorrencia());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Usuário entrou com um dado inválido, o programa será fechado");
		}
	}
}