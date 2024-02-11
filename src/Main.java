import java.util.Scanner;

/**Создайте класс Triangle, у класса должны быть поля a, b, c.
 В классе создайте метод "area" который при вызове выводит на консоль площадь треугольника. java*/
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uch burchtuktun birinchi jagyn jaz: ");
        triangle.a = scanner.nextInt();
        System.out.println("Uch burchtuktun ekinchi jagyn jaz: ");
        triangle.b = scanner.nextInt();
        System.out.println("Uch burchtuktun uchunchu jagyn jaz: ");
        triangle.c = scanner.nextInt();

        getArea(triangle.a, triangle.b, triangle.c );

    }
    public static void getArea(double a , double b, double c){
        double area = (a+b+c)/2;
        System.out.println("Uch burchtuktun ayanty: "+area);
    }
}