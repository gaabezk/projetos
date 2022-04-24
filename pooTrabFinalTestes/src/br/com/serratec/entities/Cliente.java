package br.com.serratec.entities;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String senha;
	private String telefone;
	
	public Cliente(String nome, String cpf, String senha, String telefone) {
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
		return	 "nome: "
				+ nome 
				+ "\ncpf: "
				+ cpf
				+ "\ntelefone: "
				+ telefone;
	}
	
	
	
	
}
