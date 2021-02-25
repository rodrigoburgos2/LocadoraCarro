package model.entities;

public class Fatura {
	private Double valorInicial;
	private Double imposto;

	public Fatura(Double valorInicial, Double imposto) {
		this.valorInicial = valorInicial;
		this.imposto = imposto;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public Double getPagamentoTotal() {
		return valorInicial + imposto;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFATURA:");
		sb.append("\nPagamento Basico: " + String.format("%.2f",getValorInicial()));
		sb.append("\nImposto: " + String.format("%.2f",getImposto()));
		sb.append("\nPagamento Total: " + String.format("%.2f",getPagamentoTotal()));		
		return sb.toString();
	}

}
