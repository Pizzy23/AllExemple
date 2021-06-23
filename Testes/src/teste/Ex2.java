package teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex2 {
	

	static int ano;
	static int nump;
	static int mes;
	static int dias;
	static double resultado, resultado2, resultado1, total;
	static double salario, i;
	static double brancos, nulos, validos;
	static double brancosR,nulosR, validosR;
    static int nConver;
	private static String entradaI2,entradaI,entradaI1,entradaP;
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		entradaP = JOptionPane.showInputDialog("Digite qual de nosso serviços deseja consultar:\n"
				+ "1) Ano\n"
				+ "2) Salario\n"
				+ "3) Votos");
		nump = Integer.parseInt(entradaP);
		System.out.println(nump);
		
		if(nump == 1) {
		entradaI = JOptionPane.showInputDialog("Digite quantos anos voce tem? ");
		ano = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos meses na sua idade você tem?? ");
		mes = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite quantos dias na sua idade você tem? ");
		dias = Integer.parseInt(entradaI2);
		resultado = ano * 365;
		resultado1 = mes * 30;
		resultado2 = dias + resultado + resultado1;
		JOptionPane.showMessageDialog(null,"Você tem "+ resultado2 + " Dias vivos");
		
		}else if(nump == 2) {
			entradaI = JOptionPane.showInputDialog("Digite seu salario atual: ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite seu reajuste: ");
			i = Integer.parseInt(entradaI1);
			resultado = salario * (i / 100);
			resultado1 = salario + resultado;
			JOptionPane.showMessageDialog(null, resultado1 + " Esse é seu novo salario");
		}else if (nump == 3) {
			entradaI = JOptionPane.showInputDialog("Digite numero de votos brancos: ");
			brancos  = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite numero de votos nulos: ");
			nulos = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite numero de votos válidos: ");
			validos = Integer.parseInt(entradaI2);
			
			total = brancos + nulos + (validos);
			brancosR = brancos / total * (100);
			nulosR = nulos / total * (100);
			validosR = validos / total * (100);
			JOptionPane.showMessageDialog(null, total + " Numero total de eleitores\n"
					+brancosR +"%"+ " Numero de eleitores nulos\n"
					+nulosR +"%"+ " Numero de eleitores brancos\n"
					+validosR +"%"+ " Numero de eleitores validos\n"
					);
		}
	}
}
	
