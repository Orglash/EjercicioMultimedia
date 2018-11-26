package com.company;

public class Pelicula extends Multimedia {
    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null) {
            System.out.println("\nSe debe introducir al menos un actor/actriz principal");
        }
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    public String toString() {
        String infoPeli = "\nProtagonizado por: ";
        if (actriz != null) {
            infoPeli += actriz;
            if (actor != null) {
                infoPeli += " y " + actor;
            }
        }else{
            if (actor != null) {
                infoPeli += actor;
            }
        }
        return super.toString() + infoPeli;
    }

}