import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua média:");
		double media = input.nextDouble();
		input.nextLine();
		
		if(media == 10)  System.out.println("Excelente");
		if(media >= 7 && media < 10) System.out.println("Boa");
		if(media >= 5 && media < 7) System.out.println("Regular");
		if(media < 5) System.out.println("Ruim!");
		
	} 
}