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

		//TODO código assim por questoes de simplicidade na sala de aula, podem conclui-lo
		origem.sacar(montante);
		destino.depositar(montante);
	}
	
	/**
	 * Método para realizar depósito de valores
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
	 * Método Getter para a variável agencia
	 *
	 * @return a variável agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Ajusta a variável agencia
	 *
	 * @param agencia a variável agencia a ser ajustada
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Método Getter para a variável conta
	 *
	 * @return a variável conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * Ajusta a variável conta
	 *
	 * @param conta a variável conta a ser ajustada
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * Método Getter para a variável titular
	 *
	 * @return a variável titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Ajusta a variável titular
	 *
	 * @param titular a variável titular a ser ajustada
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Método Getter para a variável saldo
	 *
	 * @return a variável saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Ajusta a variável saldo
	 *
	 * @param saldo a variável saldo a ser ajustada
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
}
