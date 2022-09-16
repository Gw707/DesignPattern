package com.gw.Iterator;

/**
 * BookShelf通过实现Aggregate接口，这个接口中只有一个方法，获取遍历器Iterator
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    public Book getIndex(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    /**
     * 关键步骤
     * @return
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
