package br.senai.sp.jandira;



import br.senai.sp.jandira.gui.FrameTABUADA;


public class AppTabuada {
	
	public static void main(String[] args) {
		
		FrameTABUADA tela = new FrameTABUADA();
		tela.titulo = "Tabuada";
		tela.largura = 500;
		tela.altura = 700;
		tela.criarTela();
	}
}
