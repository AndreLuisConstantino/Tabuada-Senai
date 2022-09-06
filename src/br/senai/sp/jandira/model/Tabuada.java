package br.senai.sp.jandira.model;



public class Tabuada {

	//atributos
	public int multiplicando;
	public int minMultiplicando;
	public int maxMultiplicando;
	

	
	public String[] getTabuada() {
		
		int tamanho = maxMultiplicando - minMultiplicando + 1;
		String[] tabuada = new String[tamanho];
		
		int contador = 0;
		
		while(contador < tamanho) {
			
		int valorDaTabuada = multiplicando * minMultiplicando;
		
		String resultado = multiplicando+ "X" +minMultiplicando +"="+ valorDaTabuada;
		
		tabuada[contador] = resultado;
		
		
		contador++;
		minMultiplicando++;
	}
		return tabuada;

	}
}
