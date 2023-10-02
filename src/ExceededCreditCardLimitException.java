class ExceededCreditCardLimitException extends Exception {
    private double exceededAmount;

    public ExceededCreditCardLimitException(double exceededamount) {
        this.exceededAmount = exceededamount;
    }

    public double getExceededAmount() {
        return exceededAmount;
    }
}