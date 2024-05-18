/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameRush;

/**
 *
 * @author axell
 */
public class Productos {
    
    String nombre_producto = "";
    String tipo_producto;
    float precio=0F;
    String clasificacion;
    int codigo_de_barras;
    
    public void setNombre_producto (String nombre_producto){
            this.nombre_producto = nombre_producto;
}
    public String getNombre_producto()
    {return nombre_producto;
    }  
    public void setTipo_producto (String tipo_producto){
        this.tipo_producto = tipo_producto;
    }
    public String getTipo_producto(){
        return tipo_producto;
    }
    public void setPrecio (float precio){
        this.precio = precio;
    }
    public float getPrecio(){
        return precio;
    }
    public void setClasificacion (String clasificacion){
        this.clasificacion = clasificacion;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public void setCodigo_de_barras (int codigo_de_barras){
        this.codigo_de_barras = codigo_de_barras;
    }    
    public int getCodigo_de_barras(){
        return codigo_de_barras;
    }

    public void mostrar(){
        System.out.println("Nombre del producto: "+getNombre_producto());
        System.out.println("Tipo de producto: "+getTipo_producto());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Cant del producto: "+getClasificacion());
        System.out.println("Codigo de barras: "+getCodigo_de_barras());
    }
    
    public static void main(String[] args) {
        Productos producto1 = new Productos();
        Productos producto2 = new Productos();
        Productos producto3 = new Productos();
        Productos producto4 = new Productos();
        
        producto1.setNombre_producto("3 mosqueteros");
    producto1.setTipo_producto("Comida");
    producto1.setPrecio(153);
    producto1.setClasificacion("sin clasificacion");
    producto1.setCodigo_de_barras(187653);
    System.out.print(producto1);
    
    producto2.setNombre_producto("Indiana Jones");
    producto2.setTipo_producto("Pelicula");
    producto2.setPrecio(200);
    producto2.setClasificacion("B-12");
    producto2.setCodigo_de_barras(1753472);
    System.out.print(producto2);
    
    producto3.setNombre_producto("GTA V");
    producto3.setTipo_producto("Videojuego");
    producto3.setPrecio(153);
    producto3.setClasificacion("C-para mayores de 18");
    producto3.setCodigo_de_barras(1852476);
    System.out.print(producto3);
    
    producto4.setNombre_producto("Dualshock 4");
    producto4.setTipo_producto("Periferico");
    producto4.setPrecio(1500);
    producto4.setClasificacion("sin clsificacion");
    producto4.setCodigo_de_barras(765189);
    System.out.print(producto4);
    }

    @Override
    public String toString() {
        return "Productos{" + "Nombre del producto= " + nombre_producto 
                + ", Tipo de producto= " + tipo_producto +
                ", Precio=" + precio + ", Clasificacion= " + clasificacion +
                ", Codigo de barras= " + codigo_de_barras + '}';
    }
    
    
}

class Ventas {
    
    int no_caja;
    String no_producto;
    float ingreso=0F;
    int fecha;
    int numero_de_barras;
    
    public void setNo_caja (int no_caja){
            this.no_caja = no_caja;
}
    public int getNo_caja()
    {return no_caja;
    }  
    public void setNo_producto (String no_producto){
        this.no_producto = no_producto;
    }
    public String getNo_producto(){
        return no_producto;
    }
    public void setIngreso (float ingreso){
        this.ingreso = ingreso;
    }
    public float getIngreso(){
        return ingreso;
    }
    public void setFecha (int fecha){
        this.fecha = fecha;
    }
    public int getFecha(){
        return fecha;
    }
    public void setNumero_de_barras (int numero_de_barras){
        this.numero_de_barras = numero_de_barras;
    }
    public int getNumero_de_barras(){
        return numero_de_barras;
    }

    public void mostrar(){
        System.out.println("Numero de caja: "+getNo_caja());
        System.out.println("Numero de producto: "+getNo_producto());
        System.out.println("Ingreso: "+getIngreso());
        System.out.println("Fecha: "+getFecha());
        System.out.println("Numero de barras: "+getNumero_de_barras());
    }
    
    public static void main(String[] args) {
        Ventas venta1 = new Ventas();
        Ventas venta2 = new Ventas();
        Ventas venta3 = new Ventas();
        Ventas venta4 = new Ventas();
        
        venta1.setNo_caja(2);
    venta1.setNo_producto("Producto 1");
    venta1.setIngreso(153);
    venta1.setFecha(31/10/22);
    venta1.setNumero_de_barras(187653);
    System.out.print(venta1);
    
    venta2.setNo_caja(1);
    venta2.setNo_producto("Producto 2");
    venta2.setIngreso(200);
    venta2.setFecha(25/11/22);
    venta2.setNumero_de_barras(1753472);
    System.out.print(venta2);
    
    venta3.setNo_caja(2);
    venta3.setNo_producto("Producto 3");
    venta3.setIngreso(153);
    venta3.setFecha(15/12/22);
    venta3.setNumero_de_barras(1852476);
    System.out.print(venta3);
    
    venta4.setNo_caja(1);
    venta4.setNo_producto("Producto 4");
    venta4.setIngreso(1500);
    venta4.setFecha(22/01/23);
    venta4.setNumero_de_barras(765189);
    System.out.print(venta4);
    }

    @Override
    public String toString() {
        return "Ventas{" + "Numero de caja= " + no_caja +
                ", Numero de producto= " + no_producto + ", Ingreso= " + ingreso +
                ", Fecha= " + fecha + ", Numero de barras= " + numero_de_barras + '}';
    }

    
    
    
}
