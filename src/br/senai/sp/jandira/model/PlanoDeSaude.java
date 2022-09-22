package br.senai.sp.jandira.model;

//fora do métodos e deentro diretamente da classe PlanoDeSaude
public class PlanoDeSaude {
	// atributos
	private String operadora;
	private String tipoDoplano;
	
	//construtores
	
	//sempre será público
	//não há retorno (void)
	//o nome do metodo é o nome da classe
	
	public PlanoDeSaude(String operadora) {
		// contrutor que não faz nada padrão/defalt 
		//vamos sobreescrever
		this.operadora = operadora;
	}
	//podemos ter mesma asssinaturas se or argumentos forem diferentes
	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoplano = tipoDoPlano;
		
	}
	
	public PlanoDeSaude() {
		
	}
	
	// craiando metodo de acesso

	// método de acesso

	// vamos falar o que é | nome da variavel que vai ser colocada no atributo |
	// então:
	// método setOperadora vai ser guardada no aributo operadora
	public void setOperadora(String operadora) {
		// dentro do meodo vamos colocar o atributo recebendo o método
		// causamos uma ambiguidade
		// operadora = operadora;
		// para eliminar a ambiguidade
		// "this" => "esse"; faz referência ao atributo da classe; sempre aponta para o
		// atributo
		// variavel só é visivel para esse método
		// OBS cor azul: variavel
		// OBS cor marrom: variável
		this.operadora = operadora;
	}

	//
	public String getOperadora() {
		// por boa prática colocamos this, não precisa
		return this.operadora;
	}

	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoplano = tipoDoPlano;

	}

	public String getTipoDoPlano() {
		return this.tipoDoplano;
	}

	public String getDadoDoPlano() {
		return "Plano:" + this.operadora + "," + this.tipoDoplano;
	}
}
