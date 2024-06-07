package edu.Collections.Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    int cod;
    String name;
    double price;
    int amount;

    public Produto(int cod, String name, double price, int amount) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public int compareTo(Produto p) {
        return name.compareToIgnoreCase(p.getName());


    }
}
class ComparatorForPrice implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {

        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
