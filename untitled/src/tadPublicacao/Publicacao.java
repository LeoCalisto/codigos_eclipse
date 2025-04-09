package tadPublicacao;

import java.time.LocalDateTime;

public class Publicacao {
    private static int contadorId = 1;
    private int id;
    private String autor;
    private String conteudo;
    private LocalDateTime data;

    public Publicacao(String autor, String conteudo) {
        this.id = contadorId++;
        this.autor = autor;
        this.conteudo = conteudo;
        this.data = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", data=" + data +
                '}';
    }
}
