import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Author martin = new Author("Джордж", "Мартин");
        Author sapkowski = new Author("Анджей", "Сапковски");
        Author sapkowskiNew = new Author("Анджей", "Сапковски");
        Book gameOfThrones = new Book("Игра престолов", 1996, martin);
        Book lastWish = new Book("Последнее желание", 1993, sapkowski);


        System.out.println(gameOfThrones);

        System.out.println(lastWish);

        gameOfThrones.setPublishingYear(1995);

        System.out.println(gameOfThrones);


        System.out.println(martin);

        System.out.println(sapkowski.equals(sapkowskiNew));

        System.out.println(gameOfThrones.hashCode());

        System.out.println(martin.hashCode());

        System.out.println(sapkowski.hashCode());

    }



}