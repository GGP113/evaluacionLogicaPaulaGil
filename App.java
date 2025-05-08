

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        //Caso 7: Clínica Estética

        /* Declaración de variables*/

        String   msg, msgDiscount;
        int age, treatment,skinType, procedureType ;
        double cost, discount, discountTotal, costInit;

        msg ="";
        msgDiscount="";
        age=0;
        discount = 0.0;
        discountTotal=0.0;
        costInit=0.0;
        cost=0.0;

    

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Escriba 1, 2 ó 3 de acuerdo con el tratamiento que desea realizar:\n \n \t 1) Tratamiento facial "+
        "\n \t 2) Cirugía menor "+ "\n \t 3) Plan anual de belleza");

        treatment = sc.nextInt();

        

        switch (treatment) {
            case 1:

                
                costInit=35500;

                System.out.println("\n La opción seleccionada fue: 1) Tratamiento facial \n");
                msg="1) Tratamiento facial";
                
                System.out.println("Ingrese su edad: \n");
                age=sc.nextInt();

               

                System.out.println("\n ingrese su tipo de piel de acuerdo con las siguientes opciones"+
                                    "\n \t 1) sensible \n \t 2) otro");

                skinType=sc.nextInt();

                if(skinType > 2){ 
                    
                    System.out.println("ERROR!, la opcion ingresada no es valida.\n, ingrese de nuevo su tipo de piel \n " +
                "\n \t 1) sensible \n \t 2) otro");

                skinType=sc.nextInt();
            
                }




                if(age>50 && skinType != 1){

                    discount = 0.2;

                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    msgDiscount ="20% de descuento por edad";


                } 
                
      
                else  if(skinType == 1 && age>50){

                    discount = 0.35;

                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    
                    msgDiscount ="35% de descuento por edad y piel sensible";


                }

                    else if(skinType == 1 ){

                        discount = 0.15;
    
                        discountTotal = discount*costInit;
    
                        cost = costInit-discountTotal;
                        msgDiscount ="15% de descuento por piel sensible";
                        
                    }

                    

                    else{

                        discount = 0.0;
    
                        discountTotal = discount*costInit;
    
                        cost = costInit-discountTotal;
                        
                        msgDiscount ="No tienes descuento";
    


                    }

                    System.out.println("La edad ingresada fue: "+ age);

                    System.out.println( " \n El tratamiento que seleccionó fue: "+msg+   "\n Originalmente el tratamiento cuesta: "+ costInit +" \n Luego de descuentos tendrá un costo de "+cost+
                    "\n \n A continuación un resumen de los descuentos aplicados:\n \n "+msgDiscount + " \n Descuento total: "+ discountTotal);

                            

                

                break;
            
            case 2:
                costInit=500000;

                System.out.println("\n La opción seleccionada fue: 2) Cirugía menor \n");
                msg="2) Cirugía menor";


                System.out.println("Ingrese 1 ó 2 de acuerdo con la opción deseada: \n \t 1) Procedimientos estéticos"+
                "\n \t 2) Procedimientos reconstructivos");

                procedureType=sc.nextInt();

                if(procedureType==1){

                    discount = 0.0;
    
                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    
                    msgDiscount ="No tienes descuento";
                } 
                else if(procedureType==2){

                    discount = 0.3;
    
                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    
                    msgDiscount ="30% de descuento por procedimientos reconstructivos";

                } else{ System.out.println("ERROR!, la opción ingresadano es vaida");}


                System.out.println( " \n El tratamiento que seleccionó fue: "+msg+   "\n Originalmente el tratamiento cuesta: "+ costInit +" \n Luego de descuentos tendrá un costo de "+cost+
                    "\n \n A continuación un resumen de los descuentos aplicados:\n \n "+msgDiscount + " \n Descuento total: "+ discountTotal);

            
                break;
            
            case 3:

                costInit=900000;

                System.out.println("\n La opción seleccionada fue: 3) Plan anual de belleza \n");
                msg="3) Plan anual de belleza";

                System.out.println("Ingrese su edad: \n");
                age=sc.nextInt();

                if(age<25){

                    discount = 0.1;
    
                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    
                    msgDiscount ="10% de descuento por plan joven con tarifa reducida";


                } else{


                    discount = 0.0;
    
                    discountTotal = discount*costInit;

                    cost = costInit-discountTotal;
                    
                    msgDiscount ="No tienes descuento, aplica plan estándar";


                }

                System.out.println("\n\nLa edad ingresada fue: "+ age);

                System.out.println( " \n El tratamiento que seleccionó fue: "+msg+   "\n Originalmente el tratamiento cuesta: "+ costInit +" \n Luego de descuentos tendrá un costo de "+cost+
                "\n \n A continuación un resumen de los descuentos aplicados:\n \n "+msgDiscount + " \n Descuento total: "+ discountTotal);



                break;



        
            default:
                System.out.println("ERROR!, la opcion ingresada no es valida. ");
                break;
        }

        /*
         *   System.out.println( " \nEl tratamiento que seleccionó fue: "+msg+   "\n Originalmente el tratamiento cuesta: "+ costInit +" \n Luego de descuentos tendrá un costo de "+cost+
        "\n A continuación un resumen de los descuentos aplicados:\n \n "+msgDiscount + " \n Descuento total: "+ discountTotal);

         * 
        */

      


    }

}
