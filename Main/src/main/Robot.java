
package main;

public class Robot {
    
    //Atributos
    String Nombre;
    int Edad, CuadrasRecorridas, Descansar;
    int Cansado = 0;
    
    
    //Constructor
    public Robot(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    //Getters & Setters

    public int getCuadrasRecorridas() {
        return CuadrasRecorridas;
    }

    public void setCuadrasRecorridas(int CuadrasRecorridas) {
        this.CuadrasRecorridas = CuadrasRecorridas;
    }

    public int getCansado() {
        return Cansado;
    }

    public void setCansado(int Cansado) {
        this.Cansado = Cansado;
    }
    
    //
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
}
