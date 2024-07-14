package Taller;
public class Main {
    public static void main(String []args){
        Profesor profesor = new Profesor("Juan", "Guitierrez", 4);
        profesor.mostrarInfo();
        profesor.cantidadDeFaltas();

        Alumno alumno = new Alumno("Walter", "Mosquera",9.50);
        alumno.mostrarInfo();
        alumno.Reunion();
        alumno.notaFinal();
    }
}