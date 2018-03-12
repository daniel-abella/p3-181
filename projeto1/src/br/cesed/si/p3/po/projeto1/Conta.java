package br.cesed.si.p3.po.projeto1;

/**
 * Classe Conta.
 * 
 * @author daniel.abella
 */
public abstract class Conta implements Tributavel {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;

	/**
	 * Construtor para a classe Conta.java 
	 *
	 * @param agencia
	 * @param conta
	 * @param titular
	 * @param saldo
	 */
	public Conta(int agencia, int conta, String titular, double saldo) {
		this(agencia,conta,titular);
		this.saldo = saldo;
	}
	
	public final void transferir(Conta origem, Conta destino, double montante) throws ValorInvalidoException, SaldoInsuficienteException {

		//TODO c�digo assim por questoes de simplicidade na sala de aula, podem conclui-lo
		origem.sacar(montante);
		destino.depositar(montante);
	}
	
	/**
	 * M�todo para realizar dep�sito de valores
	 * 
	 * @param montante valor a ser depositado
	 * @throws ValorInvalidoException 
	 */
	public void depositar(double montante) throws ValorInvalidoException {
		
		if(montante > 0) {
			saldo += montante;	
		} else {
			throw new ValorInvalidoException();
		}
	}

	/**
	 * M~etodo para sacar o valor
	 * 
	 * @param montante valor a ser sacado
	 * @throws SaldoInsuficienteException 
	 */
	public void sacar(double montante) throws SaldoInsuficienteException {
		
		if(montante > 0 && saldo >= montante) {
			saldo -= montante;	
		} else {
			throw new SaldoInsuficienteException();
		}
	}
	
	/**
	 * Construtor para a classe Conta.java
	 *
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	/**
	 * M�todo Getter para a vari�vel agencia
	 *
	 * @return a vari�vel agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Ajusta a vari�vel agencia
	 *
	 * @param agencia a vari�vel agencia a ser ajustada
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * M�todo Getter para a vari�vel conta
	 *
	 * @return a vari�vel conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * Ajusta a vari�vel conta
	 *
	 * @param conta a vari�vel conta a ser ajustada
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * M�todo Getter para a vari�vel titular
	 *
	 * @return a vari�vel titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Ajusta a vari�vel titular
	 *
	 * @param titular a vari�vel titular a ser ajustada
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * M�todo Getter para a vari�vel saldo
	 *
	 * @return a vari�vel saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Ajusta a vari�vel saldo
	 *
	 * @param saldo a vari�vel saldo a ser ajustada
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
}
