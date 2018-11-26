package com.company;

public class Main {



    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);
        Pelicula pelicula;
        int posicion;
        lista.add(new Pelicula("Millon dollar baby", "Clint EastWood", Formato.avi, 137, "Clint Eastwood",
                "Hillary Swank"));
        lista.add(new Pelicula("Mar adentro", "Alejandro Amenabar", Formato.avi, 125, "Javier Bardem", "Belen Rueda"));
        lista.add(new Pelicula("El aviador", "Martin Scorsese", Formato.avi, 168, "Leonardo di Caprio", null));

        System.out.println(lista.toString());

    }
}
