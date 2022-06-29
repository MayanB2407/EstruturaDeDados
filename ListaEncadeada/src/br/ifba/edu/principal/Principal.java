package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

import br.ifba.edu.funcao.*;

public class Principal {
	
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Carlos");
		f1.setCpf("123"); 
		f1.setRg("456"); 
		f1.setIdade(24);
		lista.adicionaNoComeco(f1);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Mike");
		f2.setCpf("9845"); 
		f2.setRg("12315"); 
		f2.setIdade(45);
		lista.adicionaNoComeco(f2);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("John");
		f3.setCpf("sim"); 
		f3.setRg("895"); 
		f3.setIdade(32);
		lista.adicionaNoFinal(f3);
		
		Funcionario f4 = new Funcionario();
		f4.setNome("Deby");
		f4.setCpf("865"); 
		f4.setRg("485"); 
		f4.setIdade(998);
		lista.adicionaNoFinal(f4);
		
		Funcionario f5 = new Funcionario();
		f5.setNome("May");
		f5.setCpf("798"); 
		f5.setRg("4568"); 
		f5.setIdade(12);
		lista.adicionaPorPosicao(f5, 100);
		
		System.out.println(lista.toString());
		
		lista.removePonta();
		lista.removePosicao(1);
		
		System.out.println(lista.toString());
	}
}
