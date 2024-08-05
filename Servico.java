public abstract class Servico {
    private String descricao;

    public Servico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularPreco();
}
