package Taller;

public class Alumno extends Usuario {
    private double promedio;

    public Alumno(String nombre, String apellido, double promedio){

        super(nombre, apellido);

        this.promedio = promedio;
    }

    public void notaFinal(){
        if(promedio >=7){
            System.out.println("El alumno ha aprobado");
        }else{
            System.out.println("El alumno ha reprobado");
        }
    }
    //Este metodo quiere decir que si el promedio en menor a 6 habra reunion prensencial, y si tiene
    //mayor a 6 habra reunio virtual.
    public void Reunion(){
        if(promedio <=6){
            System.out.println("Reunion presencial");
        }else{
            System.out.println("Reunion Virtual");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}

