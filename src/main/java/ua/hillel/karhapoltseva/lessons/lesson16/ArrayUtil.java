package ua.hillel.karhapoltseva.lessons.lesson16;

public class ArrayUtil {

    // if null   return -2
    // if empty  return -1
    // if not found return -6
    // if matrix [][] return 0 //є квадратною
    // if matrix [][] return -5 //  не квадратнa

    static double  methodArrayInt(int[] array){

        double average=0;
        if (array.length == 0){
            return -1;
        }
        if (array == null){
            return -2;
        }
        if (array.length>0) {
            for (int i = 0; i < array.length; i++) {
                average += array[i];
            }
            average = average / array.length;
            System.out.println(average);
            return average;
        }
        return -6;
    }
    static int  methodMatrix(int[][] array) {
        if(array.length == 0){
            return -1;
        }
        if (array==null){
            return -2;
        }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((array.length==array[i].length)&&array.length>1) {
                        System.out.println("Матриця квадратна");
                        return 0;
                    } else  {
                        if ((array.length!=array[i].length)) {
                            System.out.println("Матриця не квадратна");
                        return -5;
                        }
                    }
                }
            }
            return -3;
    }
}
/*Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив)
у та перевіряти чи є вона квадратною
В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу*/