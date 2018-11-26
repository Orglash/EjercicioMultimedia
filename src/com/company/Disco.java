package com.company;

public class Disco extends Multimedia {
    private String genero;

    public Disco(String titulo, String autor, Formato formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero ;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String infoDisco="\nGenero: ";
        infoDisco+= genero;
        return super.toString() + infoDisco;
    }
}
