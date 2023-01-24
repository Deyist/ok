public class PubBurger extends Burger{
    private String FancySauce;
    private String FancyBun;
    
    public PubBurger(){
        FancySauce = "none";
        FancyBun = "none";
    }
    public PubBurger(boolean isKetchup, boolean isLettuce, boolean isTomato, boolean isCheese, int isPatties, String FancySauce2, String FancyBun2){
        super(isKetchup, isLettuce, isTomato, isCheese, isPatties);
        FancySauce = FancySauce2;
        FancyBun = FancyBun2;
        
    }
    //Accessors
    public String getFancySauce(){
        return FancySauce;
    }
    public String getFancyBun(){
        return FancyBun;
    }
    //Mutators
    public void setFancySauce(String typeSauce){
        this.FancySauce = typeSauce;
    }
    public void setFancyBun(String typeBun){
        this.FancyBun = typeBun;
    }


    public double getPubBurgerTotalPrice(int patties){
        double price = super.getBurgerTotalPrice(patties);
        if(price == 0.0){
            return 0.0;
        }
        price += 2.00;
        return price;
        
        
        
    }
    public double getPrice(){
        double price = 0.0;
        price = super.getPrice();
        price += 2.00;
        return price;
    }
}