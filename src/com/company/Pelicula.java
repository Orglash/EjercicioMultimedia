package com.company;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null) {
            System.out.println("Los datos estan vacíos.");
        }
        actorPrincipal = actor;
        actrizPrincipal = actriz;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String toString() {
        String infoPeli = "Protagonizado por: ";
        if (actrizPrincipal != null) {
            infoPeli += actrizPrincipal;
            if (actorPrincipal != null) {
                infoPeli += " y " + actorPrincipal;
            }
        }else{
            if (actorPrincipal != null) {
                infoPeli += " y " + actorPrincipal;
            }
        }
        return super.toString() + infoPeli;
    }

}