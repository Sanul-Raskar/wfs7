/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

/**
 *
 * @author surya
 */
public interface Account {
    String Savings = "Savings", Fixed="Fixed",PersonalLoan="PersonalLoan",HousingLoan="HousingLoan";
    void createAcc();

}
