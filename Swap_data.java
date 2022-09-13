class Swap_data{
  public static void main(String[] args) {
    int a = 1;
    int b = 2;

    System.out.println("Isi variable a sebelum di swap");
    System.out.println("A = " +a);

    System.out.println("Isi variable b sebelum di swap");
    System.out.println("B = " +b);
    
    int temp;

    temp = a;
    System.out.println("Isi variable Temp");
    System.out.println(temp);

    a = b;
    System.out.println("Isi variable a");
    System.out.println(" A = "+a);
    
    b = temp;
    System.out.println("Isi variable b");
    System.out.println(" B = "+b);
    
   
  }
}