// Задание 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class JavDz3T1 {
    public static ArrayList<Integer> random_Lst(){  // Ф-ция генерации случайного списка цифр
        Random rand = new Random();
        ArrayList<Integer> my_list = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {                        // Задаем кол-во эл-тов
            int num = rand.nextInt(0, 1000);   // Задаем интервал значений эл-тов
            my_list.add(num);
        } 
        return my_list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<Integer>();  // Получаем список 
        my_list = random_Lst();
        System.out.printf("Мой рандомный список %s\n",my_list);  // Вывод исходного
        int j = 0;
        while (j < my_list.size()) {         // В цикле проходим по всем эл-там
            if (my_list.get(j) % 2 == 0) {   // Если значение эл-та четное
                my_list.remove(j);           // Удаляем из списка
            }
            else {
                j++;   // Если нечетное, переходим к следующему эл-ту           
            }
        }
        System.out.printf("Список без четных чисел %s", my_list);  // Вывод списка 
        }
    }
