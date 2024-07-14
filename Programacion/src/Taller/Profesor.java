package Taller;

public class Profesor extends Usuario{
    private int faltas;

    public Profesor(String nombre, String apellido, int faltas){

        super(nombre, apellido);
        this.faltas = faltas;
    }

    public void cantidadDeFaltas() {
        faltas++;
        if (faltas >= 3) {
            System.out.println("Se ha enviado un correo al profesor");
        } else {
            System.out.println("Cantidad de faltas actual: " + this.faltas);
        }
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
