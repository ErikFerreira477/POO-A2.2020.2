package com.suam.aps2;

public class OcorrenciaLartocínio extends OcorrenciaPolicial implements Roubo, Morte{
	
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
		msg += "OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() + "\n";	
		msg += "NOME DA VÍTIMA: " + this.getNomeVitima() + "\n";
		msg += "DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() + "\n";
		msg += "LOCAL DO ASSASSINATO: " + this.getLocalAssassinato() + "\n";
		msg += "VALOR ROUBADO: " + this.getValorRoubado();
		
		return msg;
	}
}