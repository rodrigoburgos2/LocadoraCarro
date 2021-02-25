package model.entities;

import java.util.Date;

public class AluguelCarros {
	private Date dtInicio;
	private Date dtFim;

	private Veiculo veiculo;
	private Fatura fatura;

	public AluguelCarros(Date dtInicio, Date dtFim, Veiculo veiculo) {
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.veiculo = veiculo;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
