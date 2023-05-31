package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		char[] vetor = {'k','d','m','b','f','l','t','c','p','z','r'};
		
		for(int index : vetor) {
			a.insert((char) index);
		}
		
		System.out.println("Atravessamento pré-ordem:");
		try {
			a.remove('m');
			a.prefixSearch();
			System.out.println("\nAtravessamento em ordem:");
			a.infixSearch();
			System.out.println("\nAtravessamento pós-ordem:");
			a.postfixSearch();
			System.out.println("\nNivel do 'r':");
			a.search('r');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
