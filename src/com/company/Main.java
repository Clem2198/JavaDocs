/*
Project: Lab 14 Java Docs and Unit Tesys
Feature: To use Jav Docs and Unit Test to Create a Calculator
Course: IST 242
Author: Christian Lemmo
Date Developed: 4/21/19
Last Date Changed: 4/21/19
Rev: development build 1
*/
package com.company;

public class Main {

    public static void main(String[] args) {

                int result = addition(5, 6);
                System.out.println("Answer: " + result);
                int result1 = subtraction(7, 2);
                System.out.println("Answer: " + result1);
                int result2 = multiplication(1, 3);
                System.out.println("Answer: " + result2);
                int result3 = division(8, 4);
                System.out.println("Answer: " + result3);

    }

            /**
             * Perform addition using two integer values
             *
             * @param val1 variable 1
             * @param val2 variable 2
             * @return int
             * @author Christian Lemmo
             * @version 1
             * @since 2019-04-20
             */
            public static int addition(int val1, int val2) {
                return val1 + val2;

            }

            /**
             * Perform subtraction using two integer values
             *
             * @param val1 variable 1
             * @param val2 variable 2
             * @return int
             * @author Christian Lemmo
             * @version 1
             * @since  2019-04-20
             */
            public static int subtraction(int val1, int val2) {
                return val1 - val2;
            }

            /**
             * Perform multiplication using two integer values
             *
             * @param val1 variable 1
             * @param val2 variable 2
             * @return int
             * @author Christian Lemmo
             * @version 1
             * @since  2019-04-20
             */
            public static int multiplication(int val1, int val2) {
                return val1 * val2;
            }

            /**
             * Perform division using two integer values
             *
             * @param val1 variable 1
             * @param val2 variable 2
             * @return int
             * @author Christian Lemmo
             * @version 1
             * @since  2019-04-20
             */
            public static int division(int val1, int val2) {
                return val1 / val2;
            }
        }

