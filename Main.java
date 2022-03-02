package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroUm; 
		int numeroDois;
		
		System.out.println("Insira um numero: ");
		System.out.println("Insira outro numero: ");
		numeroUm = sc.nextInt();
		numeroDois = sc.nextInt();
				
		if(numeroUm%numeroDois == 0 || numeroDois%numeroUm == 0 ) {
					
		System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Não Sao Multiplos");
			}
			
		}
		
		
		
		}



