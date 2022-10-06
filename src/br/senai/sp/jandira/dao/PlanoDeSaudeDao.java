package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao { //Simular banco de dados
	
	//precisamos do PLano de saúde 
	//classe dao precisa do objeto que vai manipular
	
	private PlanoDeSaude planoDeSaude;
	//lista onde vai guarda// "banco de dados"
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
	
	//construtor
	public PlanoDeSaudeDao(PlanoDeSaude planoDeSaude) {
		this.planos.add(planoDeSaude);
	}
	
	public PlanoDeSaudeDao() {
		
	}
	//deixar estâtico para não precisar criar instâncias
	public static void gravar (PlanoDeSaude planoDeSaude) {
		
		//grava o plano de saude no planos
		planos.add(planoDeSaude);
	}
	
	public static ArrayList<PlanoDeSaude> listarTodos() {
		//retorna a arreyLIst
		return planos;
	}
        
        public static void criarPlanoDeSaudeTeste(){
        PlanoDeSaude plano1 = new PlanoDeSaude("Amil","Basicc");
	PlanoDeSaude plano2 = new PlanoDeSaude("Alians","Bronze");
	PlanoDeSaude plano3 = new PlanoDeSaude("Unimed","Prata");
	PlanoDeSaude plano4 = new PlanoDeSaude("Notedrame","Advacend");
        planos.add(plano1);
        planos.add(plano2);
        planos.add(plano3);
        planos.add(plano4);
        
    }
	public static DefaultTableModel getTableModel(){
            
            // Matriz que receberá s planos de saúde
            // que serão utiizados na Tabela (Jtable)
            Object[][] dados = new Object[planos.size()][3];
            
            // For Each, para extrair cada objeto plano de saúde do 
            // arrayList planos e separar cada dado na matriz dados
            int i = 0;
            for(PlanoDeSaude p : planos){
               dados[i][0] = p.getCodigo();
               dados[i][1] = p.getOperadora();
               dados[i][2] = p.getTipoDoPlano();
               i++;
            }
        // Defnir um vetor com os nomes das colunas da tabela 
        String[] titulos = {"Código", "Nome da operadora","Tipo do Plano"};
        
        // Criar o modelo que será utilizado pela JTable
        // para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        
        return tableModel;
        }
}
