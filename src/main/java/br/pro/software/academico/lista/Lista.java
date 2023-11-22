/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.academico.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author andyc
 */
public class Lista {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa(1, "Lili");
        var pessoa2 = new Pessoa(2, "Astrogildo");
        var pessoa3 = new Pessoa(3, "Guilhermando");
        var pessoa4 = new Pessoa(4, "Matheus");
        var pessoa5 = new Pessoa(5, "Gabriel");
        
//        List<Pessoa> pessoas = new ArrayList<>();
//        pessoas.add(pessoa1);
//        pessoas.add(pessoa2);
//        pessoas.add(pessoa3);
//        pessoas.add(pessoa4);
//        pessoas.add(pessoa5);
        
        var pessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
        
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).nome());
        }
        System.out.println("-----------------------------");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.nome());
        }
        System.out.println("-----------------------------");
        pessoas.forEach(p -> System.out.println(p.nome()));
        System.out.println("-----------------------------");
        System.out.println(
                pessoas
                        .stream()
                        .filter(p -> p.nome().startsWith("Guilher"))
                        .findAny()
                        .orElse(new Pessoa(0, "não existe")).nome());
        System.out.println("-----------------------------");
        
        Optional<Pessoa> opPessoa = pessoas.stream().filter(p -> p.nome().startsWith("Anderson")).findAny();
        if (opPessoa.isPresent()) {
            System.out.println(opPessoa.get().nome());
        } else {
            System.out.println("Não encontrei pessoa com esse nome");
        }
        
        
        pessoas.stream()
                .filter(p -> p.nome().startsWith("G"))
                .toList()
              //.forEach(p -> System.out.println(p));
                .forEach(System.out::println);
        
        System.out.println("-----------------------------");
        var numeros = List.of(1, 2, 3, 4, 5);
        var dobro = numeros.stream().map(n -> n * 2).toList();
        dobro.forEach(System.out::println);
    }
}
