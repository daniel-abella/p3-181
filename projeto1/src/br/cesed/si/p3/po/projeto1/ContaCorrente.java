package br.cesed.si.p3.po.projeto1;

/**
 * Classe Conta Corrente.
 *
 * @author aluno
 *
 */
public final class ContaCorrente extends Conta {
	
	public static final double TARIFA_MOVIMENTACAO_CONTA_CORRENTE = 0.5;

	/**
	 * Construtor para a classe ContaCorrente.java
	 *
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 */
	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}

	/**
	 * Construtor para a classe ContaCorrente.java
	 *
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	@Override
	public void depositar(double montante) throws ValorInvalidoException {
		montante = montante - getTributo();
		super.depositar(montante);
	}
	
	@Override
	public void sacar(double montante) throws SaldoInsuficienteException {
		montante = montante - getTributo();
		super.sacar(montante);
	}
	
	@Override
	public double getTributo() {
		return TARIFA_MOVIMENTACAO_CONTA_CORRENTE;
	}
	
}
