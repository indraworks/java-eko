public class VariableJava {
    public static void main(String[] args) {
        int mynumber = 17;
        mynumber =14;
        System.out.println(mynumber); //hasil 14 karena uda ditimpa data baru
        //yaitu 14
        String name ; //boleh begini ini berarti name empty string
        name = "Indra Budi Suryawan";
        int age = 38;
        String address ="Jakarta Indonesia";
        System.out.println(name +" "+ age +" "+ address);
    }
}
/*
catatan:dijava variable bersifat static ketika kita beri sbuah tipe data
dia variable tak bisa berubaj jad tipe data yg lain
contoh : int mynumber = 12;
         mynumber = 13.5  //ini batal pasti error
 ///type data primitive///

 type data primitive adalah typedata bawaan program :
 number,char,boolean
 jadi String bukan tupedata primitif sebab dia ada punya method
 dan jug apasa saat tak ada nilai dia  = null itu ciri khas-nya
 kebanyakan utk tipe data bukan primitif typedata tulisannya diawali huruf besar
 contoh Short ini buka tipe data primitif yg primitifnya short
 */