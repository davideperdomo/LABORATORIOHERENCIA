package agencia;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Agencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Camioneta c1 = new Camioneta (20,4,4,202,"mazda",202,100);
        AutoCompacto ac1 = new AutoCompacto (4,2200,"toyota",300,200);
        AutoLujo al1 = new AutoLujo (5,2201,"Honda",320,250);
        Vagoneta v1 = new Vagoneta (6,2240,"Hyundai",600,250);
        boolean o=false;
        int opcion;
        System.out.println("Bienvenido a la agencia, que vehiculo desea ver?");
        System.out.println("1. La camioneta.");
        System.out.println("2. El auto compacto");
        System.out.println("3. El auto de lujo.");
        System.out.println("4. La vagoneta.");
        System.out.println("5. Salir.");
        
        while (o==false){
            System.out.println("Que quiere hacer?");
           opcion=leer.nextInt();
           switch (opcion){
                case 1: //camioneta
                    System.out.println(c1.toString());   
                    break;
               
                case 2: //compacto
                    System.out.println(ac1.toString());
                    break;
               
                case 3: //lujo
                    System.out.println(al1.toString());
                    break;
               
                case 4: //vagoneta
                    System.out.println(v1.toString());
                    break;
               
               case 5: //salida
                   o=true;
                   break;
               
           }
       }
 
    }
    
}
