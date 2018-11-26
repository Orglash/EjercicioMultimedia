package com.company;

public class Main {



    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);
        Pelicula pelicula;
        int posicion;
        lista.add(new Pelicula("Arma Fatal", "Edgar Wright", Formato.avi, 121, "Simon Pegg",
                null));
        lista.add(new Pelicula("Alien, el octavo pasajero", "Ridley Scott", Formato.avi, 116, "Tom Skerritt", "Sigourney Weaver"));
        lista.add(new Pelicula("Gracias por fumar", "Jason Reitman", Formato.avi, 92, "Aaron Eckhart", "Katie Holmes"));

        System.out.println(lista.toString());

    }
}
