package Listas;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// 11. Calcular e mostrar o valor de 
		// Y = X+2X+3X+4X+5X+�+20X, sendo X obtido via teclado. 
		
		Scanner entrada = new Scanner(System.in);
		int x,y=0,iFor,iWhile=1,iDoWhile=1;
		
		System.out.print("Digite um numero: ");
		x=entrada.nextInt();
		
		// For
		for(iFor=1;iFor<=20;iFor++){
			y=y+(x*iFor);					
			if(iFor!=20){
				System.out.print(x+"*"+iFor+"+");
			}else{
				System.out.println(x+"*"+iFor+"= "+y);
			}
		}
					
		// While
		y=0;
		while(iWhile<=20){
			y=y+(x*iWhile);					
			if(iWhile!=20){
				System.out.print(x+"*"+iWhile+"+");
			}else{
				System.out.println(x+"*"+iWhile+"= "+y);
			}
			iWhile++;
		}
					
		// Do While
		y=0;
		do{								
			y=y+(x*iDoWhile);					
			if(iDoWhile!=20){
				System.out.print(x+"*"+iDoWhile+"+");
			}else{
				System.out.println(x+"*"+iDoWhile+"= "+y);
			}
			iDoWhile++;
		}while(iDoWhile<=20);
		
		entrada.close();
	}

}
