package contaBanco_Encapsulado;

public class SaldoInsuficiente extends Exception{ //checked

    public SaldoInsuficiente(String msg) {
        super(msg);
    }
}
