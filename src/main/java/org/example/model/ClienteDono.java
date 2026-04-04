package org.example.model;

public class ClienteDono {
    protected int ID;
    protected String name;
    protected String email;
    protected String senha;

    public ClienteDono(int ID, String name, String email, String senha) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public int getID() {

        return ID;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
