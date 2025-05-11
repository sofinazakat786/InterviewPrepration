package pep_coding.questions;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 0; i < t; i++){    // from 0 to t
            int n = scn.nextInt();

            int count = 0;
            for( int div = 2 ; div * div  <= n; div++){   //from 2 to root n
                if( n % div == 0){
                    count++;
                    break;   // if entering in loop then break it
                }
            }
            if(count == 0){
                System.out.println("prime");
            }else{
                System.out.println("Not Prime");
            }
        }

    }
}

