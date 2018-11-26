package com.company;

public class Main {

    public static void main(String[] args) {
        ListaMultimedia listaPelis = new ListaMultimedia(10);
        ListaMultimedia listaDiscos = new ListaMultimedia(20);
        Disco discoRepe;

        listaPelis.add(new Pelicula("Arma Fatal", "Edgar Wright", Formato.avi, 121, "Simon Pegg",null));
        listaPelis.add(new Pelicula("Alien, el octavo pasajero", "Ridley Scott", Formato.avi, 116, "Tom Skerritt", "Sigourney Weaver"));
        listaPelis.add(new Pelicula("Gracias por fumar", "Jason Reitman", Formato.dvd, 92, "Aaron Eckhart", "Katie Holmes"));

        listaDiscos.add(new Disco("En un cortijo grande, el que es tonto se muere de hambre", "Mojinos Escozios", Formato.mp3, 83, "Rock & roll"));
        listaDiscos.add(new Disco("Symphony of Enchanted Lands", "Rhapsody of Fire", Formato.mp3, 56, "Power metal"));
        listaDiscos.add(new Disco("Gyakuten meets Orchestra", "Noriyuki Iwadare", Formato.cdAudio, 96, "OST"));

        System.out.println(listaPelis.toString());
        System.out.println(listaDiscos.toString());

        discoRepe=new Disco("Gyakuten meets Orchestra", "Noriyuki Iwadare", Formato.wav, 0, null);
        System.out.println(discoRepe.toString());

    }
}
