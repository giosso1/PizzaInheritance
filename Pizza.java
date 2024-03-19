public class Pizza {
    private String[] toppings;
    private int numToppings;

    //default constructor
    public Pizza(){}
    //constructor, 2 parameters - String array for toppings, int for num of toppings
    public Pizza(String[] toppings, int numToppings){
        //make sure toppings is less than 10, throw exception if not
        try{
            if(numToppings>10) throw new Exception();
            this.toppings=toppings;
        }
        catch(Exception e){
            this.toppings = new String[10];
            System.out.println("Toppings cannot exceed 10");
        }
        this.numToppings=numToppings;
    }

    //getters
    public String[] getToppings(){return this.toppings;}
    public int getNumToppings(){return this.numToppings;}
    public double getPrice(){
        return 14+2*this.numToppings;
    }

    //toString, formatted info
    public String toString(){
        String s="";
        for(String topping:this.toppings){
            s+=topping+", ";
        }
        s=s.substring(0, s.length()-2);
        return s+": "+this.getPrice();
    }
}