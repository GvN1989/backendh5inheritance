public class Creditcard {

    private int debt;


    public Creditcard(int debt) {
        this.debt=debt;
    }

    public int getDebt(){
        return debt;
    }

    public void setDebt(int debt){
        this.debt=debt;
    }

    public void pay(int amount) {
        this.debt= this.debt + amount;
    }

    public void repay (int amount) {
        this.debt= this.debt - amount;
    }

}
