public class Principal {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("Desenvolvimento de Sistemas", "Técnico");
		System.out.println(c1);
		
		Curso c2 = new Curso("Análise e Desenvolvimento de Sistemas", "Graduação");
		System.out.println(c2);
		
		Curso c3 = new Curso("Engenharia Civil", "Graduação");
		System.out.println(c3);
		
		Aluno a1 =  new Aluno("Calinho", 12345, c1);
		System.out.println(a1);
	}

}
