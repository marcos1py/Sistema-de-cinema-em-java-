package logica.untitled2.src;

public class Filme {
    private String nome;
    private String categoria;
    private String duracao;
    private String sinopse;

    private  String preço;

    private String idadeMinima;

    public Filme(String nome, String categoria, String duracao, String sinopse, String preço,String idadeMinima) {
        this.nome = nome;
        this.categoria = categoria;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.preço = preço;
        this.idadeMinima = idadeMinima;
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

    public String getIdadeMinima(){
        return idadeMinima;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Categoria: " + categoria + " | Duração: " + duracao + " | Sinopse: " + sinopse+ " | Preço: " + preço;
    }
}
