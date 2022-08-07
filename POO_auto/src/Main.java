public class Main {
    public static void main(String[] args) {

        //Declarar y Crear una instancia de la clase AutoNissan:
        AutoNissan miauto = new AutoNissan(2000);

        miauto.iniciarRecorrido();
        miauto.acelerarMaximo();
        miauto.tieneMotorTurbo();
        System.out.println("PESO: " + miauto.getdPesoBruto());

        AutoToyota auto2 = new AutoToyota();
        auto2.iniciarRecorrido();
        auto2.acelerarMaximo();



    }
}