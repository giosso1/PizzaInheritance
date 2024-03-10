public class Pizza {
    private String[] toppings;
    private int numToppings;

    public Pizza(){}
    public Pizza(String[] toppings, int numToppings){
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

    public String[] getToppings(){return this.toppings;}
    public int getNumToppings(){return this.numToppings;}
    public double getPrice(){
        return 14+2*this.numToppings;
    }

    public String toString(){
        String s="";
        for(String topping:this.toppings){
            s+=topping+", ";
        }
        s=s.substring(0, s.length()-2);
        return s+": "+this.getPrice();
    }
}