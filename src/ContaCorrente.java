public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente c1) {
        super(c1);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirDadosConta();
    }


}
