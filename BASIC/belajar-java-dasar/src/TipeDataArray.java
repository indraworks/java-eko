public class TipeDataArray {
    public static void main(String[] args) {

      //atau bisa juga langsung 1 baris
        ///SEcara UMUM DECLARASI SEBB:(ini cara utama)

      //type_data[] variable  = new type_data[banyak_element_array_yg_dibuat]
      //jangan lupa kota [] merupakan type data arryanya
    String[] myName = new String[3];
    myName[0] = "indra";
    myName[1] = "Budi";
    myName[2] = "Suryawan";

        System.out.println(myName[0]);
        System.out.println(myName[1]);
        System.out.println(myName[2]);


    //cara2 : pengisian array //array initializer
        //ingat selallu utk String kalimat/kata petik " ( petik 2) jadi bukan petik tunggal! '
     String[] myName2 = {"Rudi ","Hartono ","Kenedi"};
        System.out.println("ini array inizializer");
        System.out.println(myName2[0]+myName2[1]+myName2[2]);
     //contoh lgi
     Integer[] myInteger2 = {1,2,3,4,5,6,7,8};
        System.out.println("myinteger :" +myInteger2[0]+myInteger2[1]+myInteger2[2]+myInteger2[3]+myInteger2[4]);

     //ubah data baik primitif maupun non sama sperti dibawah
        myInteger2[0] = 9;
        System.out.println("myinteger after update :" +myInteger2[0]+myInteger2[1]+myInteger2[2]+myInteger2[3]+myInteger2[4]);
    //menghapus data
        //penghapusan data array sbnarnya array tak bisa di hapus datanya hanya isinya
        //yg dikoosngkan kalau primitif =0 kalau non -primitif = null
        //contoh :
        myName[0] = null;
        System.out.println(myName[0]+myName[1]+myName[2]);
       //hitung panjang array contoh
       long[] arrayLong = { 10L,20l,300L}; //3 index array
        System.out.println("panjang array ="+arrayLong.length);


    }
}
/*
catatan utk tipe data aary adalah terdiiri dari block index mulai dari 0 sd ..
jika sudah diset banyak ruang utk indek sudah takbisa diubah
dan typedata yg sudah di declare juga nnti isi valuenya harus sesuai dgn typedata
misalkan mmbuat sbuah array dgn type string sebanyak 10 data
///SEcara UMUM DECLARASI SEBB:

cariable = new type_data[jumlah_element_array]
myLongCVar = new long[5];

contoh pengisain array
 String[] stringArray;
 stringArray = new String[3] //mendefiniiskan ruang array maks 4 index 0,1,2,3
  stringArray[0] ="Indra"
   stringArray[1] ="Budi "
    stringArray[2] ="Suryawan"
     stringArray[3] ="Handsome"

 ///PENGISIAN ARRAY SECARA LANGSUNG ///
     atau disebut array initializer
     contoh :
     integer[] arrayInteger = new int[] {110,98,88,74,53 }
     //jadi typedata[] variable = new typedata[] {value1,value2...}
     //value dimaskud isi element array teserah berapa banyak indexmya

     //atau bisa di singkat cara speti ii
     gak pake new typedata tapi langsung di sebutkan kurung kurawal dan isinya array tsb
     misL: String[] myname = {"indra","Suryawan","Budi"}

///Operasi array ////
utk ganti array  array[index] = new_value
                 utk hapus nilai araay
                 kalau dia non primitive diisi  null
                 array[index] = null
                 //utk cari panjang array
                 nama+_variable_array.length
 ///NOTE PENGAHPPUNSA DATA ARRAY DU JAVA TIKDA ADA MIS myarray[10] menjadi myarray[9] ini
 tidak nisa di java karena yg bisa di hapus hanyalah value dari array tersetu contoh
 myArray[1] = null;
 jadi alokasi banyak array sudah stataic tapi bisa dihapus



 */

