package Listas;

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		//3. Mostrar a seguinte s�rie: 1, 2, 3,...,N 

		// Declara��o de Variaveis
		int n,iFor,iWhile,iDoWhile;
		Scanner entrada = new Scanner(System.in);
		
		// Inicio
		System.out.print("Digite o N�mero: ");
		n = entrada.nextInt();
		entrada.close();
		
		// For
		for(iFor=1;iFor<=n;iFor++){
			
			if(iFor!=n){
				System.out.print(iFor+", ");
			}else{
				System.out.println(iFor+".");
			}
			
		}
		
		//While
		iWhile = 1;
		while(iWhile<=n){
			if(iWhile!=n){
				System.out.print(iWhile+", ");
			}else{
				System.out.println(iWhile+".");
			}
			iWhile++;
		}
		
		//Do While
		iDoWhile=1;
		do{
			if(iDoWhile!=n){
				System.out.print(iDoWhile+", ");
			}else{
				System.out.println(iDoWhile+".");
			}
			iDoWhile++;
		}while(iDoWhile<=n);
		
	}
}
