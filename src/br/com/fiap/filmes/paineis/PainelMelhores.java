package br.com.fiap.filmes.paineis;

import javax.swing.*;

public class PainelMelhores extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel labelTitulo = new JLabel("Melhores");
	
	
	public PainelMelhores(){
		iniciar();
	}
	
	private void iniciar(){
		this.add(labelTitulo);
	}
	
	
}
