package clase3;

public class Padre extends Abuelo{

    String herenciaPadre = "Padre: Auto";
    int valorPadre;
    protected String herenciaProtegidaPadre = "Herencia protegida: Ahorros";
    
    public Padre(int numero){
        valorPadre = numero;
    }
}
