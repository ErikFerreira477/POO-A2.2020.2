package com.suam.aps2;

public abstract class OcorrenciaPolicial {

	public int numero;
	public String nomeVitima;
	public String descricaoOcorrencia;
	public abstract String exibeInfoOcorrencia();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}

	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}
}