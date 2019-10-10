package ru.itpark;

import java.util.ArrayList;

public class Cart {
    private int sumTotal;
    private int sumDiscounted;
    private int quantity;

    private ArrayList<Lego> legos;

    public Cart() {
        this.legos = new ArrayList<Lego>();
    }


    public int getSumTotal() {
        return sumTotal;
    }

    public int getSumDiscounted() {
        return sumDiscounted;
    }

    public int getQuantity() {
        return quantity;
    }

    public void add(Lego lego, int count) {
        for (Lego lego1 : legos) {
            if (lego1.getId() == lego.getId()) {
                System.out.println("Товар уже добавлен в корзину");
                return;
            }
        }
        legos.add(lego);
        sumTotal += lego.getPrice() * count;
        sumDiscounted += lego.getPrice() * count * (100 - lego.getDiscaunt()) / 100;
        quantity += count;
    }

    public void remove(Lego lego, int count) {
        sumTotal -= lego.getPrice() * count;
        sumDiscounted -= lego.getPrice() * count * (100 - lego.getDiscaunt()) / 100;
        quantity -= count;
    }

}

