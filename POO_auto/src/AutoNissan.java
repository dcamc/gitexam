
public class AutoNissan extends Auto{
    boolean bTieneMotorTurboNissan = true;
    double dVelocidadMaxima = 231;

    public AutoNissan(double dPesoBruto){ //inicializar variables
        //super.dVelocidadMaxima = 230;
        super(dPesoBruto);
    }

    void acelerarMaximo(){ //Redifiniendo el método
        System.out.println("Acelerando desde NISSAN hasta ... " + this.dVelocidadMaxima);
    }
    void tieneMotorTurbo(){
        if(this.bTieneMotorTurboNissan){
            System.out.println("Tiene Motor Turbo Nissan");
        }else{
            System.out.println("No Tiene Motor Turbo Nissan");
        }
    }

}
