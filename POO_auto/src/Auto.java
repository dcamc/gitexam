public class Auto {
    int iNroRuedas = 4;
    String sColor;
    double dPesoBruto;
    double dVelocidad = 0;
    double dVelocidadMaxima = 130;

    public Auto(double dPesoBruto){
        this.dPesoBruto = dPesoBruto;
    }
    void iniciarRecorrido(){
        System.out.println("Iniciando avance...");
    }
    void acelerarMaximo(){
        System.out.println("Acelerando hasta ... " + dVelocidadMaxima);
    }

    void detenerCompleto(){
        System.out.println("Deteniendo el auto ...");
    }

    public double getdPesoBruto() {
        return dPesoBruto;
    }

    public void setdPesoBruto(double dPesoBruto) {
        this.dPesoBruto = dPesoBruto;
    }

    void encendidoLuces(boolean bEncender){
        if(bEncender){
            System.out.println("Luces Encendidas");
        }else{
            System.out.println("Luces Apagadas");
        }
    }

}
