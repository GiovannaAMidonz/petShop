package org.example.model;

public class Animal {
    protected String especie;
    protected String raca;
    protected String nome;
    protected String historicoMedico;
    protected int ID;

    public Animal(String especie, String raca, String nome, String historicoMedico, int ID) {
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.historicoMedico = historicoMedico;
        this.ID = ID;
    }

    public Animal() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", historicoMedico='" + historicoMedico + '\'' +
                ", ID=" + ID +
                '}';
    }
}
