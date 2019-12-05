package excepciones;

public class ExPlataformaDañada extends Exception {
    public ExPlataformaDañada(){
        super ("no se pudo preparar el misil porque la plataforma esta dañana");
    }
    public String exPlataformaDañada (){
        return "no se pudo preparar el misil porque la plataforma esta dañana" ;
    }
}
