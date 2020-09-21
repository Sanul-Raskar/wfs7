class BankAccount {
    float  currentBalance;

    BankAccount(){};
    public BankAccount(float currentBalance) {
        this.currentBalance = currentBalance;
    }
    void deposit(){
        
    }
    void withdraw(int value){
        
    }
    float getBalance(){
        //storing the refrence
        BankAccount currObj = this;
        //nested inner class
        InterestAder interest = new InterestAder(){
            @Override
            public void intCal() {
                currObj.currentBalance = currObj.currentBalance*(float)(0.12)/(float)12 + currObj.currentBalance;
            };
            
        };
        interest.intCal();
        return currentBalance;
    }
    
    public static void main(String array[]){
        BankAccount acc = new BankAccount(1000000);
        //interest if calculated and added as well to the current balance
        // calling getBalance();
        float balance = acc.getBalance();
        System.out.println("Account balance after the interest calculation: "+balance);
    }
    
    
    
}
interface InterestAder{
    void intCal();
}
    