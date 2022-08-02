// podemos decir que vehiculo es un coche y una bicicleta es un vehiculo .
public static void main (string arg[]){

    Vehiculo vehiculo = new Vehiculo ("azul"+ 0099);
    Coche coche = new Coche ("verde"+0098+8);
    Bicicleta bicicleta = new Bicicleta("celeste"+0097);

    System.out.println("vehiculo:"+getVehiculo()+
    "numero de serie:"+getNumeroDeSerie()+
    "color:"+getcolor()+
    "cilindrada:"+getcilindrada());
 }