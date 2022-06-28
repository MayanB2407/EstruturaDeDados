package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

public class Principal {
	
	public static void main(String[] args) {
		Lista lista = new Lista();
		

		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Mayn");
		lista.adicionaNoComeco("Lily");
		lista.adicionaNoComeco("Dilso");
		lista.adicionaNoComeco("Geo");
		lista.adicionaNoComeco("Ciço");
		lista.adicionaNoComeco("Clar");
		lista.adicionaNoComeco("Gusta");
		lista.adicionaNoComeco("Luke");
		lista.adicionaNoComeco("Deby");
		lista.adicionaNoComeco("Melo");
		lista.adicionaNoComeco("Matt");
		lista.adicionaNoFinal("Fim");
		lista.adicionaNoFinal("Acabou já");
		lista.adicionaPorPosicao("intruso", 100);
		
		System.out.println(lista.toString());
		
		lista.removePonta();
		
		System.out.println(lista.toString());
	}
}
