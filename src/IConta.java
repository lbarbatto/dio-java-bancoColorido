public interface IConta {
    void depositar(double valor);

    void sacar(double valor);

    void tronsferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
