package effective.java.com.company.menu;

import effective.java.com.company.generics.GenericsMain;

import java.util.Scanner;

public class Menu {

    public void menu(){
        System.out.println("*** GENERICS ***");
        System.out.println("Sorting - 3");
        System.out.println("");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        runMethod(scanner.nextInt());

    }

    private void runMethod(int choice){
        switch (choice){
            case 3:
                new GenericsMain().main();
                break;
            case 4:
                int a = 3;
                switch(a) {
                    default:
                        System.out.println("default");
                    case 1:
                        System.out.println("1");
                    case 2:
                        System.out.println("2");
                }
                break;
            case 5:
                if (compare(3, 2) | (compare(1, 2) &&  compare(0, 2))) {
                    System.out.println("inside main if");
                }
                break;

            case 6:
                Integer x = 111;
                Integer y = Integer.valueOf("111");
                Integer z = new Integer(111);


                System.out.println(x==y);
                System.out.println(y==z);
                System.out.println(x==z);
                break;
            default:
                System.out.println("Default");
        }
    }


    public static boolean compare(int a, int b) {
        System.out.println("compare " + a + " and " + b);
        return a > b;
    }

}
