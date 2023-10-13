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
                    ans = operations.plus(ans, b);
                    break;
                case ('-'):
                    ans = operations.minus(ans, b);
                    break;
                case ('*'):
                    ans = operations.umnoj(ans, b);
                    break;
                case ('/'):
                {
                    if(b == 0)
                    {
                        System.out.println("На ноль делить нельзя");
                        preobrazovanie_type_ans(ans);
                        continue;
                    }
                    ans = operations.del(ans, b);
                    break;
                }
                default: {
                    System.out.println("Ошибка записи операции");
                    System.out.print(ans);
                    continue;
                }
            }
            preobrazovanie_type_ans(ans);

        }
    }

    public static void preobrazovanie_type_ans (float ans) // функция преобоазует ответ в целочисленное значение или с плавающей точкой
    {
        if (Math.round(ans) == ans)
            System.out.print((int) ans);
        else
            System.out.print(ans);
        return;
    }


}