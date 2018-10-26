package com.soa.ws.RestWs;

public class Sumatori{

    private final int numero1;
    private final int numero2;

    public Sumatori(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int sumar(){return numero1+numero2;}
}
