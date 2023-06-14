package logica.untitled2.src;

public class Filme {
    private String nome;
    private String categoria;
    private String duracao;
    private String sinopse;

    private  String preço;

    public Filme(String nome, String categoria, String duracao, String sinopse, String preço) {
        this.nome = nome;
        this.categoria = categoria;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getSinopse() {
        return sinopse;
    }
    public String getPreço() {
        return preço;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " | Categoria: " + categoria + " | Duração: " + duracao + " | Sinopse: " + sinopse+ " | Preço: " + preço;
    }
}
