package com.gw.Iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 实现迭代器的逻辑，hasNext和next
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) return true;
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getIndex(index);
        index++;
        return book;
    }
}
