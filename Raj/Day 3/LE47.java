class BankAccount {
    float  currentBalance;

    public BankAccount(float currentBalance) {
        this.currentBalance = currentBalance;
    }
    void deposit(){
        
    }
    void withdraw(int value){
        
    }
    float getBalance(){
        return currentBalance;
    }
    
    public static void main(String array[]){
        BankAccount acc = new BankAccount(1000000);
        //interest if calculated and added as well to the current balance
        new BankAccount.InterestAdder().intCal(acc);
        System.out.println("Account balance after the interest calculation: "+acc.currentBalance);
    }
    
    static class InterestAdder{
        //(Current balance * 12%)/12  
        void intCal(BankAccount acc){
            acc.currentBalance = acc.currentBalance*(float)(0.12)/(float)12 + acc.currentBalance;
        }
    } 
    
}
