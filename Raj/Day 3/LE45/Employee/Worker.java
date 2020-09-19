/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import finance.Payable;

/**
 *
 * @author surya
 */
public class Worker{
    String name;
    int salaryrate;
    public static void main(String array[]){
        //rate is in Rupee/hours
        DailyWorker w1 = new DailyWorker("Ram",20);
        SalariedWorker w2 =new  SalariedWorker("Sham",15);
        //let suppose the both worker worked 210 hour
        System.out.println("salary given to DailyWorker 210 hours: "+w1.pay(210));
        System.out.println("salary given to SalariedWorker 210 hours: "+w2.pay(210));
        System.out.println("Monthly payment of DailyWorker: "+w1.getPayInfo());
        System.out.println("Monthly payment of DailyWorker: "+w2.getPayInfo());
    }
}

class DailyWorker extends Worker implements Payable {
    DailyWorker(){};
    DailyWorker(String name,int rate){
            this.name= name;
            salaryrate = rate;
    }
    int pay(int hours){
            return this.salaryrate*hours;
    }
    void setSalary(int salaryrate){
            this.salaryrate = salaryrate;
    }

    //consedtring approx 176 hours per month 
    @Override
    public int getPayInfo() {
        return salaryrate*176;
    }
	
}
class SalariedWorker extends Worker implements Payable{
    SalariedWorker(){};
    SalariedWorker(String name,int rate){
            this.name= name;
            salaryrate = rate;
    }
    int pay(int hours){
            //need tpo work 40 hours a week so as to get the salary for a week so subtracting the left hour i.e hours%40
            hours = hours - hours%40;
            return this.salaryrate*hours;
    }
    void setSalary(int salaryrate){
            this.salaryrate = salaryrate;
    }
    //consedtring approx 176 hours per month 
    @Override
    public int getPayInfo() {
        return salaryrate*176;
    }
}