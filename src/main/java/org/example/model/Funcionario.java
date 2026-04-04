package org.example.model;

public class Funcionario {
    protected int ID;
    protected String name;
    protected String email;
    protected String senha;

    public Funcionario(int ID, String name, String email, String senha) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }
    public String gerarRelatorio(){
        return "relatorio gerado!";
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
