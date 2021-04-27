package br.com.fiap.filmes.paineis;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.*;

import br.com.fiap.filmes.StarRater;

public class PainelCadastro extends JPanel {

	private static final long serialVersionUID = 1L;

	public PainelCadastro() {
		this.iniciar();
	}
	
	private JPanel painelCadastroTop = new JPanel();
	private JPanel aba1Cadastro = new JPanel();
	private JPanel aba2Cadastro = new JPanel();
	private JPanel aba3Cadastro = new JPanel();

	private void iniciar() {
		GridBagLayout gblPainelCadastro = new GridBagLayout();
		this.setLayout(gblPainelCadastro);
		GridBagConstraints gbcPainelCadastro = new GridBagConstraints();
		gbcPainelCadastro.fill = GridBagConstraints.HORIZONTAL;
		gbcPainelCadastro.gridy = GridBagConstraints.RELATIVE;
		gbcPainelCadastro.gridx = 0;


		// Aba 1 - Cadastro
		GridBagLayout gblAba1Cadastro = new GridBagLayout();
		aba1Cadastro.setLayout(gblAba1Cadastro);

		// imagem do filme
		ImageIcon imageIcon = new ImageIcon("src/harry-potter.jpg"); // load the image toaimageIcon
		Image image = imageIcon.getImage(); // transform it
		Image newimg = image.getScaledInstance(120, 200, Image.SCALE_SMOOTH); // scale it the smooth way
		imageIcon = new ImageIcon(newimg);
		JLabel lIconeFilme = new JLabel(imageIcon);
		lIconeFilme.setHorizontalAlignment(JLabel.CENTER);
		aba1Cadastro.add(lIconeFilme);

		// Aba 2 - Cadastro
		GridBagLayout gblAba2Cadastro = new GridBagLayout();
		aba2Cadastro.setLayout(gblAba2Cadastro);
		GridBagConstraints gcAba2Cadastro = new GridBagConstraints();
		gcAba2Cadastro.fill = GridBagConstraints.HORIZONTAL;
		gcAba2Cadastro.gridy = GridBagConstraints.RELATIVE;
		gcAba2Cadastro.gridx = 0;

		// Titulo
		JTextField fieldTitulo = new JTextField();
		fieldTitulo.setPreferredSize(new Dimension(200, 25));
		aba2Cadastro.add(new JLabel("Título:"), gcAba2Cadastro);
		aba2Cadastro.add(fieldTitulo, gcAba2Cadastro);

		// Sinopse
		JTextArea fieldSinopse = new JTextArea();
		fieldSinopse.setPreferredSize(new Dimension(10, 50));
		aba2Cadastro.add(new JLabel("Sinopse:"), gcAba2Cadastro);
		aba2Cadastro.add(fieldSinopse, gcAba2Cadastro);

		// Gênero
		String opcoesGenero[] = { "Ação", "Comédia", "Documentário", "Drama", "Musical", "Romance", "Suspense","Terror" };
		JComboBox selectGenero = new JComboBox(opcoesGenero);
		aba2Cadastro.add(new JLabel("Gênero:"), gcAba2Cadastro);
		aba2Cadastro.add(selectGenero, gcAba2Cadastro);

		// Aba 3 - Cadastro
		GridBagLayout gblAba3Cadastro = new GridBagLayout();
		aba3Cadastro.setLayout(gblAba3Cadastro);
		GridBagConstraints gcAba3Cadastro = new GridBagConstraints();
		gcAba3Cadastro.fill = GridBagConstraints.HORIZONTAL;
		gcAba3Cadastro.gridy = GridBagConstraints.RELATIVE;
		gcAba3Cadastro.gridx = 0;

		// Onde Assistir
		JLabel lOndeAssistir = new JLabel("Onde Assistir");
		aba3Cadastro.add(lOndeAssistir, gcAba3Cadastro);
		JRadioButton rdNetflix = new JRadioButton("Netflix");
		aba3Cadastro.add(rdNetflix, gcAba3Cadastro);
		JRadioButton rdPrime = new JRadioButton("Prime Video");
		aba3Cadastro.add(rdPrime, gcAba3Cadastro);
		JRadioButton rdBay = new JRadioButton("Pirate Bay");
		aba3Cadastro.add(rdBay, gcAba3Cadastro);

		// Assistido
		JCheckBox assistido = new JCheckBox("Assistido");
		aba3Cadastro.add(assistido, gcAba3Cadastro);

		// Avaliação
		JLabel lAvaliacao = new JLabel("Avaliação");
		aba3Cadastro.add(lAvaliacao, gcAba3Cadastro);
		aba3Cadastro.add(new StarRater(5), gcAba3Cadastro);

		// Bottom Cadastro
		JPanel painelCadastroBottom = new JPanel();
		painelCadastroBottom.add(new JButton("Salvar"));
		painelCadastroBottom.add(new JButton("Cancelar"));

		// Adicionando conteudo das abas da parte de cima
		painelCadastroTop.add(aba1Cadastro);
		painelCadastroTop.add(aba2Cadastro);
		painelCadastroTop.add(aba3Cadastro);

		// adicionando a parte de baixo e de cima do painel de cadastro
		this.add(painelCadastroTop, gbcPainelCadastro);
		this.add(painelCadastroBottom, gbcPainelCadastro);

	}

}
