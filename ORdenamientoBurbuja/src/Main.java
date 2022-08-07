public class Main {
    public static void main(String[] args) {

        int num[] = {10,	2,	8,	3,	1};

        int i=0; //del 0 al 3
        int temp;

        //el numero de iteraciones máximo a necesitar = N - 1


        //Menor a Mayor
        /*
        for(i = 0;i<num.length -1;i++){

            if(num[i]>num[i+1]){ //Solo hará el cambio, cuando el actual > siguiente
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
        }
        //2  8  3  1  10
        for(i = 0;i<num.length -1;i++){
            if(num[i]>num[i+1]){ //Solo hará el cambio, cuando el actual > siguiente
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
        }
        //2   3   1   8   10


        for(i = 0;i<num.length -1;i++){
            if(num[i]>num[i+1]){ //Solo hará el cambio, cuando el actual > siguiente
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
        }
        //2   1   3  8   10
        for(i = 0;i<num.length -1;i++){
            if(num[i]>num[i+1]){ //Solo hará el cambio, cuando el actual > siguiente
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
        }



        //1   2   3   8   10

         */
        for(int j = 0;j<num.length -1;j++) {
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) { //Solo hará el cambio, cuando el actual > siguiente
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }


    }
}