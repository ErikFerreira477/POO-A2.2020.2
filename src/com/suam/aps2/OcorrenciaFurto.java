package com.suam.aps2;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo{
	
	private int valorRoubado;

	public int getValorRoubado() {
		return valorRoubado;
	}

	@Override
	public void informaValorRoubado(int ValorRoubado) {
		this.valorRoubado = ValorRoubado;
	}

	@Override
	public String exibeInfoOcorrencia() {
		String msg = "";
		msg += "OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() + "\n";	
		msg += "NOME DA VÍTIMA: " + this.getNomeVitima() + "\n";
		msg += "DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() + "\n";
		msg += "VALOR ROUBADO: " + this.getValorRoubado();
		
		return msg;
	}
}