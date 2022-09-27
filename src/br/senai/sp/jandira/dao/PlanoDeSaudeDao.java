package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDao { //Simular banco de dados
	
	//precisamos do PLano de saúde 
	//classe dao precisa do objeto que vai manipular
	
	private PlanoDeSaude planoDeSaude;
	//lista onde vai guarda// "banco de dados"
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
	
	//construtor
	public PlanoDeSaudeDao(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public PlanoDeSaudeDao() {
		
	}
	
	public void gravar (PlanoDeSaude planoDeSaude) {
		
		//grava o plano de saude no planos
		planos.add(planoDeSaude);
	}
	
	public static ArrayList<PlanoDeSaude> listarTodos() {
		//retorna a arreyLIst
		return planos;
	}
	
}
