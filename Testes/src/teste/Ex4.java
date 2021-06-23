package teste;

import javax.swing.JOptionPane;

public class Ex4 {
	static int valor;
	static String entradaI;

	public static void main(String[] args) {

		entradaI = JOptionPane.showInputDialog("Digite mes do seu nascimento: ");
		int i = Integer.parseInt(entradaI);
		switch (i) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"Janeiro\\n" + "Primeiro mes do ano, parece que foi um presente de fim de ano\n");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,
					"Fevereiro\n" + "Segundo mes do ano, Mes do ano chines um belo evento\n");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Março\n" + "Terceiro mes, Inicio de outono\n");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Abril\n" + "Quarto mes, tendo o dia da mentira como evento\n");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Maio\n" + "Quinto mes, Dias das mulheres\n");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Junho\n" + "Sexto mes, Dias dos namorados\n");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Julho\n" + "Setimo mes, Dia da Revolução");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto\n" + "Oitavo mes, Dia do Folclore");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro\n" + "Nono mes, Dia da Independência do Brasil");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Outubro\n" + "Dezimo mes, Dia das Crianças e tem o dia das bruxas");
			break;
		case 11:
			JOptionPane.showMessageDialog(null,
					"Novembro\n" + "Dezimo primeiro mes, Dia da bandeira, black friday, e o melhor mes");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "Dezembro\n" + "Ultimo mes, sendo o mes do natal");
			break;
		default:
			main(args);
		}
	}
}
