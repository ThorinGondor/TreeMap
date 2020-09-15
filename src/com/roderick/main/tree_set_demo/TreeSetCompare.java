package com.roderick.main.tree_set_demo;

import com.roderick.main.tree_set_demo.entry.BookInfo;

import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.*;

public class TreeSetCompare {
    public static void main(String[] args){
        BookInfo info1 = new BookInfo("苏联的今天就是我们的明天", 123.5);
        BookInfo info2 = new BookInfo("哈利波特与凤凰社", 67.4);
        BookInfo info3 = new BookInfo("Java 从入门到精通", 198.4);
        BookInfo info4 = new BookInfo("他改变了中国", 78.5);
        Set<BookInfo> bookInfoSet = new TreeSet<>();
        bookInfoSet.add(info1);
        bookInfoSet.add(info2);
        bookInfoSet.add(info3);
        bookInfoSet.add(info4);

        for (BookInfo bookInfo : bookInfoSet) {
            out.println(bookInfo);
        }

    }


}
