package br.com.serratec.conta;

public class ContaCorrente extends Conta {

	private double limiteEmprestimo;

	public ContaCorrente(String agencia, String cPFtitular, double limiteEmprestimo) {
		super(agencia, cPFtitular);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	@Override
	public String toString() {
		return "Limite de Emprestimo: " 
				+ limiteEmprestimo
				+ "\nAgencia: "
				+ agencia
				+ "\ncPFtitular: "
				+ cPFtitular
				+ "\nsaldo: "
				+ saldo;
	}

	public void pedirEmprestimo(double valor){
		this.limiteEmprestimo -= valor;
	}
	
}
