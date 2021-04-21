import java.awt.*;

import javax.swing.*;

public class App {

	public static void main (String args[]) {
		
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(595,325);
		
		
		JTabbedPane tabs = new JTabbedPane();
		
		//Tab 1 - Cadastro
		JPanel painelCadastro = new JPanel();
		
		
		JPanel painelCadastroTop = new JPanel();
		
		//Aba 1 - Cadastro
		JPanel aba1Cadastro = new JPanel();
		GridBagLayout gblAba1Cadastro = new GridBagLayout();
		aba1Cadastro.setLayout(gblAba1Cadastro);
		
		//imagem do filme
		ImageIcon imageIcon = new ImageIcon("src/harry-potter.jpg"); // load the image toaimageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(120, 200,  Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  
		JLabel lIconeFilme = new JLabel(imageIcon);
		lIconeFilme.setHorizontalAlignment(JLabel.CENTER);
		aba1Cadastro.add(lIconeFilme);
		
		
		//Aba 2 - Cadastro
		JPanel aba2Cadastro = new JPanel();
		GridBagLayout gblAba2Cadastro = new GridBagLayout();
		aba2Cadastro.setLayout(gblAba2Cadastro);
		GridBagConstraints gcAba2Cadastro = new GridBagConstraints();
		gcAba2Cadastro.fill = GridBagConstraints.HORIZONTAL;
		gcAba2Cadastro.gridy = GridBagConstraints.RELATIVE;
		
		
		//Titulo
		JLabel lTitulo = new JLabel("Título:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldTitulo = new JTextField();
		fieldTitulo.setPreferredSize(new Dimension(200,25));
		aba2Cadastro.add(lTitulo, gcAba2Cadastro);
		aba2Cadastro.add(fieldTitulo, gcAba2Cadastro);
		
		//Sinopse
		JLabel lSinopse = new JLabel("Sinopse:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldSinopse = new JTextField();
		fieldSinopse.setPreferredSize(new Dimension(50,25));
		aba2Cadastro.add(lSinopse, gcAba2Cadastro);
		aba2Cadastro.add(fieldSinopse, gcAba2Cadastro);
		
		//Gênero
		JLabel lGenero = new JLabel("Gênero:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldGenero = new JTextField();
		fieldGenero.setPreferredSize(new Dimension(50,25));
		aba2Cadastro.add(lGenero, gcAba2Cadastro);
		aba2Cadastro.add(fieldGenero, gcAba2Cadastro);
		
		
		
		//Aba 3 - Cadastro
		JPanel aba3Cadastro = new JPanel();
		GridBagLayout gblAba3Cadastro = new GridBagLayout();
		aba3Cadastro.setLayout(gblAba3Cadastro);
		GridBagConstraints gcAba3Cadastro = new GridBagConstraints();
		gcAba3Cadastro.fill = GridBagConstraints.HORIZONTAL;
		gcAba3Cadastro.gridy = GridBagConstraints.RELATIVE;
		gcAba3Cadastro.gridx = 0;
		
		//Onde Assistir
		JLabel lOndeAssistir = new JLabel("Onde Assistir");
		aba3Cadastro.add(lOndeAssistir, gcAba3Cadastro);
		JRadioButton rdNetflix = new JRadioButton("Netflix");
		aba3Cadastro.add(rdNetflix, gcAba3Cadastro);
		JRadioButton rdPrime = new JRadioButton("Prime Video");
		aba3Cadastro.add(rdPrime, gcAba3Cadastro);
		JRadioButton rdBay = new JRadioButton("Pirate Bay");
		aba3Cadastro.add(rdBay, gcAba3Cadastro);
				
		//Assistido
		JCheckBox assistido = new JCheckBox("Assistido");
		aba3Cadastro.add(assistido, gcAba3Cadastro);
					
		//Avaliação
		JLabel lAvaliacao = new JLabel("Avaliação");
		aba3Cadastro.add(lAvaliacao, gcAba3Cadastro);
		aba3Cadastro.add(new StarRater(5), gcAba3Cadastro);
		
		
		
		//Bottom Cadastro
		JPanel painelCadastroBottom = new JPanel();
		painelCadastroBottom.add(new JButton("Salvar"));
		painelCadastroBottom.add(new JButton("Cancelar"));
		
		
		
		//Adicionando conteudo das abas da parte de cima
		painelCadastroTop.add(aba1Cadastro);
		painelCadastroTop.add(aba2Cadastro);
		painelCadastroTop.add(aba3Cadastro);
		
		
		//adicionando a parte de baixo e de cima do painel de cadastro
		painelCadastro.add(painelCadastroTop);
		painelCadastro.add(painelCadastroBottom);
	
		//adicionando as tabs
		tabs.add("Cadastro", painelCadastro);
		
		
		
		
		janela.add(tabs);
		janela.setVisible(true);	
	}
	
	
}
