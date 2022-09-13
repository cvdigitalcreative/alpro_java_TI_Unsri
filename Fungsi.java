class Fungsi{



  public static String cetak_nama_fungsi(){
      return "Halo";
  }

  public static int cetak_nama_fungsi_int(){
      return 1;
  }

  public static void cetak_nama_prosedur(){
     System.out.println("Halo");
  }

  public static void jumlah_prosedur(int a, int b){
    
    int jumlah = a + b;
    System.out.println(jumlah);
    
  }
 public static void main(String[] args) {

   System.out.println("Menggunakan Fungsi");
   cetak_nama_fungsi();

   System.out.println("Menggunakan Prosedur");
   cetak_nama_prosedur();

   System.out.println("Menggunakan Prosedur paramter");
  jumlah_prosedur(1, 2);

   System.out.println(jumlah);

   cetak_nama_fungsi_int();
 }

}