/* Program to declare a set of 5 words and reverse each word and arrange the resulting words in alphabetical order and display the same.*/
package com.day.one;

import java.util.Scanner;

public class SolutionTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
        String temp;
        System.out.print("Enter five words you want to enter:");
        n = s.nextInt();
        String word[] = new String[n];
        s.nextLine();
        System.out.println("Enter all the word:");
        for(int i = 0; i <n; i++)
        {
            word[i] = s.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (word[i].compareTo(word[j])>0) //comparing lexicographically
                {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }
        System.out.println("Words in Sorted Order:");
        for (int i = 0; i <= n - 1; i++) 
            System.out.print(word[i] + ",");
        
	}

}
