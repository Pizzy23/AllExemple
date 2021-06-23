package teste;

import java.util.Scanner;

public class Ex6 {
	static double d,d1,d2;
	static int i, i1, i2,i3,i4;
	static double r,r1,r2,r3;
	static String s;
	static String s1;
	static String entrada;
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	for(i = 1; i <= 4; i++){
	s = "";
	System.out.println("Nome?");
	s = in.next();
	System.out.println("Seu sexo");
	s1 = in.next();
	System.out.println("Sua nota 1: ");
	i1 = in.nextInt();
	System.out.println("Sua nota 2: ");
	i2 = in.nextInt();
	System.out.println("Sua nota 3: ");
	i3 = in.nextInt();
	System.out.println("Sua nota 4: ");
	i4 = in.nextInt();
	r = i1 + i2 + i3 + i4;
	r1 = r / 4;
	System.out.println("\n"+r1 + " Sua media \n" + s +"\n");
	
	}
}
}

