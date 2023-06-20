package logica.untitled2.src;

import java.time.LocalDate;

public class Filme {
    private String nome;
    private String categoria;
    private String duracao;
    private String sinopse;
    private String valorInteira;
    private String valorMeia;
    private LocalDate data;
    private String sala;
    private String horario;
    private String idadeMinima;
    private String caminho_da_img;

    public Filme(String nome, String categoria, String duracao, String sinopse, String valorInteira, String valorMeia, LocalDate data, String sala, String horario, String idadeMinima, String caminho_da_img) {
        this.nome = nome;
        this.categoria = categoria;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;
        this.data = data;
        this.sala = sala;
        this.horario = horario;
        this.idadeMinima = idadeMinima;
        this.caminho_da_img = caminho_da_img;
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

    public String getValorInteira() {
        return valorInteira;
    }

    public String getValorMeia() {
        return valorMeia;
    }

    public String getIdadeMinima() {
        return idadeMinima;
    }

    public LocalDate getData() {
        return data;
    }

    public String getSala() {

        return sala;
    }

    public String getHorario() {
        return horario;
    }
    public String getCaminho_da_img() {
        return caminho_da_img;
    }

//sa
    @Override
    public String toString() {
        return "Nome: " + nome + " | Categoria: " + categoria + " | Duração: " + duracao + " | Sinopse: " + sinopse + " | Valor Meia: " + valorMeia;
    }
}
