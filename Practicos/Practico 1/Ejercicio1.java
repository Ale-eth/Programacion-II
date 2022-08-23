
package Practico_1.Ej1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // Atributos por defecto
    int dni;
    LocalDate fnacimiento = LocalDate.of(2000,01,01);
    String sexo = "Femenino";
    String nombre = "N";
    String apellido = "N";
    double peso = 1;
    double altura = 1;

    // Constructores
    public Persona(int dni){
        this.dni = dni;
    }

    public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fnacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnacimiento = fnacimiento;
    }

    // Comportamiento
    public double getIMC(double peso, double altura){
        return peso/(altura*altura);
    }

    public boolean getFit(double peso, double altura){
        double imc = getIMC(peso, altura);

        if(imc>= 18.5 && imc<=25){
            return true;
        }else{
            return false;
        }
    }

    public boolean getBirthday(LocalDate fnacimiento){
        LocalDate hoy = LocalDate.now();
        if(fnacimiento == hoy){
            return true;
        }else{
            return false;
        }
    }

    public boolean get18(LocalDate fnacimiento){
        LocalDate hoy = LocalDate.now();
        Period period = Period.between(hoy, fnacimiento);

        if(period.getYears()>=18){
            return true;
        }else{
            return false;
        }
    }

    public boolean getVotar(LocalDate fnacimiento){
        LocalDate hoy = LocalDate.now();
        Period period = Period.between(hoy, fnacimiento);

        if(period.getYears()>=16){
            return true;
        }else{
            return false;
        }
    }

    public boolean getValidarEdad(LocalDate fnacimiento){   // Terminar, no se como hacerlo
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(hoy, fnacimiento);
    }

    public String getInfo(int dni, LocalDate fnacimiento, String sexo, String nombre, String apellido, double peso, double altura){
        String data;
        data = (
                "Nombre: "+nombre+
                "Apellido: "+apellido+
                "DNI: "+dni+
                "Peso: "+peso+" kgs"+
                "Altura: "+altura+" cms"
                );
    }

    // Set atributos
    public void setFnacimiento(LocalDate fnacimiento){
        this.fnacimiento = fnacimiento;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

}
