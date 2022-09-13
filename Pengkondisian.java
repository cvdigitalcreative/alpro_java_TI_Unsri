class Pengkondisian{

  
 public static void main(String[] args) {


  System.out.println("Pengkondisian Menggunakan If Else");
  int a = 5;
   
  if(a%2==0){
     System.out.println(a+" Adalah Genap");
  }else{
    System.out.println(a+" Adalah Ganjil");
  }

    System.out.println("Pengkondisian Menggunakan If Else");
   int b = 8;
   if(b > 5){
     System.out.println(b+" lebih dari 5");
   }else{
     System.out.println(b+" kurang dari 5");
   }

   System.out.println("Pengkondisian Menggunakan If Else If");
   int status_cuti = 1;

   if(status_cuti == 1){
     
     System.out.println("Belum diterima");
     
   }else if(status_cuti == 2){
     
     System.out.println("Di tolak");
     
   }else if(status_cuti == 3){
     
     System.out.println("Di Terima");
     
   }
   
System.out.println("Pengkondisian Menggunakan Switch");
   
   switch(status_cuti){
     case 1: System.out.println("Belum diterima");
           break;
      case 2: System.out.println("Di tolak");
           break;
       case 3: System.out.println("Di Terima");
           break;
   }
   
   
 }

  
  
}