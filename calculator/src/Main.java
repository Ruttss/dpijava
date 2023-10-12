import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение(возможные операции: \n 1.Сложение + \n 2.Вычитане -\n 3.Умножение *\n 4. Деление /");
        System.out.println("Пример выражения: 2,3 + 4,7");
        Scanner sc = new Scanner(System.in);
        float ans = sc.nextFloat();
        while (true) {
            char op = sc.next().charAt(0);
            float b = sc.nextFloat();
            switch (op) {
                case ('+'):
                    ans = plus(ans, b);
                    break;
                case ('-'):
                    ans = minus(ans, b);
                    break;
                case ('*'):
                    ans = umnoj(ans, b);
                    break;
                case ('/'):
                    ans = del(ans, b);
                    break;
                default: {
                    System.out.println("Ошибка записи выражения");
                    continue;
                }
            }
            if (Math.round(ans) == ans)
                System.out.print((int) ans);
            else
                System.out.print(ans);

        }
    }

    public static float plus(float a, float b) {
        return a + b;
    }

    public static float minus(float a, float b) {
        return a - b;
    }

    public static float umnoj(float a, float b) {
        return a * b;
    }

    public static float del(float a, float b) {
        return a / b;
    }

}