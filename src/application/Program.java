package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarros;
import model.entities.Veiculo;
import model.services.ImpostoBrasil;
import model.services.ServicoAluguel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("===== Informe os Dados da Locação =====");
		System.out.print("Modelo do Carro: ");
		String modelo = sc.nextLine();
		System.out.print("Data Inicio (dd/MM/yyyy hh:mm): ");
		Date dtIni = sdf.parse(sc.nextLine());
		System.out.print("Data Retorno (dd/MM/yyyy hh:mm): ");
		Date dtFim = sdf.parse(sc.nextLine());
		System.out.print("Preço por hora: ");
		double precohr = sc.nextDouble();
		System.out.print("Preço por dia: ");
		double precodia = sc.nextDouble();
			
		AluguelCarros ac = new AluguelCarros(dtIni, dtFim, new Veiculo(modelo));		
		ServicoAluguel sa = new ServicoAluguel(precodia, precohr, new ImpostoBrasil());
		sa.processarFatura(ac);		
		
		System.out.print("");
		System.out.print(ac.getFatura());
		
		sc.close();
	}

}
