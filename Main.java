import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor;
        System.out.println("ingrese el numero de la figura");
        Scanner sc = new Scanner(System.in);
        area obj = new area();
        valor = sc.nextInt();
        obj.area(valor);
    }
}