package org.MendezGalindoEmiliano.pixup.model;

public class Disquera extends Catalogo
{
    private String nombre;

    public Disquera()
    {
    }

    public Disquera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Disquera{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
