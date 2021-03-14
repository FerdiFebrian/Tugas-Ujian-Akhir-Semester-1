import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class sanamoprojek1{
	public static void main(String[]args){
        login();}
        static void login (){
		String data[]={"SANAMO PROJEK","sanamo123"};
		String nama,sandi;
		System.out.println("*****************************************************");
		System.out.println("||         SELAMAT DATANG DI SANAMO PROJEK         ||");
		System.out.println("||                POLITEKNIK KAMPAR                ||");
		System.out.println("*****************************************************");
		Scanner apa=new Scanner(System.in);
		System.out.print("Username	 : ");
		nama=apa.nextLine();
		System.out.print("Paswword	 : ");
		sandi=apa.nextLine();
        System.out.println();
        
		if(nama.equals(data[0])&&sandi.equals(data[1])){
            System.out.println("\t----------------------------------------------");
			System.out.println("\t\t\tSELAMAT DATANG");
            System.out.println("\t----------------------------------------------");
            System.out.println();
		}else{
			System.out.println("Maaf Nama Pengguna Atau Sandi Tidak Salah");
            login();
    }
		Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

         int jum=0, i=0;
         double total_bayar=0;
        System.out.println("\n\n\n\n\n\n\n\n\n");
         System.out.println("           ************************************************");
        System.out.println("                    SELAMAT DATANG DI TOKO SANAMO ");
         System.out.println("           ************************************************");
        System.out.println("\n");
        System.out.println("            \n\n");
        System.out.println("             _________________________________________");
        System.out.println("            |          MENU MAKANAN & Minuman         |");
        System.out.println("            |_________________________________________|");
        System.out.println("            |       Nama             |       Harga    |");
        System.out.println("            |1. Sari Roti            |   Rp 10000,00  |");
        System.out.println("            |2. Seprit               |   Rp 6000,00   |");
        System.out.println("            |3. Fanta                |   Rp 6000,00   |");
        System.out.println("            |4. Potato Balado        |   Rp 15000,00  |");
        System.out.println("            |5. Potato Manis         |   Rp 13000,00  |");
	    System.out.println("            |6. Fanta Susu           |   Rp 10000,00  |");
        System.out.println("            |7. Chip Ahh             |   Rp 4000,00   |");
        System.out.println("            |8. Hot Dog              |   Rp 18000,00  |");
        System.out.println("            |9. Lasegar              |   Rp 7000,00   |");
        System.out.println("            |10. Mie Ayam            |   Rp 15000,00  |");
        System.out.println("            |________________________|________________|");
        System.out.println("");


         int [] kode = new int[5];
         int [] item = new int[5];
         int [] harga = new int[5];
         double [] sub_total = new double[5];
         double [] diskon= new double [5];
         String [] barang = new String[5];
         
         System.out.println("            Selamat Datang Di Kasir SANAMO");
         
         System.out.print("            Masukan Jumlah Belanjaan : ");
         jum=input.nextInt();
         System.out.println(" ");

         for (i=0; i<jum;i++){
              System.out.print("            Masukan Kode Barang Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("            Masukan Jumlah item Ke-"+(i+1)+" : ");
              item[i]=input.nextInt();

              switch (kode[i]){
                    case 1 : 
                            barang[i]="Sari Roti  ";
                            harga[i]=10000;
                            diskon[i]=0.1;
                            break;
                    case 2 : 
                            barang[i]="Seprit  ";
                            harga[i]=6000;
                            diskon[i]=0.05;
                            break;
                    case 3 : 
                            barang[i]="Fanta   ";
                            harga[i]=6000;
                            diskon[i]=0;
                            break;
                    case 4 : 
                            barang[i]="Potato Balado        ";
                            harga[i]=15000;
                            diskon[i]=0.2;
                            break;
                    case 5 : 
                            barang[i]="Potato Manis    ";
                            harga[i]=13000;
                            diskon[i]=0.1;
                            break;
                    case 6 : 
                            barang[i]="Fanta Susu  ";
                            harga[i]=10000;
                            diskon[i]=0.1;
                            break;
                    case 7 : 
                            barang[i]="Chip Ahh  ";
                            harga[i]=4000;
                            diskon[i]=0.05;
                            break;
                    case 8 : 
                            barang[i]="Hot Dog";
                            harga[i]=18000;
                            diskon[i]=0;
                            break;
                    case 9 : 
                            barang[i]="Lasegar        ";
                            harga[i]=7000;
                            diskon[i]=0.2;
                            break;
                    case 10 : 
                            barang[i]="Mie Ayam     ";
                            harga[i]=15000;
                            diskon[i]=0.1;
                            break;
 
                  default : 
                            System.out.println("            Kode Barang Tidak Tersedia");
              }
         }
          formatRp.setCurrencySymbol("            Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No      Nama Barang                  Harga                       QTY         Diskon              Sub Total");  

          for (i=0; i<jum;i++){ 
             sub_total[i]=((item[i]*harga[i])-(item[i]*harga[i]*diskon[i]));
             total_bayar+=sub_total[i];
              System.out.println(          +i+1+"       "+barang[i]+"      "+kursIndonesia.format(harga[i])+"                "+item[i]+"           "+(int)(diskon[i]*100)+"%"+"    "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");

          System.out.println("            Total Bayar       : "+kursIndonesia.format(total_bayar));
          System.out.print  ("            Masukan Uang Anda : Rp.  ");
          int uang;
          Scanner oke=new Scanner(System.in);
          uang=oke.nextInt();
          System.out.println("            Kembalian          :   "+(uang-total_bayar));
          System.out.println("1. Kembali ke Menu");
		System.out.println("0. Selesai");
		int kondisi;
		System.out.print("Apakan Anda masih ingin program lain : ");
		kondisi=apa.nextInt();
		if(kondisi==1){
        System.out.println("           ************************************************");
        System.out.println("                    TERIMAKASIH TELAH BERBELANJA ");
        System.out.println("           ************************************************");
		}else{
      System.exit(0);
		}
    }
}