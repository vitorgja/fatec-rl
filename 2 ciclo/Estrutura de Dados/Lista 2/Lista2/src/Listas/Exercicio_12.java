package Listas;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int i=1,x=1,soma=0;
		double s=0,pi;
		while(i <= 51){
			s= 1/ (Math.pow(x, 3))+ s;
			x=x+2;
			i=i+1;
		}
		pi= Math.pow(s*32,1.0/3.0);
		System.out.println(pi);
		
		
		
		
		//	12. Calcular e mostrar o valor aproximado de PI, calculado usando-se a s�rie
		//	s=(1/1^3)+(1/3^3)+(1/5^3)+(1/7^3)+...
		//	sendo .
		//pi = 3RaizQ(s*32)
		//	Utilize, para tal c�lculo, a s�rie com 51 termos. 
	
		System.out.println("pi "+Math.PI);
		
		int iFor,iWhile=1,iDoWhile=1;
		//double pi=0,s=0;				
		
		// For
		for(iFor=1;iFor<=51;iFor++){
			if(iFor %2==1){
				s=s+(1/( Math.pow((double)iFor, 3.00) ));
			}
		}
		pi = 3.00*(Math.sqrt(s*32));
		System.out.println(pi);
		
		
		// While
		pi=0;
		s=0;
		while(iWhile<=51){
			if(iWhile %2==1){
				s=s+(1/( Math.pow((double)iWhile, 3) ));
			}
			iWhile++;
		}
		pi = 3*Math.sqrt(s*32);
		System.out.println(pi);
		
		// Do While
		pi=0;
		s=0;
		do{								
			if(iDoWhile %2==1){
				s=s+(1/( Math.pow((double)iDoWhile, 3) ));
			}
			iDoWhile++;
		}while(iDoWhile<=20);
		pi = 3*Math.sqrt(s*32);
		System.out.println(pi);
		
	}	
	
}	
	