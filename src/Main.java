
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Cat> catsMap = new HashMap<>();

        // Создаем 10 котов и добавляем их в коллекцию Map
        for (int i = 1; i <= 10; i++) {
            String name = "Кот " + i;
            String color = "Цвет " + i;
            Cat cat = new Cat(name, color);
            catsMap.put(name, cat);
        }

        // Выводим список ключей
        System.out.println("Список ключей (имен котов):");
        for (String name : catsMap.keySet()) {
            System.out.println(name);
        }

        // Выводим список котов вместе с их цветом
        System.out.println("\nСписок котов вместе с их цветом:");
        for (Map.Entry<String, Cat> entry : catsMap.entrySet()) {
            String name = entry.getKey();
            Cat cat = entry.getValue();
            System.out.println("Имя: " + name + ", Цвет: " + cat.getColor());
        }
    }
}