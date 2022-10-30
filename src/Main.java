public class Main {


    public static void main(String[] args) {

        // Person sarah = new Person("Sarah", 33);
        // System.out.println("sarah.name = " + sarah.getName());
        // System.out.println("sarah.age = " + sarah.getAge());
        //sarah.setAge(35);
        // System.out.println("sarah.getAge() = " + sarah.getAge());
        // Person john = new Person("John", 38);
        //  System.out.println("john.name = " + john.getName());
        // System.out.println("john.age = " + john.getAge());

        // 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        // 2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        // 3. Написать конструкторы для обоих классов, заполняющие все поля.
        // 4. Создать геттеры для всех полей автора и всех полей книги.
        // 5. Создать сеттер для поля «Год публикации» у книги.
        // 6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        // Метод main не должен находиться в классах Book и Author.
        // Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        // 7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

        System.out.println();
        System.out.println("Задание");
        System.out.println();

        Author danielDefo = new Author("Даниэль", "Дэфо");
        Author pelevin = new Author("Виктор", "Пелевин");

        Book fantasy = new Book("Жизнь насекомых", 1993, pelevin);
        Book fantasy1 = new Book("Жизнь насекомых", 1993, pelevin);
        Book adventure = new Book("Робинзон Крузо", 1719, danielDefo);
        System.out.println(fantasy.equals(fantasy1));


        System.out.println("pelevin.equals(fantasy1) = " + pelevin.equals(fantasy1));
        System.out.println("pelevin.equals(pelevin) = " + pelevin.equals(pelevin));
        System.out.println("fantasy.getNameBook().equals(adventure.getNameBook()) = " + fantasy.getNameBook().equals(adventure.getNameBook()));
        System.out.println("fantasy.getAuthor().equals(fantasy.getAuthor()) = " + fantasy.getAuthor().equals(fantasy.getAuthor()));
        System.out.println("fantasy.getAuthor().equals(adventure.getAuthor()) = " + fantasy.getAuthor().equals(adventure.getAuthor()));


    }

}