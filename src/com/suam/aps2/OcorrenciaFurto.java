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
		msg += "OCORR�NCIA DE FURTO N�MERO: " + this.getNumero() + "\n";	
		msg += "NOME DA V�TIMA: " + this.getNomeVitima() + "\n";
		msg += "DESCRI��O DA OCORR�NCIA: " + this.getDescricaoOcorrencia() + "\n";
		msg += "VALOR ROUBADO: " + this.getValorRoubado();
		
		return msg;
	}
}