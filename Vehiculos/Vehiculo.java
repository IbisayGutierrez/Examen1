/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Student
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Matricula;

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public Vehiculo(String Marca, String Modelo, String Matricula) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Matricula = Matricula;
    }

    public Vehiculo() {
        this(" "," "," ");
    }
    
    public void visualizar(){
        
    }

    public void actualizar(){
        
    }
    
    public void espera(){
        
    }
    
    public void contarVehiculos(){
     
    }
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Matricula=" + Matricula + '}';
    }
   
    
}
