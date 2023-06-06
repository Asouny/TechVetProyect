
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orozc
 */
public class Mascota implements Serializable {
    private String nombre,especie,sexo;
    private int id,edad,clienteID;
    

    public Mascota() {
    }

    public Mascota(String nombre, String especie, String sexo, int clienteID, int id, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.clienteID = clienteID;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCliente() {
        return clienteID;
    }

    public void setCliente(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
}