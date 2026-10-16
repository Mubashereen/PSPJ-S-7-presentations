import java.util.Scanner;

class VendingMachine4 {
    String name;
    int price;

    Product(String n, int p) {
        name = n;
        price = p;
    }
}

class VendingMachine extends Product {
    VendingMachine(String n, int p) {
        super(n, p);
    }

    void buy(int qty) {
        System.out.println("Total Bill: Rs." + (price * qty));
    }
}

public class VendingMachineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Chips - Rs.20");
        System.out.println("2. Chocolate - Rs.30");
        System.out.println("3. Juice - Rs.40");

        System.out.print("Choose product: ");
        int choice = sc.nextInt();

        VendingMachine v;

        if (choice == 1)
            v = new VendingMachine("Chips", 20);
        else if (choice == 2)
            v = new VendingMachine("Chocolate", 30);
        else if (choice == 3)
            v = new VendingMachine("Juice", 40);
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.println("Product: " + v.name);

        if (qty > 0)
            v.buy(qty);
        else
            System.out.println("Invalid quantity!");

        sc.close();
    }
}