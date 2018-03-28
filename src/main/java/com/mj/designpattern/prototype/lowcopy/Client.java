package com.mj.designpattern.prototype.lowcopy;

public class Client {

    public static void main(String[] args) {
        Book book1 = new Book();
        Author author = new Author();
        author.setName("corn");
        author.setAge(100);
        book1.setAuthor(author);
        book1.setTitle("好记性不如烂博客");
        book1.setPageNum(230);

        Book book2 = book1.clone();

        System.out.println(book1 == book2);  // false
        System.out.println(book1.getPageNum() == book2.getPageNum());   // true
        System.out.println(book1.getTitle() == book2.getTitle());        // true
        System.out.println(book1.getAuthor() == book2.getAuthor());        // true
    }
}
