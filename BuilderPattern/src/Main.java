public class Main {
    public static void main(String[] args) {

        //using builder we will create the object of Burger
        Burger  burger = new Burger.BurgerBuilder()
                .size("Large")
                .mayonese(true)
                .onion(false)
                .extraCheese(true)
                .build();


        System.out.println(burger.isMayonese());
        System.out.println(burger.getSize());

    }
}