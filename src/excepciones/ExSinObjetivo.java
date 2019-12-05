package excepciones;

public class ExSinObjetivo extends Exception{
    
    public ExSinObjetivo (){
        super("No se a seleccionado un objetivo");
    }
    public String noHayObjetivo (){
        return "No se a seleccionado un objetivo";
    }
}
