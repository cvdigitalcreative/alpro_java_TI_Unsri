import java.util.Scanner;  

class Main {
  
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in); 
    
    // System.out.println("Hello world!");

    System.out.print("Masukan lebar: "); 
    int lebar = myObj.nextInt();  // Read user input
    System.out.print("Masukan panjang: "); 
    int panjang = myObj.nextInt();  // Read user input

    int hasil = panjang * lebar;
    
    System.out.println(hasil);
    
  }
  
}