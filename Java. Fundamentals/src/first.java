import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s. \n", name);

        //2.  Отобразить в окне консоли аргументы командной строки в обратном порядке.
        StringBuffer str = new StringBuffer("java");
        str.reverse();
        System.out.println(str.toString());

        //3.    Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        int a = 0;
        int b = 250;
        for (int i = 0; i < 10; i++) {
            int rand = a + (int) (Math.random() * b);
            System.out.println(" " + rand  );
        }

        //4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        Scanner num = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();
        System.out.print("Input number: ");
        int num2 = in.nextInt();
        System.out.println("Sum = "+ (num1+num2));


        //5.  Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        Scanner month = new Scanner(System.in);
        System.out.print("Input month: ");
        int m = month.nextInt();
        System.out.printf("Month: ");
        switch ( m) {
            case  (1):
                System.out.println("January");
                break;
            case (2):
                System.out.println("February");
                break;
            case (3):
                System.out.println("March");
                break;
            case (4):
                System.out.println("April");
                break;
            case (5):
                System.out.println("May");
                break;
            case (6):
                System.out.println("June");
                break;
            case  (7):
                System.out.println("July");
                break;
            case (8):
                System.out.println("August");
                break;
            case (9):
                System.out.println("September");
                break;
            case (10):
                System.out.println("October");
                break;
            case (11):
                System.out.println("November");
                break;
            case (12):
                System.out.println("December");
                break;
            default:
                System.out.println("Input correct number.");
                break;
        }

    }
}

