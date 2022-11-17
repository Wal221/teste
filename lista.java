package novo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {
    public static void main(String[] args) {
        List <String> list= new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Walmir");
        //Adiciona um novo elemento de acordo com indice especificado
        list.add(3,"Lunna");

        //Mostra a quantidade de elementos independente se houve remoção ou não
        // em algum elemento
        System.out.println(list.size());



            for(String x : list){
                System.out.println(x);
            }

          System.out.println("---------------------");

        //remove elementos da lista, sendo eles String eles conseguem remover compara_
        //ndo como se fosse um equal, ou pelo numero do indice
        //list.remove(1);
            list.removeIf(x -> x.charAt(0)=='M');


        for(String x : list){
            System.out.println(x);
        }
          System.out.println("--------------------------");

        //Para encontra a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Walmir: " + list.indexOf("Walmir"));
        System.out.println("--------------------------");

        //Filtra e retorna somente os nomes que começa com a letra escolhida, nesse caso a letra "A"
        List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());


        for(String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------------------------");
                                                                     //esse findFirst vai pega o primeiro elemento dessa
                                                                     //da String que atenda ao predicado, se o elemento
                                                                     //especificado não existir ele vai retona null
         //Para resumir ele vai mostra a primeira palavra que encontra que começa com "A"
          String name = list.stream().filter(x -> x.charAt(0)=='K').findFirst().orElse(null);
        System.out.println(name);
    }
}
