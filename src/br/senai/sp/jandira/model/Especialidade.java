package br.senai.sp.jandira.model;

public class Especialidade {
	//privado
	//não deixamos 
	 private String nome;

	 //método de acesso getters and setters acessar os atributos
	 //não diretamente
	 //setando o nome
	 //setNome  void (para não retornar) usar para pegar o nome e guardar no atributo nome
	 //set será sempre void
	 //guardar a variavel que vai receber o nome
	 //quando chma o setNome tenho que passar uma string para ele
	//criando o método set, para pegar do ClinicaApp.java "cardiologia" e guardar no String "nome", que está em público
	 public void setNome (String novoNome) {
		 nome = novoNome;
		 
	 }
	 
	 //criando o get nome retornando uma string
	 //prescisamos pegar o nome 
	 //metodo para retornar, então string
	 
	  public String getNome() {
		  //return o que quero que retorne
		  return nome;
	  }
}
