package br.com.serratec.entities;

abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected String senha;
	protected String telefone;
	
	public Funcionario(String nome, String cpf, String senha, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.telefone = telefone;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	@Override
	public String toString() {
		return 	"Nome: "
				+ nome 
				+ "\nCPF: "
				+ cpf
				+ "\nTelefone: "
				+ telefone;
	}
	
	
	
}