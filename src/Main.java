public class Main {
    public static void main(String[] args) {
        Author martin = new Author("Джордж", "Мартин");
        Author sapkowski = new Author("Анджей", "Сапковски");

        Book gameOfThrones = new Book("Игра престолов", 1996, martin);
        Book lastWish = new Book("Последнее желание", 1993, sapkowski);


        gameOfThrones.printInfoAboutBook();
        lastWish.printInfoAboutBook();

        gameOfThrones.setPublishingYear(1995);

        gameOfThrones.printInfoAboutBook();

    }


}