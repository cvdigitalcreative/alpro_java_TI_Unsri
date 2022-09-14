class LinearSearch {

  
  static void linear_Search(int[] angka, int x){
    for (int i = 0; i <= angka.length-1; i++){
      if(angka[i] == x){
        System.out.println("Angka "+angka[i]+" Ditemukan Di index ke - "+i);
        break;
      }else if(i == angka.length-1){
        System.out.println("Tidak ditemukan");
      }
    }
  }
  
  public static void main(String[] args) {

   int[] a1= {90,10,20,100,80,70}; 
    linear_Search(a1, 10);

  }
  

  
}