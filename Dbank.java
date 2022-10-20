package contaBanco_Encapsulado;

public class Dbank {

	public static void main(String[] args) {
		ContaCorrente contac = new ContaCorrente(156, 544);
		ContaPoupanca contap = new ContaPoupanca(8836, 0554);
		contac.deposita(100);
		System.out.println("Saldo: " + contac.getSaldo());
		System.out.println(contac.getAgencia() + " " +  contac.getNumero() );
		System.out.println(contac.getSaldo());
		System.out.println(contap.getSaldo());
		contac.transfere(80, contap);
		System.out.println(contac.getSaldo());
		System.out.println(contap.getSaldo());
		ContaCorrente conta = new ContaCorrente(888, 002);
		conta.deposita(50);
		System.out.println(conta.getSaldo());
		try {
			conta.saca(20);
		} catch (SaldoInsuficiente ex) {
			System.out.println("EX: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		System.out.println(conta.getValorImposto());
		try {
			conta.saca(200);
		} catch (SaldoInsuficiente ex) {
			System.out.println("EX: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
	}

}