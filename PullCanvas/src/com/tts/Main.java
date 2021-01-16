package com.tts;

import java.util.Scanner;

public class Main {

    //public static void main(String[] args) {
    // write your code here
    //package com.tts;
    //import java.util.Scanner;
    //public class Main {

    public static void main(String[] args) {

        double num1;
        double num2;
        double ans;
        char op;
        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers but leave a space in between" + ": ");
        //String someString = scanner.next();
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is :\n");
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.println("");

        //{
            double num3;
            double answer;


            //System.out.print("Enter one number for the following functions" + ": ");
            System.out.println("R=Square Root....S=Sin....C=Cos....T=Tangent");

            System.out.print("Enter one number for these functions" + ": ");
            num3 = reader.nextDouble();
        //System.out.println("R for Square Root....S for Sin....C for Cos....T for Tangent");
            System.out.print("\nEnter an operator (R, S, C, T): ");
            op = reader.next().charAt(0);
            switch (op) {
                case 'R':
                case 'r':
                    ans = Math.sqrt(num1);
                    break;
                case 'S':
                case 's':
                    ans = Math.sin(Math.toRadians(num1));
                    break;
                case 'C':
                case 'c':
                    ans = Math.cos(Math.toRadians(num1));
                    break;
                case 'T':
                case 't':
                    ans = Math.tan(Math.toRadians(num1));
                    break;
                default:
                    System.out.printf("Error! Enter correct operator");
                    return;
            }
            System.out.print("\nThe result is given as follows:\n");
            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.println("");



        System.out.println("Choose one for Currency Exchange: ");
        System.out.println("1) USD to €");
        System.out.println("2) € to USD");
        System.out.println("3) £ to USD");

        int exchange = reader.nextInt();
        switch (exchange) {
            case 1: {
                System.out.println("Enter the number of USD");

                double usd = reader.nextDouble();

                if (usd >= 0) {
                    System.out.println(" USD is " + usd * 0.908 + " €. ");
                } else {
                    System.out.println("Please put in positive numbers of USD");
                }
            }
            break;
            case 2: {
                System.out.println("Enter the number of €");
                double euro = reader.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + " € is " + euro * 1.101 + " USD. ");
                } else {
                    System.out.println("Please put in positive numbers of €.");
                }
            }
            break;

            case 3: {
                System.out.println("Enter the number of £");
                double pounds = reader.nextDouble();

                if (pounds >= 0) {
                    System.out.println(pounds + " £ is " + pounds * 1.28 + " USD ");
                } else {
                    System.out.println("Please put in positive number of £ ");
                }
            }
            break;
        }
        reader.close();


    }
    }
//}









            /*
                    case 'R':
                    case 'r':
                        ans = Math.sqrt(num1);
                        break;
                    case 'S':
                    case 's':
                        ans = Math.sin(Math.toRadians(num1));
                        break;
                    case 'C':
                    case 'c':
                        ans = Math.cos(Math.toRadians(num1));
                        break;
                    case 'T':
                    case 't':
                        ans = Math.tan(Math.toRadians(num1));
                        break;
            */

            //        default:
            //            System.out.printf("Error! Enter correct operator");
            //            return;
            //    }
            //    System.out.print("\nThe result is given as follows:\n");
            //    System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
            //}
       // }





