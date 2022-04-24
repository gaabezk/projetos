package br.com.serratec.conta;

public class ContaPoupanca extends Conta {

	private double rendimentos;
	
	public ContaPoupanca(String agencia, String cPFtitular) {
		super(agencia, cPFtitular);
	}	
	
	public void render() {
		if(saldo >= 400000.00) {
			rendimentos = saldo *0.007;
		}else if (saldo < 200000.00) {
				rendimentos = saldo *0.003;
		}else {
			rendimentos = saldo *0.005;
		}
		saldo += rendimentos;
	}

	@Override
	public String toString() {
		return 	"Rendimentos no ultimo mês: "
				+ rendimentos
				+ "\nAgencia: "
				+ agencia
				+ "\nCPFtitular: "
				+ cPFtitular
				+ "\nsaldo: "
				+ saldo;
	}
	
}