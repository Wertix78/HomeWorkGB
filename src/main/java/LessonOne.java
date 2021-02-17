/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.

4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
8.  Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */
public class LessonOne {
    public static void main(String[] args) {
/*
1.
2.
 */
        byte z = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double q = 3.8;
        char p = 'W';
        boolean t = true;

        expression (3f, 3f, 4f, 2f);
        comparison(9,5);
        appraisal(0);
        app(-33);
        name("Halloween" );
        leap_year(2024);


    }
//3.
        static void expression(float a, float b, float c, float d){
            float expression = a * (b + (c / d));
            System.out.println(expression);
            return;
        }
//4.
        static void comparison(int one, int two){
        int sum = one + two;
            if (sum > 10 && sum < 20) System.out.println(true);
            else System.out.println(false);
        }
//5.
        static void appraisal(int a) {
            if (a >= 0) System.out.println("Положительное");
            else System.out.println("Отрицательное");
        }
//6.
        static boolean  app(int a) {
            if (a >= 0) return false;
            else return true ;
        }
//7.
        static void name(String nw) {
            System.out.println("Привет " + nw);
        }
//8.
        static void leap_year(int year){
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println("Не високосный");
            else System.out.println("Високосный");

        }


}
