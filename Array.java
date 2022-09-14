import java.util.*;


class Array {
  
  public static void main(String[] args) {

    int[] nilai_mahasiswa = {80, 70, 60, 70, 76, 90};


    // Cara akses array by index
    // System.out.println(nilai_mahasiswa[0]);

    // Cara akses panjang array
    // System.out.println(nilai_mahasiswa.length);


    // Cara akses nilai array seluruhnya

    
    // for(int i=0; i<=nilai_mahasiswa.length-1; i++){
      
    //   System.out.println(nilai_mahasiswa[i]);
    // }

    // Contoh array multi dimensi
    // String[][] nilai_mahasiswa_multi = {{"Taufik", "Kresna"}, {"Emri", "Rio"}};

    // System.out.println(nilai_mahasiswa_multi[0][0]);
    

     HashMap<String, String> data_mahasiswa_1
            = new HashMap<String, String>();

    data_mahasiswa_1.put("Nama", "Taufik");
    data_mahasiswa_1.put("NIK", "1628172817812");
    data_mahasiswa_1.put("No HP", "0182712671671");

    HashMap<String, String> data_mahasiswa_2
            = new HashMap<String, String>();

    data_mahasiswa_2.put("Nama", "Emri");
    data_mahasiswa_2.put("NIK", "16182187812");
    data_mahasiswa_2.put("No HP", "01827176271");

    // System.out.println(data_mahasiswa);

    // System.out.println(data_mahasiswa_1.get("Nama"));

    HashMap[] nilai_mahasiswa_hash = {data_mahasiswa_1, data_mahasiswa_2};
    
    // System.out.println(nilai_mahasiswa_hash[0].get("Nama"));

     for(int i=0; i<=nilai_mahasiswa_hash.length-1; i++){
      
      System.out.println(nilai_mahasiswa_hash[i].get("NIK"));
    }

  }
}