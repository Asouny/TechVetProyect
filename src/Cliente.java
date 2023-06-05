
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orozc
 */
public class Cliente extends Persona implements Serializable{
    private int mascotas;
    public int id;
    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "mascotas=" + mascotas + ", id=" + id + '}';
    }

    public Cliente(int id, String nombre, String sexo, int edad,int mascotas) {
        super(nombre, sexo, edad,id);
        this.id = id;
        this.mascotas=mascotas;
    }

    public int getMascotas() {
        return mascotas;
    }

    public void setMascotas(int mascotas) {
        this.mascotas = mascotas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void guardar(DataOutputStream fcs) { //fcs = flujo de caracteres de salida
        
        try {
            fcs.writeInt(id);
            fcs.writeUTF(nombre); //utf es el formato de texto o cadena 
            fcs.writeUTF(sexo);
            fcs.writeInt(edad);
            fcs.writeInt(mascotas);
            fcs.flush();
            
        } catch (IOException ex) {
        }
    }//guardar
}
