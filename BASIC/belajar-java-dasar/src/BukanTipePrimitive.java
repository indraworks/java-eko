public class BukanTipePrimitive {
    public static void main(String[] args) {
    //konversi dari primitive ke non-primitiv e langsung
        int age = 38;
       Integer ageObject = age ; //langsung

       byte agePrimByte = ageObject.byteValue();
       //kalau konversi ke rimitive maka non primitive wajib method:
        // typedata.value()
        //ini jika non-primitive typedata beda dgn primitive-typedata jadi harus di
        //konversi dulu dgn method diatas
       long iniPrimLong = ageObject.longValue();
        System.out.println(ageObject);
        System.out.println("dibawah ini primitive stlah coversi dari Integer");
        System.out.println();
    }
}

/*
jadi gini utk type primitive ,mrupakan java bultin type data
number,char,boolean
 ///type data primitive///

 type data primitive adalah typedata bawaan program :
 number,char,boolean
 jadi String bukan tupedata primitif sebab dia ada punya method
 dan jug apasa saat tak ada nilai dia  = null itu ciri khas-nya
 kebanyakan utk tipe data bukan primitif typedata tulisannya diawali huruf besar
 contoh Short ini buka tipe data primitif yg primitifnya short
 utk typpe data bkan primitive dia smua selalu huruf besar!
 trus bagaiman kita mengkonvesinya ?
 kalau dari primitive ke bukan primitive langsung saja
 contoh:
 int age = 30; //ini primitive
 Integer ageObject = age; // ageObject bukan priitiv diisi ag ebisa langsung
 int ageAgain = ageObject //sesama priitive
 short shortAge = ageObject.shortValue ;
 non-primitive diisi primitIVE SYARATNYA harus ada typedata.value
 byte byteAge =ageObject.byteValue()


 */
