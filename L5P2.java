package L5;

class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    class Item {
        String name;
        int quantity;
        double price;

        Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        void display() {
            System.out.println(name + " x" + quantity + " @ " + price + " each");
        }

        double getTotalPrice() {
            return quantity * price;
        }
    }

    public void addItem(String name, int quantity, double price) {
        if (count < 10) items[count++] = new Item(name, quantity, price);
    }

    public void displayCart() {
        double total = 0;
        System.out.println("Shopping Cart:");
        for (int i = 0; i < count; i++) {
            items[i].display();
            total += items[i].getTotalPrice();
        }
        System.out.println("Total Price: $" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2, 20);
        cart.addItem("Banana", 5, 5);
        cart.addItem("Milk", 1, 2.5);
        cart.displayCart();
    }
}
