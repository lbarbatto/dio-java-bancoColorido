public class Cliente {
    private String nome;
    private String cpf;
    private Categoria categoria;

    public Cliente(String nome, String cpf, Categoria categoria) {
        this.nome = nome;
        this.cpf = cpf;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
