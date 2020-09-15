package com.roderick.main.tree_set_demo.entry;

public class BookInfo implements Comparable<BookInfo>{
    private String bookName;
    private double price;

    public BookInfo() {
    }

    public BookInfo(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bookname=" + bookName + ", price=" + price + "]";
    }

    @Override
    public int compareTo(BookInfo entry){
        if (this.getPrice() == entry.getPrice()){
            return this.getBookName().compareTo(entry.getBookName());
        }else if (this.getPrice() < entry.getPrice()){
            return -1;
        }else {
            return 1;
        }
    }
}
