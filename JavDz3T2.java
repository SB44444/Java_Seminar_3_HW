// 2. Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class JavDz3T2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> my_list = new ArrayList<Integer>();  // Создаем список для рандомнго списка цифр
        for (int i = 0; i < 8; i++) {                         // Задаем кол-во эл-тов
            int num = rand.nextInt(0, 10);       // Задаем интервал значений эл-тов
            my_list.add(num);
        }
        System.out.printf("Исходный список %s\n", my_list);  // Вывод исходного
        int max = max(my_list);  //  Получаем максимальное значение
        int min = min(my_list);   //  Получаем минимальное значение
        int sum_el = 0;
        for (int item : my_list) {   // В цикле проходим по всем элементам
            sum_el += item;  // Складываем, получаем сумму (В этом же цикле можно определить наибльшее и наименьшее без фунукций)
        }
        float arithmetic_mean = (float)sum_el/my_list.size();  // Делим сумму на кол-во эл-тов, получаем среднее арифметическое
        System.out.printf("Максимальный элемент  %s\n", max);
        System.out.printf("Минимальный элемент  %s\n", min);
        System.out.printf("Среднее арифметическое чисел списка %s\n", arithmetic_mean);
    }
}