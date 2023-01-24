public class Burger{
    //Fields
    private boolean ketchup;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private int patties;
    //Default Constructor
    public Burger(){
        ketchup = false;
        lettuce = false;
        tomato = false;
        cheese = false;
        patties = 1;
    }
    //User Input
    public Burger(boolean isKetchup, boolean isLettuce, boolean isTomato, boolean isCheese, int isPatties){
        ketchup = isKetchup;
        lettuce = isLettuce;
        tomato = isTomato;
        cheese = isCheese;
        patties = isPatties;
    }
    //Accessors
    public boolean getKetchup(){
        return ketchup;
    }
    public boolean getLettuce(){
        return lettuce; 
    }
    public boolean getTomato(){
        return tomato;
    }
    public boolean getCheese(){
        return cheese;
    }
    public int getPatties(){
        return patties;
    }
    //Mutators
    public void setKetchup(boolean isKetchup){
        this.ketchup = isKetchup;
    }
    public void setLettuce(boolean isLettuce){
        this.lettuce = isLettuce;
    }
    public void setTomato(boolean isTomato){
        this.tomato = isTomato;
    }
    public void setCheese(boolean isCheese){
        this.cheese = isCheese;
    }
    public void setPatties(int numPatties){
        this.patties = numPatties;
    }
    public boolean equals(Object burgerO){
        Burger otherBurger = (Burger)burgerO; 
        return otherBurger().equals()

        
    }
    //Method for Price
    public static double getBurgerTotalPrice(int patties){
        if(patties >= 1 && patties <= 3){
            double price = 4.00;
            for(int i = 1; i < patties; i++){
                price += 1.00;
            }
            return price;
        }
        else{
            return 0.00;
        }
    
    }
    public double cheesePrice(){
        return .50;
    }
    public double tomatoPrice(){
        return .25;
    }
    
    public double getPrice(){
        double price = 0.0;
        price = getBurgerTotalPrice(this.patties);
        if(this.tomato){
            price += tomatoPrice();
        }
        if(this.cheese){
            price += cheesePrice();
        }
        return price;
    }
}
