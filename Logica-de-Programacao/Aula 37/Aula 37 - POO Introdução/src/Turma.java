public class Turma {

	private String curso;
	private int semestre;
	private String turno;
	
	public Turma(String curso, int semestre, String turno) {
		this.curso = curso;
		this.semestre = semestre;
		this.turno = turno;
		
	}
	
	public void exibirInfo() {
		System.out.println("Curso: " + this.curso);
		System.out.println("Semestre: " + this.semestre);
		System.out.println("Turno: " + this.turno);
	}
}
