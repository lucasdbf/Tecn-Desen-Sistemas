import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		// Inicialização de variáveis e arrays
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();
		int opcao;
		
		// Menu de ações
		do {
			String[] menu = {"Lista", "Cadastro", "Alteração", "Exclusão"};
			opcao = JOptionPane.showOptionDialog(
				null, 
				"Menu de opções:", 
				"AGENDA DE CONTATOS", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				menu, 
				menu[0]
			);
			
			switch (opcao) {
			case 0:
				// Lista
				String contatos = "";
				for (int i = 0; i < listaContatos.size(); i++) {
					contatos += "\n" + listaContatos.get(i);
				}
				JOptionPane.showMessageDialog(null, "LISTA DE CONTATOS\n" + contatos);
				break;
			case 1:
				// Cadastro
				String nome = JOptionPane.showInputDialog("CADASTRO DE CONTATO\nNome:");
				String telefone = JOptionPane.showInputDialog("CADASTRO DE CONTATO\nTelefone:");
				listaContatos.add(new Contato(nome, telefone));
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				break;
			case 2:
				int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("ALTERAÇÃO DE CONTATO\nID:"));
				Contato contatoAlterar = null;
				for (int i = 0; i < listaContatos.size(); i++) {
					if(idAlterar == i) {
						contatoAlterar = listaContatos.get(i);
					}
				}
				
				if(contatoAlterar != null) {
					String nomeAlterado = JOptionPane.showInputDialog("ALTERAÇÃO NOME\nInsira o novo nome: ");
					contatoAlterar.setNome(nomeAlterado);
					String telefoneAlterado = JOptionPane.showInputDialog("Insira o novo telefone: ");
					contatoAlterar.setTelefone(telefoneAlterado);
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao alterar!");
				}
				break;
			case 3:
				int idExcluir = Integer.parseInt(JOptionPane.showInputDialog("EXCLUSÃO DE CONTATO\nID:"));
				// Verificação se o índice digitado existe
				Contato contatoExcluir = null;
				for (int i = 0; i < listaContatos.size(); i++) {
					if(listaContatos.get(i).getId().equals(idExcluir)) {
						contatoExcluir = listaContatos.get(i);
					}
				}
				// Caso exista o objeto do índice, é removido da lista
				if(contatoExcluir != null) {
					listaContatos.remove(contatoExcluir);
					JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao excluir!");
				}
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Fim!");
			}
			
		} while(opcao != -1);

	}
}
