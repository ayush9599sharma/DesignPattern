/*
*most common way to implement buuilder pattern is to have a builder
* class as inner class because you might have seen at most of the places
* 1. we don't want to expose our constructor which eventually creates confusion at later stage.
* 2. we don;t want to have in-consistent object by having setters exposed.
* 3. Now since constructors  is private we will need inner class to access that,
* which will have same inputs what we have in out main class , but without getter.
 */


//setters are not allowed
public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder builder){
        //initialize all fields and add validation

    }

//    public String getSize(){
//        return size;
//    }

//    public boolean isEgg(){
//        return egg;
//    }
//
//
//    public boolean isExtraCheese(){
//        return extraCheese;
//    }
//
//    public boolean isMayonese(){
//        return mayonese;
//    }
//
//    public boolean isOnion(){
//        return onion;
//    }
//
//    public boolean isLettuce(){
//        return  lettuce;
//
//    }



    //setters are allowed
    public static  class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        //setter
        public BurgerBuilder size(String size){
            System.out.println("size is ::"  +  size) ;
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg){
            System.out.println("egg is :: " + egg);
            this.egg =egg;
            return this;
        }

        public BurgerBuilder mayonese(boolean mayonese){
            System.out.println("mayonese is :: " + mayonese);
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder onion(boolean onion){
            System.out.println("onion is :: " + onion);
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce){
            System.out.println("lettuce is :: " + lettuce);
            this.lettuce  = lettuce;
            return this;
        }
        public  BurgerBuilder extraCheese(boolean extraCheese){
            System.out.println("cheese is :: " + extraCheese);
            this.extraCheese = extraCheese;
            return this;
        }


        public  Burger build(){
            return new Burger(this); //constructor of class Burger
        }


    }



}
