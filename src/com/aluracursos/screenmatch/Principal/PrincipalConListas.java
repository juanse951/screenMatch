package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto" , 2001);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar" , 2023);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos" , 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

         for (Titulo item: lista) {
             System.out.println("Nombre: " + item.getNombre());
             if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                 System.out.println("Clasificacion: " + pelicula.getClasificacion());
             }
         }

         ArrayList<String> listaDeArtistas = new ArrayList<>();
         listaDeArtistas.add("Penélope Cruz");
         listaDeArtistas.add("Antonio Banderas");
         listaDeArtistas.add("Ricardo Darín");
        System.out.println("Lista de Artistas NO ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }

}
