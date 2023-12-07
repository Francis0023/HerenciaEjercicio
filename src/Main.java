import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("  ** Ingreso de datos - Futbol  **  ");
        Caracteristicas info12;
        Caracteristicas info2;
        Caracteristicas info3;

        info12=new Caracteristicas(1," Boca "," Argentina "," 12 "," Batista "," 4-3-3 "," Azul y Amarillo ");
        info3=new Caracteristicas(2," Barcelona "," España "," 7 "," Xavi "," 4-2-3-1 "," Azul, Amarillo y Rojo ");
        info12.mostrarinfo2();
        info3.mostrarinfo2();

        //System.out.println("  ** Ingreso de datos - Futbol  **  ");
        //Caracteristicas info12= new Caracteristicas();
        //System.out.println();
    }

}