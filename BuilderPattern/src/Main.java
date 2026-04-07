public class Main {
    public static void main(String[] args) {

        //using builder we will create the object of Burger
        Burger  burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .extraCheese(true)
                .build();


    }
}