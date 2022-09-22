package br.senai.sp.jandira.testes;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TestArrayList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// =new PlanoDeSaude(); => método construtor da classe
//		// faz a construção da classe
//		//
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//		// Vetor de classe com 3 planosde saúde
//		PlanoDeSaude[] planos = { plano1, 
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "Ouro")};
//		
//		
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//		
//		// int []notas =new int [3];
//		// notas[0] = 5;
//		// notas[1] = 8;
//		// notas[2] = 7;
//
//		
//			//fazendo araylist no lugar de vetor
//					//tipo
//		ArrayList<String> cidades = new ArrayList<>();
//		//colocando strig
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuiba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//		
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med","exclusivo" ));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//		
//		
//		planos2.add(planoNovo);
//		
//		//adicionar o tipo de plano no plano Notedrame
//		
//		planos2.get(0).setTipoDoPlano("Basic");
//		System.out.println(planos2.get(4).getDadoDoPlano());
//		System.out.println(planos2.get(0).getDadoDoPlano());
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil","Basicc");
		PlanoDeSaude plano2 = new PlanoDeSaude("Alians","Bronze");
		
		PlanoDeSaudeDao dao = new PlanoDeSaudeDao(plano1);
		
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		System.out.println(dao.listarTodos());
	}

}
