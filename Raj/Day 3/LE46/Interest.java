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
public interface Interest {
    float Savings = 5, Fixed=3,PersonalLoan=6,HousingLoan=(float) 2.5;
    float calcInt();
}
