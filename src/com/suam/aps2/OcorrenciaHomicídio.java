package com.suam.aps2;

public class OcorrenciaHomic�dio extends OcorrenciaPolicial implements Morte{
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
		msg += "OCORR�NCIA DE FURTO N�MERO: " + this.getNumero() + "\n";	
		msg += "NOME DA V�TIMA: " + this.getNomeVitima() + "\n";
		msg += "DESCRI��O DA OCORR�NCIA: " + this.getDescricaoOcorrencia() + "\n";
		msg += "LOCAL DO ASSASSINATO: " + this.getLocalAssassinato();
		
		return msg;
	}
}