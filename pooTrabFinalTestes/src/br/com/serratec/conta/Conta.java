package br.com.serratec.conta;

abstract class Conta {

	protected String agencia;
	protected String cPFtitular;
	protected String senha;
	protected double saldo;
	
	public Conta(String agencia, String cPFtitular) {
		this.agencia = agencia;
		this.cPFtitular = cPFtitular;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCPFtitular() {
		return this.cPFtitular;
	}

	public void setCPFtitular(String cPFtitular) {
		this.cPFtitular = cPFtitular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposito(double quantidade) {
		this.saldo += quantidade;
	}
	public void saque(double quantidade) {
		if(this.saldo > quantidade) {
			this.saldo -= quantidade;
		}
		
	}
	
	@Override
	public String toString() {
		return "Agencia: " 
				+ agencia 
				+ "\nCPFtitular: " 
				+ cPFtitular 
				+ "\nsaldo: " 
				+ saldo;
	}
	
	

}
