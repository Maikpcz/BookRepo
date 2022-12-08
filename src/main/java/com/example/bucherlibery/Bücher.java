package com.example.bucherlibery;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Bücher {
    private int ISBN;
    private String Title;
    private String Autor;
    private String Art;
}
