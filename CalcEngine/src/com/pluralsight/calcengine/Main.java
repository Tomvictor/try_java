package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("CalcEngine");
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch (opCode){
            case  ('a'):
                result = value1 + value2;
                break;
            case ('s'):
                result = value1 - value2;
                break;
            case ('m'):
                result = value1 * value2;
                break;
            case ('d'):
                result = value2 !=0 ? value1/value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode : " + opCode);
                result = 0.0d;
                break;
        }


        System.out.println(result);
    }
}
