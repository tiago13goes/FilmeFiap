package br.com.fiap.filmes.paineis;

import javax.swing.*;

public class PainelPendentes extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel labelTitulo = new JLabel("Pendentes");
	
	
	public PainelPendentes(){
		iniciar();
	}
	
	private void iniciar(){
		this.add(labelTitulo);
	}
	
	
}