package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteDono {
    protected int ID;
    protected String name;
    protected String email;
    protected String senha;
    private static int contador = 1;
    private List<Animal> animalList = new ArrayList<>();

    public ClienteDono(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.ID = contador;
        contador++;
    }

    public void adicionarAnimal(Animal animal){
        this.animalList.add(animal);
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

    @Override
    public String toString() {
        return "ClienteDono{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
