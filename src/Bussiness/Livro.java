/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

/**
 *
 * @author fernandadourado
 */
public class Livro {
    
    private String titulo;
    private String subtitulo;
    private String autor;
    private String editora;
    private String datapublicacao;

    private Livro(Builder builder) {
        this.titulo = builder.titulo;
        this.subtitulo = builder.subtitulo;
        this.autor = builder.autor;
        this.editora = builder.editora;
        this.datapublicacao = builder.datapublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getDatapublicacao() {
        return datapublicacao;
    }

    public static class Builder {
        private String titulo;
        private String subtitulo;
        private String autor;
        private String editora;
        private String datapublicacao;

        public Builder comTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder comSubtitulo(String subtitulo) {
            this.subtitulo = subtitulo;
            return this;
        }

        public Builder comAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder comEditora(String editora) {
            this.editora = editora;
            return this;
        }

        public Builder comDataPublicacao(String datapublicacao) {
            this.datapublicacao = datapublicacao;
            return this;
        }

        public Livro build() {
            return new Livro(this);
        }
    }
}