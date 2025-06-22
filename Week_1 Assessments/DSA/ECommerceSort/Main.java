public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 299.99),
            new Order(102, "Bob", 199.50),
            new Order(103, "Charlie", 999.00),
            new Order(104, "David", 499.75),
            new Order(105, "Eve", 150.00)
        };

        System.out.println("Original Orders:");
        OrderSorting.printOrders(orders);

        System.out.println("\nBubble Sorted Orders by Total Price:");
        OrderSorting.bubbleSort(orders);
        OrderSorting.printOrders(orders);

        Order[] orders2 = {
            new Order(101, "Alice", 299.99),
            new Order(102, "Bob", 199.50),
            new Order(103, "Charlie", 999.00),
            new Order(104, "David", 499.75),
            new Order(105, "Eve", 150.00)
        };

        System.out.println("\nQuick Sorted Orders by Total Price:");
        OrderSorting.quickSort(orders2, 0, orders2.length - 1);
        OrderSorting.printOrders(orders2);
    }
}

