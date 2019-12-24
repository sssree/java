package com.satya;
import java.time.LocalDate;
import java.util.*;
import java.lang.String;
import java.lang.*;

class Customer
{
    String name;
    private String des;
    private String date;

    public Customer(String s1, String s2,String s3) {
        name=s1;
        des=s2;
        date=s3;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
public class examplel {

    public static void main(String arg[]) {
        System.out.println("choose one option");
        System.out.println("1.Add 2.list 3.search 4.delete 5.exit");
        Scanner sc = new Scanner(System.in);
        List<Customer> a = new ArrayList<>();

        while (true) {
            System.out.print("choice select");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    String s1 = sc.next();
                    System.out.println("description");
                    String s2 = sc.next();
                    String s3=sc.next();
                    a.add(new Customer(s1, s2,s3));
                    System.out.println("done");
                    break;
                case 3:
                    String ab=sc.next();
                    for (Customer s:a)
                    {
                        if(s.name.matches(ab)){
                            System.out.print("yes");
                        }
                    }
                    break;
                case 2:
                    for (Customer c : a) {

                        System.out.print(c);
                    }
                    break;
                case 4:
                    int d=sc.nextInt();
                    a.remove(d);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }
}

