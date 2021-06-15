package com.suam.aps2;

public class OcorrenciaHomicídio extends OcorrenciaPolicial implements Morte{
	private String localAssassinato;

	public String getLocalAssassinato() {
		return localAssassinato;
	}
	
	@Override
	public void informaLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
	}
	@Override
	public String exibeInfoOcorrencia() {
		String msg = "";
		msg += "OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() + "\n";	
		msg += "NOME DA VÍTIMA: " + this.getNomeVitima() + "\n";
		msg += "DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() + "\n";
		msg += "LOCAL DO ASSASSINATO: " + this.getLocalAssassinato();
		
		return msg;
	}
}