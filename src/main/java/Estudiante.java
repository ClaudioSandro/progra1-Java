public class Estudiante extends Persona{
    protected String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + " , estoy estudiando " + carrera + " y tengo " + getEdad());
    }

    public String getCarrera(){
        return this.carrera;
    }
}
