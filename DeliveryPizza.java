public class DeliveryPizza extends Pizza{
    //sub class of Pizza
    private double deliveryFee;
    private String deliveryAddress;

    //constructor, 3 parameters - 2 from Pizza, 1 String address
    public DeliveryPizza(String[] toppings, int numToppings, String deliveryAddress){
        super(toppings, numToppings);//use Pizza Constructor
        this.deliveryAddress=deliveryAddress;
        if(this.getPrice()>18) this.deliveryFee=3;
        else this.deliveryFee=5;
    }

    //getters
    public double getPrice(){
        return super.getPrice() + this.deliveryFee;
    }
    //toString
    public String toString() {
        return super.toString()+"\nAddress: "+this.deliveryAddress;
    }
}
