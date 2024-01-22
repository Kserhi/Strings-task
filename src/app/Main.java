package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] firstMas = new String[]{"brange", "plum", "tomato", "onibn", "grape"};
        String[] secondMas = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
        String[] thirdMas = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        System.out.println("The result of the first task");
        System.out.println(firstTask(firstMas));
        System.out.println("The result of the second task");
        System.out.println(secondTask(secondMas));
        System.out.println("The result of the third task");
        thirdTask(thirdMas);
    }

    public static String firstTask(String[] mas) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String text : mas) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(text.replace("b", "o"))
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    public static String secondTask(String[] mas) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String text : mas) {
            if (!text.equals("onion")) {
                count++;
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(text)
                        .append("\n");
            }

        }
        return stringBuilder.toString();

    }

    public static void thirdTask(String[] mas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String enterText=scanner.next();
        int countOfName =counter(mas,enterText);
        if (countOfName ==0){
            System.out.println("Sorry, but this name was not found");
        }else {
            System.out.println("The name "+enterText+ " is found "+ countOfName + " times");
        }

    }

    public static int counter(String [] mas ,String text){
        int count=0;
        for (String string:mas){
            if (string.equals(text)){
                count++;
            }
        }
        return count;
    }
}






