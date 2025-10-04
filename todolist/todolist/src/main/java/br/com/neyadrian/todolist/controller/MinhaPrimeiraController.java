package br.com.neyadrian.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota -----
public class MinhaPrimeiraController {
    /*
    MÉTODO DE ACESSO DO HTTP
    GET - buscar uma informação
    POST - adicionar um dado/informação
    PUT - alterar um dado/informação
    DELETE - remover um dado
    PATH - alterar apenas uma parte da info/dado
    */

    //MÉTODO (FUNCIONALIDADE) DE UMA CLASSE
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "funcionou";
    }
}