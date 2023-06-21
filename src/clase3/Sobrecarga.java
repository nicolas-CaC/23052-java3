package clase3;

public class Sobrecarga {
    
    public int edad;
    public String nombre;
    
    public Sobrecarga(){
        this.edad = 18;
        nombre = "Fulano";
    }
    
    public Sobrecarga(int numero){
        this.edad = numero;
        nombre = "Fulano";
    }
    
    public Sobrecarga(int numero, String nombre){
        this.edad = numero;
        this.nombre = nombre;
    }
    
    
    
    
}
