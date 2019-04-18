package com.company;

public class NestedForLoop {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 0;

        for( i = 1; i < 10; i++) {
            for(j = 1; j <= i; j++)
                System.out.printf("%d", i);
            System.out.println();
        }
    }
}
