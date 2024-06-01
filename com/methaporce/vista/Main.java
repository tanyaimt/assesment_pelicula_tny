package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de GestorPelicula
        GestorPelicula gestor = new GestorPelicula();

        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "Furious", true);
        Pelicula pelicula2 = new Pelicula(2, "Inside Out", false);
        Pelicula pelicula3 = new Pelicula(3, "Dune", true);

        // Agregar películas al gestor
        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);

        // Eliminar una película
        gestor.eliminarPelicula(1);

        // Marcar una película como disponible
        gestor.marcarPeliculaComoDisponible(2);

        // Mostrar la lista de películas no disponibles
        System.out.println("Películas no disponibles:");
        for (Pelicula p : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(p);
        }

        // Mostrar la lista de todas las películas
        System.out.println("Todas las películas:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }
    }
}
