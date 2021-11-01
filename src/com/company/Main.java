package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Abiturient student[]=new Abiturient[5];
        student[0]=new Abiturient(1,"Ali","Nursutan","87786554444","4");
        student[1]=new Abiturient(2,"Asel","Shymkent","87783066135","5");
        student[2]=new Abiturient(3,"Aida","Aktau","87012446677","5");
        student[3]=new Abiturient(4,"Sayat","Almaty","87752660033","2");
        student[4]=new Abiturient(5,"Ansar","Aktau","8705545554","2");
        System.out.println("a) Studennter tyzymy korset neydov.ocen");
        String baga=sc.nextLine();
        for (int i = 0; i <5 ; i++) {
            if(student[i].getOcenki().equalsIgnoreCase(baga)){
                System.out.println(student[i].toString());
            }

            }
        }
    }
