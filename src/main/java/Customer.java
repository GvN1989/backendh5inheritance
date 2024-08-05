public class Customer {
    String name;
    String lastName;
    int customerNumber;

    public Customer (String name, String lastName, int customerNumber, Creditcard creditCard) {
        this.name= name;
        this.lastName= lastName;
        this.customerNumber=customerNumber;
        this.creditCard= creditCard;
    }

    private Creditcard creditCard;


    public Customer (String name, String lastName, Creditcard creditCard) {
        this.name= name;
        this.lastName= lastName;
        this.creditCard= creditCard;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }

    public Creditcard getCreditcard(){
        return creditCard;
    }

    public void setCreditcard (Creditcard creditCard){
        this.creditCard = creditCard;
    }

}
