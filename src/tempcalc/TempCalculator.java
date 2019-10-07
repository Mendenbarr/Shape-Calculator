/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempcalc;

//
//import java.util.Scanner;
/**
 *
 * @author 01048750
 */
public class TempCalculator {

    /**
     * 
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the Temperature Calculator.");
//        int i = 1;
//        while (i == 1){
//            System.out.println("Please enter the unit of temperature you wish to convert into.");
//            System.out.println("You may enter celsius or fahrenheit");
//            String input = sc.next();
//            if (null == input){
//                System.out.println("Make sure to enter celsius or fahrenheit!");
//            }
//            else switch (input.toLowerCase()) {
//                    case "celsius":
//                        celsiusCalc();
//                        break;
//                    case "fahrenheit":
//                        fahrenheitCalc();
//                        break;
//                    case "end":
//                        i = 2;
//                        break;
//                    default:
//                        System.out.println("Make sure to enter celsius or fahrenheit!");
//                        System.out.println("Or use end if you are finished.");
//                        break;
//            }
//        }
//    }
//    
//    public static void celsiusCalc(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the fahrenheit value you wish to convert into celsius.");
//        double temp = sc.nextDouble();
//        System.out.println(celsiusConvert(temp) + "° celsius is converted from " + temp + "° fahrenheit.");
//    }
//    
//    public static void fahrenheitCalc(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the celsius value you wish to convert into fahrenheit.");
//        double temp = sc.nextDouble();
//        System.out.println(fahrenheitConvert(temp) + "° fahrenheit is converted from " + temp + "° celsius.");
//        
//    }
    
    public static String celsiusConvert(String f){
        return Double.toString((double)5/9 *(Double.parseDouble(f)-32));
    }
    
    public static String fahrenheitConvert(String c){
        return Double.toString((double)9/5 *Double.parseDouble(c)+32);
        
    }
    
}