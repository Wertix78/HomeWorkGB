/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
 метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
  граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия.
Для задач со * не нужно искать решение в интернете, иначе вы теряете весь смысл их выполнения.

 */

public class LessonTwo {
    public static void main(String[] args) {
    int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] arrayTwo= new int[8];
    int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int array_size = 9;
    int[][] arrayFour = new int[array_size][array_size];
    int[] arrayFive = new int[10];
    int step = 5;


    one(arrayOne);
    two(arrayTwo);
    three(arrayThree);
    four(arrayFour);
    setArray(arrayFive);
    five(arrayFive);
    six(arrayFive);
    seven(arrayFive,step);

    }
//1.
    static void one(int [] arr){

        for(int i = 0;  i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + ", ");
        }System.out.println();

    }
//2.
    static void two(int [] arr){

        for(int i = 0;  i < arr.length; i++){
            arr[i] = i*3;
            System.out.print(arr[i] + ", ");
        }System.out.println();
    }
//3.
    static void three(int [] arr){
        for(int i = 0;  i < arr.length; i++){
            if(arr[i] <= 6){
            arr[i] = arr[i]* 2;
            }else arr[i] = arr[i];
            System.out.print(arr[i] + ", ");
        }System.out.println();
    }
//4.
    static void four(int [][] arr){
        for(int i = 0;  i < arr.length; i++){
            for(int j = 0;  j < arr.length; j++){
                if(i==j || i == arr.length-1-j ) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }


    }
//5.
    static void five(int [] arr){

        int min = arr[0];
        int max = arr[0];
        for(int i = 0;  i < arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
            }else if(arr[i] >= max){
                max = arr[i];
            }
        }System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);



    }

    static void setArray(int[] arr){
        for(int i = 0;  i < arr.length; i++){
            arr[i] = (int)(Math.random() * 9);
            System.out.print(arr[i] + ", ");
        }System.out.println();
    }
//6.
    static boolean six(int[] arr){
        int a = 0;

        for(int i = 0; i < arr.length; i++){
            a += arr[i];
            int b = 0;
            for (int j = 0; j < arr.length; j++){
                b += (j > i)? arr[j] : 0;
            }
            if(a == b){
                System.out.println(true);
                return true;
            }
        }System.out.println(false);
        return false;
    }
//7.
    static void seven(int[] arr, int n) {

        for (int i = 0;  i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.print("(Шаг = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int step = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = step;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int step = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = step;
            }
        }
        System.out.println();
        for (int i = 0;  i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
