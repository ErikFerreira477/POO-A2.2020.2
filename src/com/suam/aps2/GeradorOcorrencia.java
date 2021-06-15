package com.suam.aps2;

import javax.swing.JOptionPane;

public class GeradorOcorrencia{
	
	private static String getMenu() {
		String menu;
		menu = "O que voc� deseja fazer?\n1- Fazer um BO de um Latroc�nio\n2 - Fazer um BO de um Furto\n3 - Fazer um BO de um Homic�dio";
		return menu;
	}
	
	public static void main(String[] args){
	
		int escolha;
		try {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(getMenu()));
			switch(escolha) {
			case 1:
				OcorrenciaLartoc�nio larto = new OcorrenciaLartoc�nio();
				
				larto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				larto.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				larto.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorrencia"));
				larto.informaLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
				larto.informaValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
				
				JOptionPane.showMessageDialog(null, larto.exibeInfoOcorrencia());
				break;
			case 2:
				OcorrenciaFurto furt = new OcorrenciaFurto();
				
				furt.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				furt.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				furt.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorrencia"));	
				furt.informaValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
				JOptionPane.showMessageDialog(null, furt.exibeInfoOcorrencia());
				break;
			case 3:
				OcorrenciaHomic�dio homi = new OcorrenciaHomic�dio();
				
				homi.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrencia")));
				homi.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vitima"));			
				homi.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorrencia"));
				homi.informaLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
				
				JOptionPane.showMessageDialog(null, homi.exibeInfoOcorrencia());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
				break;
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Usu�rio entrou com um dado inv�lido, o programa ser� fechado");
		}
	}
}