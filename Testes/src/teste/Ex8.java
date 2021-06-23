package teste;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Ex8 {
	static double d,d1,total;
	static String entradaP, entradaP1;
	static int i,i1,nump;
	public static void main(String[] args) {
		UIManager.put("OptionPane.messageForeground", Color.black);
		
		entradaP = JOptionPane.showInputDialog(null,"Digite aonde deseja ir\n"
				+ "1) Soma\n"
				+ "2) Subtração\n"
				+ "3) Multiplicação\n"
				+ "4) Divisão\n");
		nump = Integer.parseInt(entradaP);
		switch(nump){
		case 1:
			soma();
		break;
		case 2:
			sub();
		break;
		case 3:
			multi();
		break;
		case 4:
			divi();
		break;
		default: erro();
		}
	}
	private static void erro() {
		UIManager um = new UIManager();
		UIManager.put("OptionPane.messageForeground", Color.red);
		Font serifFont = new Font("Serif", Font.BOLD, 12);
			JOptionPane.showMessageDialog(null , "Error\n"
					+ "Error\n"+ "Error\n"+ "Error\n"
			+ "Coloque um numero valido. . . .",  "Error", JOptionPane.ERROR_MESSAGE);
			main(null);
		}	
		
	private static void divi() {
		DecimalFormat df = new DecimalFormat("#.#");
		entradaP = JOptionPane.showInputDialog(null,"Digite o valor 1° que deseja dividir: ");
		d = Integer.parseInt(entradaP);
		entradaP1 = JOptionPane.showInputDialog(null,"Digite o valor 2° que deseja dividir: ");
		d1 = Integer.parseInt(entradaP1);
		total = d / d1;
		JOptionPane.showMessageDialog(null, df.format(total) + " Esse é a divisão dos dois valores");
		main(null);
		
	}
	private static void multi() {
		entradaP = JOptionPane.showInputDialog(null,"Digite o valor 1° que deseja multiplicar: ");
		i = Integer.parseInt(entradaP);
		entradaP1 = JOptionPane.showInputDialog(null,"Digite o valor 2° que deseja multiplicar: ");
		i1 = Integer.parseInt(entradaP1);
		total = i * i1;
		JOptionPane.showMessageDialog(null, total + " Esse é a multiplicado dos dois valores");
		main(null);
	}
	private static void sub() {
		entradaP = JOptionPane.showInputDialog(null,"Digite o valor 1° que deseja subtrair: ");
		i = Integer.parseInt(entradaP);
		entradaP1 = JOptionPane.showInputDialog(null,"Digite o valor 2° que deseja subtrair: ");
		i1 = Integer.parseInt(entradaP1);
		total = i - i1;
		JOptionPane.showMessageDialog(null, total + " Esse é a subtração dos dois valores");
		main(null);
	}
	private static void soma() {
		entradaP = JOptionPane.showInputDialog(null,"Digite o valor 1° que deseja somar: ");
		i = Integer.parseInt(entradaP);
		entradaP1 = JOptionPane.showInputDialog(null,"Digite o valor 2° que deseja somar: ");
		i1 = Integer.parseInt(entradaP1);
		total = i + i1;
		JOptionPane.showMessageDialog(null, total + " Esse é a soma dos dois valores");
		main(null);
	}
}
