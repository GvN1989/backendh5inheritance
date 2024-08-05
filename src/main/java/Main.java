public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Frodo", "Balings", new Creditcard(100));
        Customer customer2= new Customer("Devon", "Tippens", new Creditcard (50));

        customer.printName();

        customer.getCreditcard().pay(10);

        System.out.println(customer.getCreditcard().getDebt());

        customer2.printName();
        customer2.getCreditcard().repay(30);

        System.out.println(customer2.getCreditcard().getDebt());
    }
}
