package com.example.bucherlibery;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BücherRepoTest {

    @Test
    void getBooks() {
        //given
        BücherRepo bücherRepo = new BücherRepo();
        List<Bücher> booksList = new ArrayList<>();
        booksList.add(new Bücher(1234,"The True","Maik","E-Book"));
        booksList.add(new Bücher(2345,"False","Maik","E-Book"));
        //when
        List<Bücher> actual =  bücherRepo.getBooks();
        //when
        assertEquals(actual,booksList);
    }

    @Test
    void booksByID() {
        //given
        BücherRepo bücherRepo = new BücherRepo();
        List<Bücher> bookList = new ArrayList<>();
        bookList.add(new Bücher(1234,"The True","Maik","E-Book"));
        //when
        Bücher actual = bücherRepo.booksByID(1234);
        //then
        assertEquals(new Bücher(1234,"The True","Maik","E-Book"),actual);
    }

    @Test
    void add() {
        //given
        BücherRepo bücherRepo = new BücherRepo();
        List<Bücher> bookList = new ArrayList<>();
        //when
        Bücher actual = bücherRepo.add(new Bücher(5678,"The True","Maik","E-Book"));
        //then
        assertEquals(actual,new Bücher(5678,"The True","Maik","E-Book"));

    }


}