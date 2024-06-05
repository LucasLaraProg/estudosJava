package edu.Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavras=" + conjuntoPalavras +
                '}';
    }
    public void addWord(String word){
        conjuntoPalavras.add(word);
    }
    public void removeWord(String word){
        if (!conjuntoPalavras.isEmpty()){
            if (conjuntoPalavras.contains(word)){
                conjuntoPalavras.remove(word);
            }
            else{
                throw new RuntimeException("Word not found!");
            }
        }
        else{
         throw new RuntimeException("Set of words is empty!");
        }
    }
    public boolean verifyWord(String word){
        return conjuntoPalavras.contains(word);

    }
    public void showWordUniques(){
        if (!conjuntoPalavras.isEmpty()){
            System.out.println(conjuntoPalavras);
        }
        else {
            throw new RuntimeException("Set of Words is empty!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas= new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.addWord("Fruit");
        conjuntoPalavrasUnicas.addWord("Fruit");
        conjuntoPalavrasUnicas.addWord("Milk");
        conjuntoPalavrasUnicas.addWord("Banana");
        conjuntoPalavrasUnicas.addWord("Strawberry");
        conjuntoPalavrasUnicas.addWord("Water");
        conjuntoPalavrasUnicas.showWordUniques();
        conjuntoPalavrasUnicas.removeWord("Water");
        //conjuntoPalavrasUnicas.removeWord("Blue");
        System.out.println("The Word Fruit is in Set? " + conjuntoPalavrasUnicas.verifyWord("Fruit"));
        System.out.println("The Word Water is in Set? " + conjuntoPalavrasUnicas.verifyWord("Water"));
        conjuntoPalavrasUnicas.showWordUniques();
    }
}
