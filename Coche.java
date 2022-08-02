// esta clase va a heredar los atributos de VEHCIULO donde se le va a añadir la cilindrada 
// nuevo atributo.

public class Coche extends Vehiculo {

private int cilindrada;

public Coche(String color,int numeroDeSerie,int cilindrada) 

    super(color,numeroDeSerie);

    this.cilindrada=cilindrada;


}
public void setCilindrada(int cilindrada){
    this.cilindrada=cilindrada;

}
public int getCilindrada(int cilindrada){
    return cilindrada;
}

}

