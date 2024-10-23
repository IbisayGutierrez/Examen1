/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Student
 */
public class Cliente {
   private String Id;
   private String Nombre;
   private String NumeroTel;

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNumeroTel() {
        return NumeroTel;
    }

    public void setNumeroTel(String NumeroTel) {
        this.NumeroTel = NumeroTel;
    }

    public Cliente(String Id, String Nombre, String NumeroTel) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.NumeroTel = NumeroTel;
    }


}   
   

