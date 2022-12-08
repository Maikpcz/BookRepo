package com.example.bucherlibery;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BücherRepo {
    List<Bücher> booksList = new ArrayList<>(
            List.of(
                    new Bücher(1234,"The True","Maik","E-Book"),
                    new  Bücher (2345,"False","Maik","E-Book")
            ));
    public List<Bücher> getBooks(){
        return booksList;
    }
    public Bücher booksByID(int ISBN){
        Bücher booksLists = null;

        for( Bücher p : booksList) {
            if (p.getISBN() == ISBN){
                booksLists = p;
                break;
            }
        }
    return booksLists;
    }
    public Bücher add(Bücher books){
        booksList.add(books);
        return books;
    }
    public void remove(int ISBN){
        booksList.remove(ISBN);
    }


}
