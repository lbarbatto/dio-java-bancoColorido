public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = new Cliente(cliente.getNome(), cliente.getCpf(), cliente.getCategoria());
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void tronsferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    protected void imprimirDadosConta() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Categoria: %s%n", this.cliente.getCategoria());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
