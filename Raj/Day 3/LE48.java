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
        class InterestAdder{
        //(Current balance * 12%)/12  
            void intCal(BankAccount acc){
                acc.currentBalance = acc.currentBalance*(float)(0.12)/(float)12 + acc.currentBalance;
            }
        } 
        new InterestAdder().intCal(this);
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
