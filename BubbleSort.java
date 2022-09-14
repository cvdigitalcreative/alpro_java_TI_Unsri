class BubbleSort{
static void bubble_Sort(int[] angka){

    int n = angka.length;

    int temp = 0;
    for(int i=0; i< angka.length; i++){
      for(int j = 1; j<(n-i); j++){
        if( angka[j-1] > angka[j])
        {
          temp = angka[j-1];
          angka[j-1] = angka[j];
          angka[j] = temp;
        }
      }
      
    }
    
  }
  
  public static void main(String[] args) {

   int[] a1= {10,17,1,3,5,9}; 

    System.out.println("Sebelum di sorting");
      for(int i=0; i < a1.length; i++){  
          System.out.print(a1[i] + " ");  
        }  
    
    System.out.println("\r\n");
    bubble_Sort(a1);
    
    
    System.out.println("Setelah di sorting");
        for(int i=0; i < a1.length; i++){  
          System.out.print(a1[i] + " ");  
        }  

    System.out.println("\r\n");

  }


  
}