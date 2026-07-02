import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Olá mundo");
		
		String texto = JOptionPane.showInputDialog("Digite alguma coisa");
		
		JOptionPane.showMessageDialog(null, "Você digitou: \n" + texto);
		
		Integer confirmacao = JOptionPane.showConfirmDialog(null, "Deseja confirmar?", "Confirmação", 0);
		if(confirmacao.equals(JOptionPane.YES_OPTION)) {
			JOptionPane.showMessageDialog(null, "Ação confirmada");
		} else if(confirmacao.equals(JOptionPane.NO_OPTION)) {
			JOptionPane.showMessageDialog(null, "Ação não confirmada");
		} else {
			JOptionPane.showMessageDialog(null, "Ação cancelada");
		}
		
		String[] opcoes = {"Início", "Cadastro", "Listagem"};
		Integer opcaoEscolhida = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		switch(opcaoEscolhida) {
		case 0:
			JOptionPane.showMessageDialog(null, "Tela inicial");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Tela de cadastro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Tela de listagem");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Nenhuma tela");
			break;
		}
		
		String[] itens = {"Brasil", "Argentina", "Uruguai"};
		String itemEscolhido = (String) JOptionPane.showInputDialog(null, "Selecione um país", "Países", JOptionPane.PLAIN_MESSAGE, null, itens, itens[0]);
		
		
	}
}
