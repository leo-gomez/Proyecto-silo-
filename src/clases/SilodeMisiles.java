package clases;

import java.util.ArrayList;
import excepciones.ExFaltadeMisiles;
import excepciones.ExPlataformaDañada;
import excepciones.ExSinObjetivo;
import java.lang.Exception;

public class SilodeMisiles {

    private ArrayList<Misil> misil;
    private String nombre;
    private boolean plataforma = false;
    private boolean prepmisil = false;
    private boolean apuntado = false ; 

    public SilodeMisiles(ArrayList<Misil> misil, String nombre, boolean plataforma) {
        this.misil = misil;
        this.nombre = nombre;
        this.plataforma = plataforma;
    }

    public ArrayList<Misil> getMisil() {
        return misil;
    }

    public void setMisil(ArrayList<Misil> misil) {
        this.misil = misil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPlataforma() {
        return plataforma;
    }

    public void setPlataforma(boolean plataforma) {
        this.plataforma = plataforma;
    }

    public void prepararMisil() throws ExFaltadeMisiles, ExPlataformaDañada {
        if (this.plataforma == true) {
            if (this.misil == null ||misil.isEmpty()) {
                throw new ExFaltadeMisiles();
            } else {
                this.prepmisil = true;
                System.out.println("El misil a sido preparado");
            }
        } else {
            throw new ExPlataformaDañada();
        }

    }

    public void apuntarciudad(String ciudad) throws ExSinObjetivo {
        if (ciudad == null) {
            throw new ExSinObjetivo();
        } else {
            apuntado = true;
        }

    }

    public void atacarCiudad(String ciudad) throws ExPlataformaDañada, ExSinObjetivo, ExSinObjetivo, ExFaltadeMisiles {
        if (this.isApuntado() == false) {
            throw new ExSinObjetivo();
        } else if (this.plataforma == false) {
            throw new ExPlataformaDañada();
        } else if (this.prepmisil == false) {
            throw new ExFaltadeMisiles();
        } else {
            System.out.println("==================================\n");
            System.out.println("            WARNING               \n");
            System.out.println("==================================\n");
            System.out.println("El misil a sido lanzado , que empiece la divercion ");

            System.out.println("                ########             ");
            System.out.println("               ##########            ");
            System.out.println("               ##########            ");
            System.out.println("                 ######              ");
            System.out.println("                   ##                ");
            System.out.println("                   ##                ");
            System.out.println("                   ##                ");
            System.out.println("                   ##                ");
            System.out.println("                 ######              ");
            System.out.println("                ########             ");
            System.out.println("               ##########            ");

            misil.remove(0);
            this.prepmisil=false;
            this.apuntado=false;
            this.nombre=null;
        }
    }

    public void inventario() throws ExFaltadeMisiles {

        if (misil == null || misil.isEmpty()) {
            throw new ExFaltadeMisiles();
        } else {
            for (Misil misile : misil) {
                System.out.println(misile.toString());
            }
        }
    }

    public void arreglarPlataforma() {
        if (plataforma == false) {
            this.plataforma = true;
        } else {
            System.out.println("no necesita reparacion");
        }

    }

    public void estadoPlataforma() {
        if (this.plataforma == false) {
            System.out.println("la plataforma esta averiada");
        }
        if (this.plataforma == true) {
            System.out.println("la plataforma esta en condiciones");
        }
    }

    public boolean isPrepmisil() {
        return prepmisil;
    }

    public void setPrepmisil(boolean prepmisil) {
        this.prepmisil = prepmisil;
    }

    public boolean isApuntado() {
        return apuntado;
    }

    public void setApuntado(boolean apuntado) {
        this.apuntado = apuntado;
    }
}
