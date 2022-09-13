class Looping{

  public static void main(String[] args) {
    
    System.out.println("Looping menggunakan For Loop");
    for (int i=100; i>0; i--){
       System.out.println(i);
    }

    System.out.println("Looping menggunakan While");
    int a = 10;
    while(a < 10){
       System.out.println(a);
        a++;
    }

    System.out.println("Looping menggunakan Do While");
    
    int b = 5;

    do{
      System.out.println(b);
        b++;
    }while(b<5);
    
  }
}