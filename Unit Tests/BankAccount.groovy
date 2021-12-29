class BankAccount{
    private value
    BankAccount(openingAmount){
        value = openingAmount
    }
    void deposit(amount){
        value += amount
    }
}