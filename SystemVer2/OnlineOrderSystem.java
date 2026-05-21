package SystemVer2;
import java.util.*;

public class MenuItem{
        private String name;
        private double price;
        public MenuItem(String name,double price){
            this.name=name;
            this.price=price;
        } public String getName(){
            return name;
        } public double getPrice(){
            return price;
        } public void setName(String name){
            this.name=name;
        } public void setPrice(double price){
            if(price <= 0){
                this.price=0;
            }else{
                this.price=price;
            }
        }
        public double getTotalPrice(){
            return price;
        }
    }
    public class FoodItem extends MenuItem{
        private int quantity;
        public FoodItem(int quantity){
            super(name,price);
            this.quantity=quantity;
        }   public int getQuantity(){
            return quantity;
        }   public void setQuatity(d=int quantity){
            this.quantity=quantity;
        }   public double getTotalPrice(){
            return getPrice() * quantity;
        }
    }
}