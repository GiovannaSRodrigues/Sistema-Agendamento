package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TestDao {

	public static void main(String[] args) {
		String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
		String[] linha1 = {"Barueri", "Carapicuíba", "Osasco"};
		String[] linha2 = {"Alphaville", "São Roque", "Itu"};
		String[] linha3 = {"Presidente Prudente", "Pinheiros", "Santo Amaro"};
                
                String[][] linhas = {linha0,linha1,linha2,linha3};
                
                System.out.println(linhas[2][2]);
                
                
                String[][] frutas = {
                    {"Banana", "Pera", "Maçã"}, 
                    {"Melancia", "Uva", "Abacate"},
                    {"Morango", "Manga", "Abacaxi"},
                        
                    {"Banana", "Pera", "Maçã"}, 
                    {"Melancia", "Uvaxxxxx", "Abacate"},
                    {"Morango", "Manga", "Abacaxi"}
                };
                
                System.out.println(frutas[1][1]);
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil","Basicc");
		PlanoDeSaude plano2 = new PlanoDeSaude("Alians","Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed","Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notedrame","Advacend");
		PlanoDeSaude plano5 = new PlanoDeSaude();
		
		//chamando a classe get contador, método compartilhado
	//quantos planos de saúde eu tenho
		System.out.println(PlanoDeSaude.getContador());
		
		System.out.println(plano1.getCodigo());
		//System.out.println(plano2.getCodigo());
		System.out.println(plano5.getCodigo());
		
		PlanoDeSaudeDao.gravar(plano1);
		PlanoDeSaudeDao.gravar(plano4);
		//
		
		System.out.println("-------------");
		for (PlanoDeSaude p : PlanoDeSaudeDao.listarTodos()) {
			System.out.println("Codigo : " + p.getCodigo());
			System.out.println("Operadora" + p.getOperadora());
		}
		
//		PlanoDeSaudeDao dao = new PlanoDeSaudeDao();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		
//		System.out.println(dao.listarTodos().size());
//		
//		for (PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println("*****");
//			System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDao dao2 = new PlanoDeSaudeDao();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
		
		
	}

}
