package br.ifba.edu.lista;

import br.ifba.edu.basica.Celula;

public class Lista {
	private Celula ponta;
	private Celula rabo;
	
	private int totalElementos = 0;
	
	public void adicionaNoComeco(Object obj) {
		
		Celula nova = new Celula(this.ponta ,obj);
		this.ponta = nova;
		
		if(totalElementos == 0) {
			this.rabo = nova;
		}
		
		this.totalElementos++;
	}
	
	public void adicionaNoFinal(Object obj) {
		
		if(totalElementos == 0) {
			this.adicionaNoComeco(obj);
		}
		else {
			Celula nova = new Celula(obj);
			this.rabo.setProxima(nova);
			this.rabo = nova;
			this.totalElementos++;
		}
	}
	public void removePonta() {
		Celula aux = this.ponta;
		this.ponta = ponta.getProxima();
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	public void adicionaPorPosicao(Object obj, int posicao) {
	

		Celula aux = this.ponta;
		
		if(posicao == 0) {
			this.adicionaNoComeco(obj);
		}else if(posicao == this.totalElementos) {
			this.adicionaNoFinal(obj);
		}else if(posicao > 0 && posicao < totalElementos) {
			for(int cont = 0; cont < posicao - 1; cont++) {
			aux = aux.getProxima();
			}
			Celula nova = new Celula(aux.getProxima(), obj);
			aux.setProxima(nova);	
			this.totalElementos++;
		}else {
			System.out.println("Posição inválida");
		}
		
		
	}
	
	public String toString() {
		if(this.totalElementos == 0) {
			return"[]";
		}
		
		StringBuilder listaEncadeada = new StringBuilder("[");
		Celula atual = this.ponta;
		
		for(int i = 0; i < this.totalElementos -1; i++) {
			listaEncadeada.append(atual.getObjeto());
			listaEncadeada.append(",");
			atual = atual.getProxima();
		}
		listaEncadeada.append(atual.getObjeto());
		listaEncadeada.append("]");
		
		return listaEncadeada.toString();
	}
}
