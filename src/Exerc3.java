import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Um Posto de combust�veis deseja determinar qual de seus produtos tem a 
prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de 
combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
4.Fim). 
Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) 
deve ser solicitado um novo c�digo (at� que seja v�lido). 
O programa ser� encerrado quando o c�digo informado for o n�mero 4. 
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
que abasteceram cada tipo de combust�vel, conforme exemplo.
Exemplo:
Entrada: 	Sa�da:
8			MUITO OBRIGADO
1			Alcool: 1	
7			Gasolina: 2
2			Diesel: 0
2
4
*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int produto = 0;
		
		while (produto != 4) {
			produto = sc.nextInt();
			if (produto == 1) {
				alcool ++;
			} else
				if (produto == 2) {
					gasolina ++;
				} else
					if (produto == 3) {
						diesel++;
					} 						
				}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		}
}