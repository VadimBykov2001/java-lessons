package ru.tn.courses.vbogatyrev.v1.task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class Subtask_2 {
    /**
     * Разработать класс ListContainer<T> для хранения дженерик списков
     * <p>
     * класс должен содержать конструктор по умолчанию и конструктор с new ListContainer<T>(T ... elements) метод
     * получения значения списка метод сравнения двух контейнеров методы добавления и удаления элемента в контейнер
     * методы поиска элементов по индексу или значению добавление коллекции элементов получение контейнера с подсписком
     * по индексам
     */

    public static void main(String[] args) {
        ListContainer listContainer = new ListContainer<>(1, 2, 3);
        listContainer.addCollection(Set.of(1, 2, 3));
        System.out.println(listContainer);

        listContainer.add(2);
        System.out.println(listContainer);

        listContainer.add(4, 6);
        System.out.println(listContainer);

        listContainer.remove(3);
        System.out.println(listContainer);

//        Arrays.stream(listContainer.getValues()).forEach(System.out::println);

        System.out.println(listContainer.get(3));

        var listContainer2 = listContainer.getSubConteiner(new int[]{1,2,3});
        System.out.println(listContainer2);
    }
}
