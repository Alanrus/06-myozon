package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Lego oldFishingShip = new Lego(70419,
                "Старый рыбацкий корабль",
                "https://myozon.ru",
                "Конструктор",
                2299,
                32,
                5,
                true,
                true);

        Lego mysteryOldCemetery = new Lego(
                70420,
                "Загадка старого кладбища",
                "https://myozon.ru",
                "Конструктор",
                2299,
                33,
                5,
                true,
                true);

        Lego stuntTruck = new Lego(
                70421,
                "трюковый грузовик Эль-Фуэго",
                "https://myozon.ru",
                "Конструктор",
                2999,
                32,
                0,
                true,
                true);


        Cart cart = new Cart();
        cart.add(oldFishingShip, 1);
        cart.add(oldFishingShip, 2);
        cart.add(mysteryOldCemetery, 1);
        cart.add(stuntTruck, 5);
        cart.remove(oldFishingShip, 1);
        cart.remove(mysteryOldCemetery, 1);
        cart.remove(stuntTruck, 3);

        System.out.println("Количество товаров в корзине: " + cart.getQuantity());
        System.out.println("Сумма всего: " + cart.getSumTotal());
        System.out.println("Сумма с учетом скидки: " + cart.getSumDiscounted());


    }
}
