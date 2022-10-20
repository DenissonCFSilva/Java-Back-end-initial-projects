package contaBanco_Encapsulado;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
    private Cliente titular;
	
    public Conta (int numero, int agencia) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando conta");
	}
	public void deposita(double valor){
		this.saldo += valor;
	}
	public void saca(double valor) throws SaldoInsuficiente {
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo: " + this.saldo + " Valor: " + valor);
		}
		this.saldo -= valor;
	}
	public void transfere(double valor, Conta destino) throws SaldoInsuficiente{
		this.saca(valor);
		destino.deposita(valor);
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia){
	       if(agencia <= 0) {
	           System.out.println("Nao pode valor menor ou igual a 0");
	           return;}
	       this.agencia = agencia;
	       }
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
}
