public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Frodo", "Balings", new VisaCard (0));
        Customer customer2= new Customer("Devon", "Tippens", new MasterCard(0));

        customer.printName();

        customer.getCreditCard().pay(100);

        System.out.println(customer.getCreditCard().getDebt());

        customer2.printName();
        customer2.getCreditCard().pay(100);

        System.out.println(customer2.getCreditCard().getDebt());
    }
}
