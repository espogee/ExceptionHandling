class CreditCard {
    private double creditAvailable, limit;
    private int number;

    public CreditCard(int number, double limit) throws InvalidCreditCardNumber {
        if(new InvalidCreditCardNumber(number).errorType()==""){
            this.number = number;
            this.creditAvailable = limit;
            this.limit = limit;
        }else throw new InvalidCreditCardNumber(number);
    }

    public void paidCreditCard(double amount) {
        creditAvailable += amount;
        System.out.println("Amount Paid: "+ amount);
    }

    public void buy(double amount) throws ExceededCreditCardLimitException {
        if(amount <= creditAvailable) {
            this.creditAvailable -= amount;
        }else {
            double exceeded = amount - creditAvailable;
            throw new ExceededCreditCardLimitException(exceeded);
        }
    }

    public String getCreditState(){
        return "Credit Available: $" + this.creditAvailable + " Credit Limit: $" + this.limit;
    }

    public double getCreditAvailable() {
        return this.creditAvailable;
    }

    public double getLimit() {
        return this.limit;
    }

    public int getNumber() {
        return this.number;
    }

    public void increaseLimit(double amount){
        this.limit = getLimit() + amount;
        this.creditAvailable = getCreditAvailable() + amount;
    }
}
