import javax.swing.*;

public class DemoPizza {
    public static void main(String[] args){
        //ask user for number of toppings using drop down menu
        String[] toppingNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int num = Integer.parseInt((String)JOptionPane.showInputDialog(null, "How many toppings would you like on your pizza", "Toppings", JOptionPane.QUESTION_MESSAGE, null, toppingNum, toppingNum[0]));
        String[] toppings = new String[num];

        //get each topping from user
        for(int i=0; i<num; i++){
            toppings[i] = JOptionPane.showInputDialog(null, "Topping "+(i+1)+": ");
        }

        //allow user the option for delivery
        String[] options = {"Delivery", "Pickup"};
        int deliveryOpt = JOptionPane.showOptionDialog(null, "How would you like to get your pizza", "Pickup or Delivery", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);

        //if delivery, get address, print DeliveryPizza information
        if(deliveryOpt==0){
            String address = JOptionPane.showInputDialog(null, "What is the address for delivery");
            DeliveryPizza dp = new DeliveryPizza(toppings, num, address);
            JOptionPane.showMessageDialog(null, dp);
        }
        //if pickup, print Pizza information
        else{
            Pizza p = new Pizza(toppings, num);
            JOptionPane.showMessageDialog(null,p);
        }
    }
}
