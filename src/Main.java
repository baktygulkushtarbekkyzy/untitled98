import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
  People people=new People("Kushtarbek",49);
  People people1=new People("Symbat",46);
  People people2=new People("Omurbek",26);
  People people3=new People("Sultanbek",23);
  People people4=new People("Mirlan",47);
  People people5=new People("Yrys",45);
  People people6=new People("Kubat",21);
  People people7=new People("Rysbek",76);
  People people8=new People("Rayla",74);
  People people9=new People("Suyuntay",30);
  People people10=new People("Joomartbek",49);
  People people11=new People("Gulkayir",42);
  People people12=new People("Chynarhan",23);
People[] SemyaKushtarbek={people,people1,people2,people3};
People[] SemyaMirlan={people4,people5,people6};
People[]SemyaRysbek={people7,people8,people9};
People[] SemyaJoomartbek={people10,people11,people12};


Kvartiranttar kvartiranttar=new Kvartiranttar(SemyaKushtarbek,SemyaJoomartbek);
Obshejitiyadagylar obshejitiyadagylar=new Obshejitiyadagylar(SemyaMirlan);
GostinitsadaJashagandar gostinitsadaJashagandar=new GostinitsadaJashagandar(SemyaRysbek);

int a=0;
      for (People e:SemyaKushtarbek) {
        System.out.println(e);
        a++;
      }
        for (People e:SemyaJoomartbek) {
            System.out.println(e);
            a++;
        }
        kvartiranttar.komusluga();
      System.out.println("Квартирада "+a+ " адам жашайт. ");
        System.out.println("-----------------------------------------------");

int t=0;
        for (People e:SemyaMirlan) {
            System.out.println(e);
            t++;
        }
        obshejitiyadagylar.arenda();
        System.out.println("Жатаканада "+t+" адам жашайт. ");
        System.out.println("-----------------------------------------------");

        int r=0;

        for (People e:SemyaRysbek) {
            System.out.println(e);
            r++;
        }
        gostinitsadaJashagandar.arenda();
        System.out.println("Гостиницада "+r+" адам жашайт. ");
        System.out.println("-----------------------------------------------");




    }
}