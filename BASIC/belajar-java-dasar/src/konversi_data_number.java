public class konversi_data_number {
    public static void main(String[] args) {
       //widening convery langsung
        byte iniByte = 10;
        short iniShort = iniByte; // dari byte ke short otomtas langsung
        long iniLong = iniShort;  //ini langsung dar short ke long

        //narowing conversy
        long iniLong2 = 3275;
        //saya mau ke short maka harus saya buat jadi typedata short dgn (short) sbb:
        short iniShort2 = (short) iniLong2;
        //btw hati2 dgn overflow mis data saya double tapi saya taruh maks > dari data yg
        //mau saya konversi contoh
        double iniDouble2 = 12_000_000;
        //short iniShort = (short) iniDouble2; ini akan error overflow maksnya gak sanggup
        long iniLong3 = (long) iniDouble2; //ini masih sanggup sbga data long sd 1 miliar max rangenya
    }
}
/*
jadi widening conversi artinya mindah typedata sbuah variable dari tyedata kecil ke besar ini otomatis aja
 char->short_>int_>long->double

narowing dari besar ke typedata kecil maka ini gak bisa langsung harus tambahkan typedata tanda kurung
sblum dipindah :
double->long->int->short->char





 */