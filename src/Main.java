public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 12");
        Author levTolstoy = new Author("Лев","Толстой");
        Book warAndWorld = new Book("Война и мир",levTolstoy,1980);
        Author aleksandrPushkin = new Author("Александр","Пушкин");
        Book evgeniyOnegin = new Book("Евгений Онегин", aleksandrPushkin,1979);
        warAndWorld.setYear(2022);
        System.out.println("Книга 1 - " + warAndWorld.getName() + ", автор: " + levTolstoy.getFirstName() + levTolstoy.getLastName() + ", год издания: " + warAndWorld.getYear());
        System.out.println("Книга 2 - " + evgeniyOnegin.getName() + ", автор: " + aleksandrPushkin.getFirstName() + aleksandrPushkin.getLastName() + ", год издания: " + evgeniyOnegin.getYear());
    }
}