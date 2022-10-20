package contaBanco_Encapsulado;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void transfere(double valor, Conta destino) {
	    if(super.saldo >= valor){
	        super.saldo -= valor;
	        destino.deposita(valor);    
	}
}
}