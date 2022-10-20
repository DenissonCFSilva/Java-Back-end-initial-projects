package contaBanco_Encapsulado;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	@Override
	public void saca(double valor) throws SaldoInsuficiente {
		double valorSaque = valor + 0.2;
		super.saca(valorSaque);
	}
	@Override
	public void transfere(double valor, Conta destino) {
	    if(super.saldo >= valor){
	       super.saldo -= valor;
	        destino.deposita(valor);    
	}
	}
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}