package com.practice.counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n = Integer.parseInt(br.readLine());
        double val = Math.pow(10, n);
        /*List<Integer> list = new ArrayList<>(); 
        for(int k=1;k<=val;k++){
            String s = Integer.toString(k);
            if(s.length() == 1){
                list.add(k); 
            } else{
                int l = s.length();
                int flag = 0;
                for (int i = 0; i < l - 1; i++) {
                    for (int j = i + 1; j < l; j++) {
                        if (s.charAt(i) == s.charAt(j)) 
                        {
                            flag = 1;
                            break; 
                        }
                    }
                } if(flag == 0){
                    list.add(k); 
                }
            }
        }*/
        
        List<Integer> list1 = IntStream.range(1, (int) val)
                .filter(
                    i -> Integer.toString(i).chars().distinct().count() == Integer.toString(i).length()
                )
                .boxed()
                .collect(Collectors.toList());
        
        System.out.println(list1);
        /*String s = Integer.toString(n); // converting the number into String
                                        // form
        int l = s.length();
        int flag = 0;

         //loop for checking whether there are repeated digits 
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (s.charAt(i) == s.charAt(j)) // if any digits match, then we
                                                // know it is not a Unique
                                                // Number
                {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println("**** The Number is a Unique Number ****");
        else
            System.out.println("**** The Number is Not a Unique Number ****");*/
    }
}