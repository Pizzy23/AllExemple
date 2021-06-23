package teste;

public class Ex7 {
	
	public static int astolfo = 2; // acessar e mudar de qualquer lugar
	protected static int i1 = 2; // protegida podendo alterar apenas na classe principal
	private static int i2 = 2; // não pode ser alterada fora da classe
	//===================================================
	
	static int numeroInteiro; //int = numeros inteiros -2147483648 a + 2147483647
	static byte numPequeno; //byte = -128 ate 127
	static short numUmPoucoMaior; // short -32.768 e 32.767
	static long numGrande; // long-922337203685477808 a 922337203685477807
	//====================================================================
	static double numeroQuebrado = 2.12131231213; //double = ponto flutante
	static float numeroQuebrado1 = 2.31231212351f;
	//===================================================
	static boolean ba = false; // verdedeiro ou falso; true or false
	static char letrinha = 'a'; //Qualquer caracter, apenas 1
	//===================================================
	static String s = "2173187781831";// armazena palavras ou numeros
	
	public static void main(String[] args) {
		// i2 = 200; i1 = 100;
		// numeroInteiro = i2-i1;
		//astolfo = Integer.parseInt(s); // conversor de int
		//System.out.println(numeroInteiro);
		/*
		astolfo = 2;
		if(astolfo == 1) { // pode verificar qualquer coisa.
			System.out.println("Sarah");
			astolfo = 33;
			if(astolfo == 33) {
			System.out.println("Sarah");
			}
		}else if(astolfo == 2) {
			System.out.println("julia");
		}else{
			System.out.println("Cu");
		}
		
		astolfo = 4;
		switch(astolfo) { // apenas numeros inteiros
		case 1: // coisinha pra botar o numero desejado
			System.out.println("Rabo");
		break; // quebrar algo 
		case 2:
			System.out.println("Hamburguer");
		break;
		case 3:
			System.out.println("julia");
		break;
		default: //padrao. se nenhuma verificação funcionar entra ele 
			System.out.println("Puts");
		}
		
		astolfo = 0;
		i2 = 20;
		while(astolfo <= i2) { // enquanto
			System.out.println(astolfo);
			astolfo++;
			
			if(astolfo == 5) { // verifica a variavel astolfo
				System.out.println("arroz");
				//break; //Serve para parar o contador
				//continue; // Serve para continuar o contador
			}
		}
		i2 = 20;
		for(astolfo = 0; astolfo <= i2; astolfo++) {  // mesma coisa do while so que melhor
			System.out.println(astolfo); // para, contador
			if(astolfo == 5) {
				break;
			}
		}*/

		i1 = 2;
		if(i1 == 1) {
			cleber();
		}else if(i1 == 2){
			System.out.println("Cu");
		}
	}
	public static void cleber() {
		astolfo = 1;
		System.out.println(astolfo);
	}
}
