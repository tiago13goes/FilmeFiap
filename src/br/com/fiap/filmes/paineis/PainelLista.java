package br.com.fiap.filmes.paineis;

import javax.swing.*;

public class PainelLista extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel labelTitulo = new JLabel("Lista");
	
	
	public PainelLista(){
		iniciar();
	}
	
	private void iniciar(){
		this.add(labelTitulo);
	}
	
	
}
