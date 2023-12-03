/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

/**
 *
 * @author fernandadourado
 */
public class Usuario {
    private int codigoAdm;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String dataNasci;

    private Usuario(Builder builder) {
        this.codigoAdm = builder.codigoAdm;
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.senha = builder.senha;
        this.dataNasci = builder.dataNasci;
    }

    public int getCodigoAdm() {
        return codigoAdm;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getDataNasci() {
        return dataNasci;
    }

    public static class Builder {
        private int codigoAdm;
        private String nome;
        private String cpf;
        private String email;
        private String senha;
        private String dataNasci;

        public Builder comCodigoAdm(int codigoAdm) {
            this.codigoAdm = codigoAdm;
            return this;
        }

        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder comCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder comEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder comSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Builder comDataNasci(String dataNasci) {
            this.dataNasci = dataNasci;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }
}
