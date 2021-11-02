      package com.company;
public class Abiturient {  //атрибут
            private int id ;
            private String FIO,
                    adress,
                    telefon;
   int ocenki;

            public Abiturient() { // конструктор
            }

            public int getId() {
                return id;
            }//геттер

            public String getFIO() {
                return FIO;
            }


            public String getAdress() {
                return adress;
            }

            public String getTelefon() {
                return telefon;
            }

    public int getOcenki() {
        return ocenki;
    }

    public Abiturient(int id, String FIO, String adress, String telefon, int ocenki) {
        this.id = id;
        this.FIO = FIO;
        this.adress = adress;
        this.telefon = telefon;
        this.ocenki = ocenki;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", adress='" + adress + '\'' +
                ", telefon='" + telefon + '\'' +
                ", ocenki=" + ocenki +
                '}';
    }




        }

