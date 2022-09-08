package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
		painel.setBackground(corDoPainel);

		// criar os componentes da tela

		// Titulo tabuada
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(FontTitulo);
		labelTabuada.setForeground(corDoTitulo);
		labelTabuada.setBounds(30, 20, 200, 35);

		// Subtitulo
		JTextArea textSubtitulo = new JTextArea();
		textSubtitulo.setText(
				"Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!\r\n" + "");
		textSubtitulo.setForeground(Color.gray);
		textSubtitulo.setFont(FontLabels);
		textSubtitulo.setLineWrap(true);
		textSubtitulo.setEditable(false);
		textSubtitulo.setBounds(30, 60, 455, 50);

		// Label multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(FontLabels);
		labelMultiplicando.setForeground(Color.black);
		labelMultiplicando.setBounds(140, 150, 150, 35);

		// TextField multiplicando
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(270, 150, 150, 35);

		// label minimo multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setFont(FontLabels);
		labelMinimoMultiplicador.setForeground(Color.black);
		labelMinimoMultiplicador.setBounds(70, 190, 200, 35);

		// textField do Minimo Multiplicador
		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(270, 190, 150, 35);

		// Jlabel do Maximo Multiplicador
		JLabel labelDoMaximoMultiplicador = new JLabel();
		labelDoMaximoMultiplicador.setText("Maximo Multiplicador:");
		labelDoMaximoMultiplicador.setFont(FontLabels);
		labelDoMaximoMultiplicador.setForeground(Color.black);
		labelDoMaximoMultiplicador.setBounds(65, 230, 200, 35);

		// textField do Maximo Multiplicador
		JTextField textFieldDoMaximoMultiplicador = new JTextField();
		textFieldDoMaximoMultiplicador.setBounds(270, 230, 150, 35);

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

		// tornar a tela visivel
		tela.setVisible(true);

		// Definir ouvintes para os componentes da tela
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minMultiplicando = Integer.parseInt(textFieldMinimoMultiplicador.getText());
				tabuada.maxMultiplicando = Integer.parseInt(textFieldDoMaximoMultiplicador.getText());

				Lista.setListData(tabuada.getTabuada());

			}
		});
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
	}

}
