package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damian
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia inglesUno = new Materia(1, "Ingles I", 1);
        Materia matematicas = new Materia(2, "Matemáticas", 1);
        Materia laboratorioUno = new Materia(3, "Laboratorio 1", 1);
        Alumno lopez = new Alumno(1001, "López", "Martin");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(inglesUno);
        lopez.agregarMateria(laboratorioUno);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(inglesUno);
        martinez.agregarMateria(laboratorioUno);
        martinez.agregarMateria(laboratorioUno);
        System.out.println("Cantidad de materias inscriptas de Lopez: " + lopez.cantidadDeMaterias());
        System.out.println("Cantidad de materias inscriptas de Martinez: " + martinez.cantidadDeMaterias());
    }
    
}
