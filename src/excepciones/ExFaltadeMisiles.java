package excepciones;

public class ExFaltadeMisiles extends Exception{
    
    public ExFaltadeMisiles(){
        super("no quedan misiles en el silo, se termino la diversion ");
    }
    
    public String errorFaltademisil (){        
     return "no quedan misiles en el silo, se termino la diversion ";
    }
}