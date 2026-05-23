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
    public class DrinkItem extends MenuItem{
        private int size;
        public DrinkItem(String name, double price, int size){
            super(name,price);
            this.size=size;
        }   public int getterSize(){
            return size;
        }   public void setterSize(int size){
            this.size=size;
        }
    }
    public class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            System.out.print("\n HOW MANY ORDERS? ");
            int n = sc.nextInt();

            MenuItem[] order = new MenuItem[n];

            for(int i=0;i<n;i++){
                System.out.print("\n TYPE OF ORDERS?");
                System.out.print("\n 1. FOODS | 2. DRINKS");
                int type=sc.nextInt();
                if(type == 1){
                    System.out.print("\n===FOOD MENU===");
                }
                
            }
        }
    }