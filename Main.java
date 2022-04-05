import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    String zdanie;
    char symbol;
    Scanner wpis =new Scanner(System.in);
    System.out.println("Podaj zdanie");
    zdanie = wpis.nextLine();

    int dlugosc = zdanie.length();
    char znak[]=new char[dlugosc];
    for(int z=0;z<=dlugosc;z++)
    {
      znak[z]=zdanie.charAt(z);
      }
      int zmiana=0;
      int ascii;
      for(int i =0;i<=dlugosc;i++){
        ascii=znak[i];
        if(ascii >=97 && ascii <=122)
        {
          ascii=ascii-32;
          symbol=(char)ascii;
          zmiana++;
        }
      }
    for(int i=0;i<=dlugosc;i++){
      System.out.println(znak);
      
    }
        System.out.println("ilosc zmian:"+zmiana);
    }
  }
