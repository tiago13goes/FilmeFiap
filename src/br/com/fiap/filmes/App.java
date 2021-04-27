package br.com.fiap.filmes;
//import java.awt.*;
import javax.swing.*;
import br.com.fiap.filmes.paineis.*;


public class App extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main (String args[]) {
		App janela = new App();
		janela.iniciar();
	}
	
	private void iniciar() {
		
		JTabbedPane tabs = new JTabbedPane();
		PainelCadastro painelCadastro = new PainelCadastro();
		PainelLista painelLista = new PainelLista();
		PainelMelhores painelMelhores = new PainelMelhores();
		PainelPendentes painelPendentes = new PainelPendentes();
		
		tabs.add("Lista", painelLista);
		tabs.add("Cadastro", painelCadastro);
		tabs.add("Melhores", painelMelhores);
		tabs.add("Pendentes", painelPendentes);
		
		this.add(tabs);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(595,325);
		this.setVisible(true);
	}
	
	
}
