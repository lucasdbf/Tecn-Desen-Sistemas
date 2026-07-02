import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("== CALCULADORA IMC ==");
		
		System.out.println("Qual sua massa em kilos?");
		double massa = input.nextDouble();
		input.nextLine();
		
		System.out.println("Qual a sua altura em metros?");
		double altura = input.nextDouble();
		input.nextLine();
		
		double imc = massa / (altura * altura);
		System.out.printf("Seu IMC é %.1f%n", imc);
		System.out.print("Classificação do IMC: ");
		
		if(imc <= 18.5) System.out.print("Abaixo do Normal");
		else if(imc <= 24.9) System.out.print("Normal");
		else if(imc <= 29.9) System.out.print("Sobrepeso");
		else if(imc <= 35) System.out.print("Obeso");
		else System.out.print("Obesidade Extrema");  
		
	}

}
