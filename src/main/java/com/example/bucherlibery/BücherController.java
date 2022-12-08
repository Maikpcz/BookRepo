package com.example.bucherlibery;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BücherController {

    private final BücherService bücherService;

    @GetMapping
    public List<Bücher> getBooks(){
        return bücherService.getBooks();
    }

    @GetMapping("/{ISBN}")
    public Bücher getBookByISBN(@PathVariable int ISBN){
        return bücherService.booksByISBN(ISBN);
    }

    @PutMapping
    public void add(@RequestBody Bücher book){
        bücherService.add(book);
    }
    @DeleteMapping
    public void remove(@RequestBody int ISBN){
        bücherService.remove(ISBN);
    }

}
