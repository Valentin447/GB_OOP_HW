// Создать класс Notebook с полями (price(double), ram(int))
// 1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
// 2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
// 3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Notebook> notebooks = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            notebooks.add(new Notebook());
        }
        show(notebooks, "Начальный список ноутбуков");

        ArrayList<Notebook> copy1 = (ArrayList<Notebook>) notebooks.clone();
        sort(copy1, new PriceComparator(), "После сортировки по цене");

        ArrayList<Notebook> copy2 = (ArrayList<Notebook>) notebooks.clone();
        sort(copy2, new RamComparator(), "После сортировки по памяти");

        ArrayList<Notebook> copy3 = (ArrayList<Notebook>) notebooks.clone();
        sort(copy3, new RamPriceComparator(), "После сортировки по памяти и цене");
    }

    public static void sort(ArrayList<Notebook> notebooks, Comparator<Notebook> comparator, String text) {
        Collections.sort(notebooks, comparator);
        show(new ArrayList<>(notebooks), text);
    }

    public static void show(ArrayList<Notebook> notebooksList, String text) {
        System.out.println(text);
        for (Notebook item : notebooksList) {
            System.out.println(item);
        }
        System.out.println("===========================");
    }
}
