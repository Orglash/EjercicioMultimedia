package com.company;

public class ListaMultimedia {

    private Multimedia[] lista;
    private int contador;

    public ListaMultimedia(int capacidad) {
        lista = new Multimedia[capacidad];
        contador = 0;
    }

    public int size() {
        return contador;
    }

    private boolean llena() {
        return contador == lista.length;
    }

    public boolean add(Multimedia m) {
        if (llena()) {
            return false;
        } else {
            lista[contador] = m;
            contador++;
            return true;
        }
    }

    public Multimedia get(int posicion) {
        if (posicion == contador) {
            System.out.println("La posicion esta aun sin usar");
        }
        return lista[posicion];
    }

    public String toString() {
        String infoLista = "";
        for (int i = 0; i < contador; i++) {
            infoLista += lista[i].toString() + "\n";

        }
        return infoLista;
    }

}
