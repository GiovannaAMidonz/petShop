package org.example.model;

public class Ordem {
    protected int ID;
    protected int formaDePagamento;
    protected int desconto;

    public Ordem(int ID, int formaDePagamento, int desconto) {
        this.ID = ID;
        this.formaDePagamento = formaDePagamento;
        this.desconto = desconto;
    }

    public int calcularTotal(int precoBase,int desconto){
        return precoBase/desconto;
    }
    public int getID() {
        return ID;
    }

    public int getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(int formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
