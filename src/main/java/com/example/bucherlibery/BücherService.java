package com.example.bucherlibery;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BücherService {
    private final BücherRepo bücherRepo;

    public List<Bücher> getBooks(){
        return bücherRepo.getBooks();
    }
    public Bücher booksByISBN(int ISBN){
        return bücherRepo.booksByID(ISBN);
    }
    public void add(Bücher books){
        bücherRepo.booksList.add(books);
    }
    public void remove(int ISBN){
        bücherRepo.booksList.remove(ISBN);
    }
}
