public class Trabajador extends Estudiante{
    private String empresa;
    private double salario;

    public Trabajador(String nombre, int edad, String carrera, String empresa, double salario){
        super(nombre, edad, carrera);
        this.empresa = empresa;
        this.salario = salario;
    }

    public void saludar(){
        System.out.println("Hola mi nombre es " + nombre + " trabajo en " + empresa + " y mi salario es " + salario + " ya que estudie " + carrera);
    }
}
