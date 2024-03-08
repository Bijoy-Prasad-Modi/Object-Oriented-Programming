package com.Bijoy.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//        int c = a/b;
//        throw new Exception("Just for fun");

            String name = "Bijoy";
            if(name.equals("Bijoy")){
                throw new Myexception("name is Bijoy");
            }
        } catch (Myexception e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("normal exception");
        } finally{
            System.out.println("this will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
