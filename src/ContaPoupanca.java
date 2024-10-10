public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente c1) {
        super(c1);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirDadosConta();
    }
}
