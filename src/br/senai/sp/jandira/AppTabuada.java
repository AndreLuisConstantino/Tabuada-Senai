package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {
	
	public static void main(String[] args) {
		
		 Tabuada Tabuada1  = new Tabuada();
		 Tabuada1.multiplicando = 29;
		 Tabuada1.minMultiplicando = 238;
		 Tabuada1.maxMultiplicando = 2019;
		
		 
		 String valorDaTabuada[] = Tabuada1.getTabuada();
		 int contador = 0;
		 
		 while (contador < valorDaTabuada.length) {
			 System.out.println(valorDaTabuada[contador]);
			 contador++;
		 }
	}
}
