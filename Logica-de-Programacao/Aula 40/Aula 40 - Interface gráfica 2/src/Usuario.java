
public class Usuario {
	
	String nome;
	String email;
	String senha;
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public String info() {
		return "E-mail: " + email + " | Senha: " + senha;
	}
	
	public static Usuario buscar(Usuario[] lista, String login, String senha) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].email.equals(login) && lista[i].senha.equals(senha)) {
				return lista[i];
			}
		}
		
		return null;
	}
	
	
}
