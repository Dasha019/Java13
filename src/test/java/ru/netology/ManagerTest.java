package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book( 1,"Book1", 50, "author1");
        Book book2 = new Book( 2,"Book2", 150, "author2");
        Book book3 = new Book( 3,"Book3", 350, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

}