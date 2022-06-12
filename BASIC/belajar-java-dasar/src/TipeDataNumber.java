public class TipeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 100;
        short iniSort = 1000;
        int iniInt = 32000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L ; //utk longbisa tambahkan L diakhir
        //short iniShortSalah = 10000000;//error

        //floating number `bilangan desimal formatnya . dgn dot
        float iniFloat = 10.10f;  //bisa f besar F sama saja
        double iniDouble = 10.10; //

        //TYPEDATA LITERAL jadi gak mulu dari puluhan base 10 tapu base16 dan base 2 binary
        //contoh
        int decimalInt = 25;
        int hexInt = 0xA132B; // utk hex dimuali dati 0x setelahnya bil hexanya
        int binInt = 0b01101; //utk bin dimuali dari 0b stlahny abilangan binernya

        //penulisan under-score 10_1000_000 ini bleh underscore sebarang gk msalah
        int iniInt2 = 10_000_000; //lebih mudah ngitungnya


    }
}

/*
tipe data number terbai atas:
byte:         //dari -128 ->127
short:        //adri -32768 ->32767
integer:      //dari -2.147.463.648 -->sama positif
long:         //dri 9.223.372.036.854.775.808

penulisannya typedata_huruf kecil namaVariable = valuenya
contoh diatas!
kalau kelebiha mis typedata short diiisi angka  sampai 32000000 maka ekan errror!
karena gak muat data yg diisi dara int !
 */
/*
Floating Number :
float mulai 3.4e-038 //e dsini pangkat sd +38  ~ini 4 bytes
double 1.7-308 sd e+308 // ini 8 bytes
smua default 0.0
 */