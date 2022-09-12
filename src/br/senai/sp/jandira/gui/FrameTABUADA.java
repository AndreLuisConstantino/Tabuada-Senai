package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTABUADA {

	// atributos

	public String titulo;
	public int largura;
	public int altura;

	public Color corDoTitulo = new Color(240, 0, 0);
	public Color corDoBotaoLimpar = new Color(208, 255, 3);
	public Color corDoPainel = new Color(225, 225, 225);
	public Font FontTitulo = new Font("Arial", Font.BOLD, 23);
	public Font FontSubTitulo = new Font("Arial",Font.ITALIC, 18);
	public Font FontLabels = new Font("Arial", Font.ITALIC, 20);

	// metodo

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// obter referencia do painel de conteudo
		Container painel = tela.getContentPane();
		painel.setBackground(Color.white);

		//Colocar o icone
		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/imagens/tablet-caneta.png");
		JLabel icon = new JLabel(icone);
		icon.setBounds(2, 20, 60, 50);
		
		// criar os componentes da tela

		// Titulo tabuada
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(FontTitulo);
		labelTabuada.setForeground(corDoTitulo);
		labelTabuada.setBounds(60, 30, 150, 30);

		// Subtitulo
		JTextArea textSubtitulo = new JTextArea();
		textSubtitulo.setText(
				"Com a tabuada 1.0 os seus problemas acabaram.\nCalcule a tabuada que desejar em segundos!");
		textSubtitulo.setForeground(Color.gray);
		textSubtitulo.setFont(FontSubTitulo);
		textSubtitulo.setLineWrap(true);
		textSubtitulo.setEditable(false);
		textSubtitulo.setBounds(50, 70, 435, 50);

		// Label multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(FontLabels);
		labelMultiplicando.setForeground(Color.black);
		labelMultiplicando.setBounds(140, 150, 150, 35);

		// TextField multiplicando
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(270, 150, 150, 35);
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);

		// label minimo multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setFont(FontLabels);
		labelMinimoMultiplicador.setForeground(Color.black);
		labelMinimoMultiplicador.setBounds(70, 190, 200, 35);

		// textField do Minimo Multiplicador
		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(270, 190, 150, 35);
		textFieldMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		// Jlabel do Maximo Multiplicador
		JLabel labelDoMaximoMultiplicador = new JLabel();
		labelDoMaximoMultiplicador.setText("Maximo Multiplicador:");
		labelDoMaximoMultiplicador.setFont(FontLabels);
		labelDoMaximoMultiplicador.setForeground(Color.black);
		labelDoMaximoMultiplicador.setBounds(65, 230, 200, 35);

		// textField do Maximo Multiplicador
		JTextField textFieldDoMaximoMultiplicador = new JTextField();
		textFieldDoMaximoMultiplicador.setBounds(270, 230, 150, 35);
		textFieldDoMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		// Botão Calcular
		JButton buttonCalcular = new JButton();
		Color corDoBotaoCalcular = new Color(00, 130, 00);
		buttonCalcular.setText("Calcular");
		buttonCalcular.setForeground(Color.white);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		buttonCalcular.setBounds(30, 340, 200, 40);

		// Botão limpar
		JButton buttonLimpar = new JButton();
		Color corDoBotaoLimpar = new Color(255, 201, 16);
		buttonLimpar.setText("Limpar");
		buttonLimpar.setForeground(Color.white);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		buttonLimpar.setBounds(250, 340, 150, 40);

		// label resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setForeground(Color.black);
		labelResultado.setFont(FontLabels);
		labelResultado.setBounds(30, 380, 100, 35);

		// lista
		JList<String> Lista = new JList<>();

		// Adicionando Scroll em Jlist
		JScrollPane scroll = new JScrollPane(Lista);
		scroll.setBounds(30, 410, 400, 200);

		// adicionar os componentes ao painel

		painel.add(labelTabuada);
		painel.add(textSubtitulo);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelDoMaximoMultiplicador);
		painel.add(textFieldDoMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(icon);

		// tornar a tela visivel
		tela.setVisible(true);

		
		// Definir ouvintes para os componentes da tela
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				if(textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo multiplicando não pode ficar vazio");
					textFieldMultiplicando.requestFocus();
				}else if(textFieldMinimoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo minimo não pode ficar vazio");
					textFieldMinimoMultiplicador.requestFocus();
				}else if(textFieldDoMaximoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo máximo não pode ficar vazio");
					textFieldDoMaximoMultiplicador.requestFocus();
				}else if(Integer.parseInt(textFieldMultiplicando.getText()) > 10000 || Integer.parseInt(textFieldMinimoMultiplicador.getText()) > 10000 || Integer.parseInt(textFieldDoMaximoMultiplicador.getText()) > 10000 ){
					JOptionPane.showMessageDialog(null, "Os valores não podem ser maiores que 10000", "Erro", JOptionPane.OK_OPTION);
				}
				else {
					
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minMultiplicando = Integer.parseInt(textFieldMinimoMultiplicador.getText());
				tabuada.maxMultiplicando = Integer.parseInt(textFieldDoMaximoMultiplicador.getText());
				
				
				if(tabuada.maxMultiplicando < tabuada.minMultiplicando) {
					JOptionPane.showMessageDialog(null, "O Minimo Multiplicador não pode ficar maior que o máximo", "ERRO", JOptionPane.OK_OPTION);
					textFieldMultiplicando.setText("");
					textFieldMinimoMultiplicador.setText("");
					textFieldDoMaximoMultiplicador.setText("");
					
				}else {
					Lista.setListData(tabuada.getTabuada());
				}
				}
				}});
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textFieldMultiplicando.setText("");
				textFieldMinimoMultiplicador.setText("");
				textFieldDoMaximoMultiplicador.setText("");
				
				DefaultListModel<String> model = new DefaultListModel<>();
				Lista.setModel(model);
			}
		});
		
	}

}
