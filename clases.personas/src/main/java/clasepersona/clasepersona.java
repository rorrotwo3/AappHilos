/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepersona;

/**
 *
 * @author axell
 */
public class clasepersona {
    String curp = "";
    String nombre = "";
    int edad = 0;
    float estatura = 0;
    String nacionalidad = "";
    String genero = "";

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    public void mostrar()
    {
        System.out.println("Curp de la persona" + curp);
        System.out.println(" Nombre " + nombre);
        System.out.println(" Edad "+ edad);
        System.out.println(" Estatura "+ estatura);
        System.out.println(" Nacionalidad" + nacionalidad);
        System.out.println(" Genero "+ genero);            
    }
    //completarlo con lo nuevo del override
    //generar un javabin es el uso de set y de get (pregunta de examen
    public static void main(String[] args) {
        clasepersona axell = new clasepersona("RXBA040812HDGMRXA7", "Axell Roy Romo Bernal", 18, 179, "Mexicana", "masculino");
        axell.setCurp("RXBA040812HDGMRXA7");
        axell.setNombre("Axell Roy Romo Bernal");
        axell.setEdad(18);
        axell.setEstatura(179);
        axell.setNacionalidad("Mexicana");
        axell.genero="maculino";
           System.out.println(axell);
    }

    @Override
    public String toString() {
        return "clasepersona{" + "curp=" + curp + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", nacionalidad=" + nacionalidad + ", genero=" + genero + '}';
    }

    public clasepersona(String curp, String nombre, int edad, float estatura, String nacionalidad, String genero) {
      this.curp = curp;
      this.nombre = nombre;
      this.estatura = estatura;
      this.nacionalidad = nacionalidad;
      this.genero = genero;
    }

    
    
}
