import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение(возможные операции: \n 1.Сложение + \n 2.Вычитане -\n 3.Умножение *\n 4. Деление /");
        System.out.println("Пример выражения: 2 + 4");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        char op = sc.next().charAt(0);
        float b = sc.nextFloat();
        switch (op) {
            case ('+'):
                System.out.println(plus(a,b));
                break;
            case ('-'):
                System.out.println(minus(a,b));
                break;
            case ('*'):
                System.out.println(umnoj(a,b));
                break;
            case ('/'):
                System.out.println(del(a,b));
                break;
            default:
                System.out.println("Ошибка записи выражения");
        }
    }
    public static float plus(float a, float b)
    {
        return a+b;
    }
    public static float minus(float a, float b)
    {
        return a-b;
    }
    public static float umnoj(float a, float b)
    {
        return a*b;
    }
    public static float del(float a, float b)
    {
        return a/b;
    }

}