import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	//Data Collect
    	System.out.println("Nome do candidato: ");
    	String nome = input.next();
    	
    	System.out.println("Você possui experiência? (s/n) ");
    	String experiencia = input.next();
    	
    	//Conditions
    	if(experiencia.equalsIgnoreCase("s")) {
    		System.out.println("Você possui carteira de motorista A? (s/n)");
    		String carteiraTipoA = input.next();
    		if(carteiraTipoA.equalsIgnoreCase("s")) {
    			System.out.println(nome + " foi aprovado");
    		} else {
    			System.out.println("Você possui carteira de motorista B? (s/n)");
    			String carteiraTipoB = input.next();
    			if(carteiraTipoB.equalsIgnoreCase("s")) {
    				System.out.println(nome + " foi aprovado");
    			}else {
					System.out.println(nome + " foi reprovado");
				}
    		}
    	} else {
			System.out.println(nome + " foi reprovado");
		}
    	
    	
    }
}
