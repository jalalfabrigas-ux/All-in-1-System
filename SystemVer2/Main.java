package SystemVer2;
import java.util.*;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public double getTotalPrice() {
        return price;
    }

    public void getDisplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Total: " + getTotalPrice());
    }
}

class FoodItem extends MenuItem {
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getTotalPrice() {
        return getPrice() * quantity;
    }

    @Override
    public void getDisplayInfo() {
        System.out.println("\n=== FOOD ITEM ===");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + getTotalPrice());
    }
}

class DrinkItem extends MenuItem {
    private int size;

    public DrinkItem(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getTotalPrice() {
        double multiplier;

        if (size == 1) {
            multiplier = 1.0;
        } else if (size == 2) {
            multiplier = 1.2;
        } else if (size == 3) {
            multiplier = 1.5;
        } else {
            multiplier = 1.0;
        }

        return getPrice() * multiplier;
    }

    @Override
    public void getDisplayInfo() {
        System.out.println("\n=== DRINK ITEM ===");
        System.out.println("Name: " + getName());
        System.out.println("Base Price: " + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Total: " + getTotalPrice());
    }
}

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHOW MANY ORDERS? ");
        int n = sc.nextInt();
        sc.nextLine();

        MenuItem[] order = new MenuItem[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nTYPE OF ORDER?");
            System.out.println("1. FOODS");
            System.out.println("2. DRINKS");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("NAME OF PRODUCT: ");
            String name = sc.nextLine();

            System.out.print("PRICE OF PRODUCT: ");
            double price = sc.nextDouble();

            if (type == 1) {

                System.out.print("QUANTITY: ");
                int quantity = sc.nextInt();

                order[i] = new FoodItem(name, price, quantity);

            } else if (type == 2) {

                System.out.println("SIZE:");
                System.out.println("1 = Small");
                System.out.println("2 = Medium");
                System.out.println("3 = Large");

                int size = sc.nextInt();

                order[i] = new DrinkItem(name, price, size);

            } else {
                System.out.println("INVALID CHOICE!");
            }

            sc.nextLine();
        }

        System.out.println("\n=== RECEIPT ===");

        for (MenuItem item : order) {
            if (item != null) {
                item.getDisplayInfo();
            }
        }

        sc.close();
    }
}