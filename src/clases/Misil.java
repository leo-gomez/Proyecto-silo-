package clases;

public class Misil {

    private String nombre;
    private String modelo;
    private String composicion;

    public Misil(String nombre, String modelo, String composicion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.composicion = composicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    @Override
    public String toString() {
        return  "==========================================\n"+
                "Nombre: " + this.nombre
                + "\nModelo: " + this.modelo
                + "\nComposicion" + this.composicion;
    }

}
