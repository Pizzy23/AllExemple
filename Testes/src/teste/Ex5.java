package teste;

import java.util.Scanner;

public class Ex5 {
	int i2;
	public static void main(String[] args) throws InterruptedException {
		boolean timer = true;
		int i;
		int nump;
		int c = 0;
		String entradaI,s;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o serviço\n"
				+ "1) timer\n"
				+ "2) cronometro\n");
		nump = in.nextInt();
		System.out.println("\n");
		switch(nump) {
		
		case 1:
		System.out.println("Digite o tempo");
		c = in.nextInt();
		System.out.println("\n");
		for(i=0; i <= c; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		break;
		
		case 2:
			c = -1;
			if(timer == true) {
				for(i=0; i > c; i++) {
					Thread.sleep(500);
					System.out.println(i);
				}
				if(i == c) {
					i = 0;
					timer = false;
				}
				}
		break;
	
	
	}
	}
}
