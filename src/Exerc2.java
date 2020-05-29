import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma). Exemplo: 
		 * Entrada: Saída: 
		 * 2 2 primeiro 
		 * 3 -2 quarto 
		 * -8 -1 terceiro 
		 * -7 1 segundo 
		 * 0 2
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			} else
				if(x > 0 && y < 0) {
					System.out.println("quarto");
				} else
					if (x < 0 && y < 0) {
						System.out.println("terceiro");
					} else
						if (x < 0 && y > 0) {
							System.out.println("segundo");
						}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
