package com.company;

import java.util.Objects;

enum Formato {
    wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
}

public class Multimedia {

    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected double duracion;

    public Multimedia(String titulo, String autor, Formato formato, double duracion) {

        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return "\nTítulo: " + titulo + " \nAutor: " + autor + " \nFormato: " + formato + " \nDuración: " + duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return  Objects.equals(titulo, that.titulo) &&
                Objects.equals(autor, that.autor);
    }

}