package br.com.nonna_back.controllers;

import br.com.nonna_back.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {
    @GetMapping("/produtos")
    List<Produto> listar(){

    }
}
