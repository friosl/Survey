package com.company;

public class Persona {
    private String nombre;
    private int edad;
    public Persona(){};
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String val){
        this.nombre=val;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int val){
        this.edad=val;
    }
}

