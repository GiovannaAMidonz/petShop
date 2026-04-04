package org.example.model;

public class Ordem {
    protected int ID;
    protected String formaDePagamento;
    protected int desconto;

    public Ordem(int ID, String formaDePagamento, int desconto) {
        this.ID = ID;
        this.formaDePagamento = formaDePagamento;
        this.desconto = desconto;
    }

    public int calcularTotal(int precoBase){
        return precoBase;
    }
    public int getID() {
        return ID;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
