package teste;


import java.util.Scanner;

public class Ex1 {
	
	public static int numP, numP2;
	public static int num1;
	public static int num2;
	public static int base, altura;
	public static int resultado;
	static double resultado2;
	public static double pi = 3.14;
	
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite qual de nosso serviços deseja consultar:\n"
				+ "1)Anterior, \n"
				+ "2)Sucessor,\n"
				+ "3)Calculos de area.");
		int nump = in.nextInt();
		numP = nump;
		
		
		if(numP == 1) {
	    
		System.out.println("Por favor escreva o numero que deseja retroceder");
		System.out.println("Primeiro");
		int co1 = in.nextInt();
		num1 = co1;
		resultado = num1 - 1;
		System.out.println(resultado);
		}else if (numP == 2) {
			    
			System.out.println("Por favor escreva o numero que deseja avançar");
			int co1 = in.nextInt();
			num1 = co1;
			resultado = num1 + 1;
			System.out.println(resultado);
			
		}else if(numP == 3){
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Por favor escreva aonde deseja ir\n"
					+ "1) Retangulo\r\n"
					+ "2) Circulo\r\n"
					+ "3) Paralelogramo\r\n"
					+ "4) Triangulo\r\n"
					+ "5) Quadrado");
			int co1 = in.nextInt();
			numP2 = co1;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
		 if(numP2 == 1) { //Retangulo
			System.out.println("Digite a Base do Retangulo");
			int co4 = in.nextInt();
			System.out.println("Digite a Altura");
			int co5 = in.nextInt();
			base = co4;
			altura = co5;
			resultado = base * altura;
			System.out.println(resultado + " cm² essa seria a area");
			
		}else if(numP2 == 2) { // Circulo
			System.out.println("Digite o Raio do Circulo");
			int co4 = in.nextInt();
			base = co4;
			resultado = base * base;
			resultado2 = pi * resultado ;
			System.out.println(resultado2 + " essa seria a area do seu circulo");
		
			
			
		}else if(numP2 == 3) { //Paralelograma
			System.out.println("Digite a Base do Paralelograma");
			int co4 = in.nextInt();
			System.out.println("Digite a Altura");
			int co5 = in.nextInt();
			base = co4;
			altura = co5;
			resultado = base * altura;
			System.out.println(resultado + " cm² essa seria a area");
			
			
		}else if(numP2 == 4) { // triangulo 
			System.out.println("Digite a Base do Triangulo");
			int co4 = in.nextInt();
			System.out.println("Digite a Altura");
			int co5 = in.nextInt();
			base = co4;
			altura = co5;
			resultado = (base * altura)/2 ;
			System.out.println(resultado + " cm² essa seria a area");
			
			
			
		}else if(numP2 == 5) { //Quadrado
			System.out.println("Digite a Base do Quadrado");
			int co4 = in.nextInt();
			base = co4;
			resultado = base * base;
			System.out.println(resultado + " cm² essa seria a area");
		}
		}
	

}
}

