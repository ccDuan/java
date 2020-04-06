package com.ccduan;

public class LambdaDemo01 {

    interface  Printer{
        void printer(String str);
    }

    public void printStr(String str,Printer printer){
        printer.printer(str);
    }

    public static void main(String[] args) {
        LambdaDemo01 lambdaDemo01 = new LambdaDemo01();
//        Printer printer = new Printer() {
//            @Override
//            public void printer(String str) {
//                System.out.println(str);
//            }
//        };
        //------------简化1----------------
        //用lambda
//        Printer printer = (String str)->{
//            System.out.println(str);
//        };

        //------------简化2,  这种前提是函数体只有一行----------------
      //  Printer printer = str -> System.out.println(str);


        //替换
        lambdaDemo01.printStr("字符串",str -> System.out.println(str));
        //   左边是参数->  右边是函数体

        //如果没有参数
        //() -> System.out.println("");
    }
}
