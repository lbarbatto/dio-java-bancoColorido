public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joao", "09876", Categoria.BASICO);
        Cliente c2 = new Cliente("Pedro", "12345", Categoria.EXCLUSIVO);


        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(120);
        cc.imprimirExtrato();
        cc.sacar(10);
        cc.tronsferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}