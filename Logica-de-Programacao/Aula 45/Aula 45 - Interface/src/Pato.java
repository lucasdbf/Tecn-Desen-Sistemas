
public class Pato implements Voador {

	@Override
	public void voar() {
		System.out.println("O pato está voando fazendo quac quac");
	}

	@Override
	public Integer getAltitude() {
		return 50;
	}
	
	
	
}
