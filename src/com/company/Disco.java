package com.company;

public class Disco extends Multimedia {
    private String genero;

    public Disco(String titulo, String autor, Formato formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero= " + genero ;
    }
}
