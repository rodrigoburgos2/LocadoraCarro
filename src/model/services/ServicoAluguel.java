package model.services;

import model.entities.AluguelCarros;
import model.entities.Fatura;

public class ServicoAluguel {
	private Double precoDia;
	private Double precoHora;

	private ServicoImposto servicoImposto;

	public ServicoAluguel(Double precoDia, Double precoHora, ServicoImposto servicoImposto) {
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.servicoImposto = servicoImposto;
	}

	public void processarFatura(AluguelCarros aluguelCarro) {
		long t1 = aluguelCarro.getDtInicio().getTime();// valor em milisec da data
		long t2 = aluguelCarro.getDtFim().getTime();
		// milisec/1000 = sec/60 = min/60 = h
		double hr = (double) (t2 - t1) / 1000 / 60 / 60;// cast para garantir o valor em double
		double pg;
		if (hr <= 12) {
			pg = Math.ceil(hr) * precoHora;//Math.ceil arredondar para cima
		}
		else {
			pg = Math.ceil(hr / 24) * precoDia;//Math.ceil arredondar para cima
		}
		double taxa = servicoImposto.imposto(pg);
		
		aluguelCarro.setFatura(new Fatura(pg, taxa));
			
	}

}
