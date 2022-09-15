package br.senai.sp.jandira;
import javax.swing.JOptionPane;

//fora do métodos e deentro diretamente da classe ClinicaApp
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		Especialidade especialidade = new Especialidade();
		//o que será guardada no atributo nome é nada, porque não espera nada
		//essse testo tem que ser recebido na classe
		//cardiologia vai ser guardada no novoNome
		
		especialidade.setNome("Cardiologia");

		//agora quero mostrar o nome da especialidade, testando
		//quero pegar o nome 
		//usa-se get, então c 
		System.out.println(especialidade.getNome());
		
		//testando
		PlanoDeSaude plano = new PlanoDeSaude();
		
		plano.setOperadora("Unimod");
		plano.setTipoDoPlano("bronze");
		
		//exibição co o JOPTION pane
		JOptionPane.showMessageDialog(null, plano.getDadoDoPlano());
		
		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("Bradesco");
		planoBradesco.setTipoDoPlano("Ouro");
		
		JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());
	}

}
