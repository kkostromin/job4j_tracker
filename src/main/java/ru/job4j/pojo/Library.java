package ru.job4j.pojo;

/*
1. Создайте модель данных "Книга" с полями: имя и количество страниц. ru.job4j.pojo.Book.

2. Создайте класс ru.job4j.pojo.Library и в нем метод main.

3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".

4. Выведите содержимое массива на консоль через цикл for + index.

5. Переставьте местами книги с индексом 0 и 3. Выведите содержимое массива на консоль.

6. Добавьте цикл с выводом книг с именем "Clean code".
 */

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("'Clean code'", 100);
        Book book2 = new Book("'Master'", 300);
        Book book3 = new Book("'Book3'", 10);
        Book book4 = new Book("'Book4'", 30);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            System.out.println("In book " + bk.getName() + " number of pages :" + bk.getNumberpages());
        }

        Book tmp = null;
        tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        System.out.println("List of books after change:");

        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            System.out.println("In book " + bk.getName() + " number of pages :" + bk.getNumberpages());

        }

        System.out.println("Thr books with name 'Clean code': ");
        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            if (bk.getName() == "'Clean code'") {
                System.out.println("In book " + bk.getName() + " number of pages :" + bk.getNumberpages());
            }
        }
    }
}
