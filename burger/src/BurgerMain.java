public class BurgerMain {
    public static void main(String[] args){
        PubBurger myPubBurger = new PubBurger(true, true, false, true, 2, "BBQ", "Multigrain");
        Burger myBurger = new Burger(true, true, true, false, 1);
        //Examples
        System.out.println(myPubBurger.getPrice());
        System.out.println(myBurger.getPrice());
        System.out.println(myPubBurger.getKetchup());
        myPubBurger.setKetchup(false);
        System.out.println(myPubBurger.getKetchup());
        System.out.println(myBurger.getCheese());
        myBurger.setCheese(true);
        System.out.println(myBurger.getCheese());

        
        


    }
}
