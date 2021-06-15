package com.suam.aps2;

public class OcorrenciaLartoc�nio extends OcorrenciaPolicial implements Roubo, Morte{
	
	private int valorRoubado;
	private String localAssassinato;
	
	public int getValorRoubado() {
		return valorRoubado;
	}
	public String getLocalAssassinato() {
		return localAssassinato;
	}
	
	@Override
	public void informaLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
		
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
		msg += "LOCAL DO ASSASSINATO: " + this.getLocalAssassinato() + "\n";
		msg += "VALOR ROUBADO: " + this.getValorRoubado();
		
		return msg;
	}
}