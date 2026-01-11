import java.math.*;
import java.util.Scanner;

public class Main{
    public static void main() {
        Object retangulo = new Object();
        Scanner sc = new Scanner(System.in);
        System.out.print("entre com a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("entre com a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.println("Area = " + retangulo.area());
        System.out.println("perimetro = " + retangulo.perimetro());
        System.out.println("diagonal = " + retangulo.diagonal());
 }
}