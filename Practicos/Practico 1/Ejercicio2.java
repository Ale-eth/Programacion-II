package Practico_1.Ej2;

public class Electrodomestico{
    // Atributos por defecto
    String nombre;
    double preciobase = 100;
    String color = "grisplata";
    double consumokwh = 10;
    double pesokg = 2;

    // Constructores
    public Electrodomestico(String nombre){
        this.nombre = nombre;
    }

    // Comportamiento
        // get
    public String getNombre(){
        return this.nombre;
    }
    public double getPreciobase(){
        return this.preciobase;
    }
    public String getColor(){
        return this.color;
    }
    public double getConsumokwh(){
        return this.consumokwh;
    }
    public double getPesokg(){
        return this.pesokg;
    }

        // set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPreciobase(double preciobase){
        this.preciobase = preciobase;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setConsumokwh(double consumokwh){
        this.consumokwh = consumokwh;
    }
    public void setPesokg(double peso){
        this.pesokg = pesokg;
    }

    // metodos
    public boolean esBajoConsumo(){
        return this.consumokwh < 45;
    }
    public double calcularBalance(){
        return this.preciobase/this.pesokg;
    }
    public boolean altaGama(){
        return calcularBalance()>3;
    }
}
