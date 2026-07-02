import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Usuario[] listaUsuarios = new Usuario[3];
		listaUsuarios[0] = new Usuario("Lucas", "lucas@gmail.com", "lucas123");
		listaUsuarios[1] = new Usuario("Pietro", "pietro@gmail.com", "pietro123");
		listaUsuarios[2] = new Usuario("Artur", "artur@gmail.com", "artur123");
		
		String login = JOptionPane.showInputDialog("Login (E-mail):");
		String senha = JOptionPane.showInputDialog("Senha:");
		
		Usuario usuarioEncontrado = Usuario.buscar(listaUsuarios, login, senha);
		if(usuarioEncontrado != null) {
			JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema " + usuarioEncontrado.nome);
		} else {
			JOptionPane.showMessageDialog(null, "Login inválido");
		} 
	}
}
