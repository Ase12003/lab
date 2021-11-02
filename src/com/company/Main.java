package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Abiturient student[]=new Abiturient[5];// массив объектов
        student[0]=new Abiturient(1,"Ali","Nursutan","87786554444",80);
        student[1]=new Abiturient(2,"Asel","Shymkent","87783066135",100);
        student[2]=new Abiturient(3,"Aida","Aktau","87012446677",95);
        student[3]=new Abiturient(4,"Sayat","Almaty","87752660033",50);
        student[4]=new Abiturient(5,"Ansar","Aktau","8705545554",40);
        System.out.println("a) Studennter tyzymy korset neydov.ocen");
        int baga=sc.nextInt();
        for (int i = 0; i <5 ; i++) {
            if(student[i].getOcenki()<=50){
                System.out.println(student[i].toString());
            }

            }

        System.out.println("a) Studennter мшцу");
       int ball=sc.nextInt();
        for (int i = 0; i <5 ; i++) {
            if(student[i].getOcenki()>ball){
                System.out.println(student[i].toString());
            }

        }
        }
    }
