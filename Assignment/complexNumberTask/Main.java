package Assignment.complexNumberTask;

import java.sql.SQLOutput;
import java.util.Scanner;

class Complex {
    float real, img;

    public Complex() {
        real = 0.0f;
        img = 0.0f;
    }

    public Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }

    public void showComplex() {
        System.out.print(real + " +" + "(" + img + ")i" + "\n");
    }

    public void showSum2() {
        System.out.print("Sum of two Complex number is: " + real + " " + "+" + "(" + img + "i)\n");
    }

    public void showMul2() {
        System.out.print("Multiplication of two Complex number is: " + real + " " + "+" + "(" + img + "i)");
    }

    Complex sum2(Complex c1, Complex c2) {            //Addition of two complex numbers..
        float realSum = c1.real + c2.real;
        float imgSum = c1.img + c2.img;
        return new Complex(realSum, imgSum);
    }

    Complex sum3(Complex c1, Complex c2, Complex c3) {     //Addition of three complex numbers..
        return sum2(sum2(c1, c2), c3);
    }

    Complex multiply2(Complex c1, Complex c2) {        //Multiplication  of two complex numbers..
        float realMul = (c1.real * c2.real - c1.img * c2.img);
        float imgMul = (c1.real * c2.img + c1.img * c2.real);
        return new Complex(realMul, imgMul);
    }

    Complex multiply3(Complex c1, Complex c2, Complex c3) {  //Multiplication  of three complex numbers..
        return multiply2(multiply2(c1, c2), c3);
    }
    float absoluteValue(float x,float y){
        return (float) Math.sqrt(x*x+y*y);
    }

    //Max and Min among complex numbers...
    Complex[] maxMin(Complex ...arr) {
        Complex max=arr[0];
        Complex min=arr[0];
        for(Complex c:arr){
            if(absoluteValue(c.real,c.img)>absoluteValue(max.real, max.img)){
                max=c;
            }
            if(absoluteValue(c.real,c.img)<absoluteValue(min.real, min.img)){
                min=c;
            }
        }
        Complex[] MinMax = {max, min};
        return MinMax;
    }

    Complex average(Complex arr[]) {
        float real = 0.0f;
        float img = 0.0f;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            real += arr[i].real;
            img += arr[i].img;
        }
        return new Complex(real / n, img / n);
    }

//    @Override
//    public String toString() {
//        return  "real=" + real +
//                ", img=" + img;
//    }
}

public class Main extends Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter how many Complex Number you want to input: ");
            int n = sc.nextInt();
            Complex[] arrOfComplexNumbers = new Complex[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value for real part: ");
                float real = sc.nextFloat();
                System.out.print("Enter the value for imaginary part: ");
                float img = sc.nextFloat();
                Complex com = new Complex(real, img);
                arrOfComplexNumbers[i] = com;
                System.out.print("Complex number is: ");
                com.showComplex();
            }
            Complex c = new Complex();
            //Addition of two or three complex numbers...
//            switch(n) {
//                case 2:
//                    Complex add2 = c.sum2(arrOfComplexNumbers[0], arrOfComplexNumbers[1]);
//                    add2.showSum2();
//                //For multiplication of two numbers....
//                      Complex mul2 = c.multiply2(arrOfComplexNumbers[0],arrOfComplexNumbers[1]);
//                    mul2.showMul2();
//                    break;
//                case 3:
//                    Complex add3 = c.sum3(arrOfComplexNumbers[0], arrOfComplexNumbers[1], arrOfComplexNumbers[2]);
//                    add3.showSum2();
//                        //For Multiplcation of three numbers...
//                      Complex mul3 =c.multiply3(arrOfComplexNumbers[0],arrOfComplexNumbers[1],arrOfComplexNumbers[2]);
//                    mul3.showMul2();
//                    break;
//                default:
//                    System.out.println("No matching length");
//            }
            //Max of N complex numbers...
            Complex[] minMax = c.maxMin(arrOfComplexNumbers);
            System.out.print("Maximum of Complex numbers is: ");
            minMax[0].showComplex();
            System.out.print("Minimum of Complex numbers is: ");
            minMax[1].showComplex();

            //Average of Complex Numbers....
            Complex avg = c.average(arrOfComplexNumbers);
            System.out.print("Average of complex numbers: ");
            avg.showComplex();


        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
