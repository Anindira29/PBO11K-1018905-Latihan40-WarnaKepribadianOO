/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan40.warnakepribadian;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Warna kepribadian
 */
public class warna {
    private static void merah(){
        System.out.println("1. periang,");
        System.out.println("2. pemberani,");
        System.out.println("3. berani mengambil keputusan,");
        System.out.println("4. menyukai tantangan,");
        System.out.println("5. kurang sabar,");
        System.out.println("6. dapat menahan marah namun jikasudah ditanap puncaktoleransi, kemarahanya akan sulit dikontrol,");
        System.out.println("7. memiliki energi kehangatan dan cinta");
    }
     private static void hijau(){
        System.out.println("1. romantis,");
        System.out.println("2. menyukai hal yang berbau alami dan keindahan,,");
        System.out.println("3. teguh pada prinsip,");
        System.out.println("4. menyukai tantangan,");
        System.out.println("5. mengiginkan kesempurnaan,");
        System.out.println("6. mudah cemburu,");
        System.out.println("7. mudah merasa iri");
        System.out.println("8. menjunjug tinggi suatu niai toleransi dan kepercayaan.");
    }
     private static void kuning(){
        System.out.println("1. optimis,");
        System.out.println("2. suka bergaul ,");
        System.out.println("3. periang,");
        System.out.println("4. senang menolong,");
        System.out.println("5. lincah dan aktif,");
        System.out.println("6. tidak suka meremehkan kekurangan orang,");
        System.out.println("7. loyal");
        System.out.println("8. hangat");
        System.out.println("9. meskipun karakternya optimis dan idealis , seringkali goyah dan tidak stabil,");
        System.out.println("10. cenderung penakut,");
    }
     private static void biru(){
        System.out.println("1. menyenangkan,");
        System.out.println("2. bijaksana,");
        System.out.println("3. pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. dinamis,");
        System.out.println("5. senang berbagi,");
        System.out.println("6. bersahabat,");
        System.out.println("7. tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8.menyembunyikan perasaan karena karakternya yang cenderung mencari damai");
     }
     private static void ungu(){
        System.out.println("1. optimis,");
        System.out.println("2. tidak pernah ragu,");
        System.out.println("3. menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. memiliki ambisi yang besar ,");
        System.out.println("5. memiliki empati yang besar,");
        System.out.println("6. memiliki sisi misterius sebab seringkali menutupi perasaanya,");
        System.out.println("7. terkadang bersikap keras kepala dan angkuh");
     }
     public static void hasilTes(String d){
         System.out.println("Warna favoritmu adalah :");
         switch (d){
            case "MERAH":
                     System.out.println("\u001b[31m"+"MERAH"+"\u001b[0m");
                     merah();
                     break;
            case "HIJAU":
                     System.out.println("\u001b[32m"+"HIJAU"+"\u001b[0m");
                     hijau();
                     break;
            case "KUNING":
                     System.out.println("\u001b[33m"+"KUNING"+"\u001b[0m");
                     kuning();
                     break;
            case "BIRU":
                     System.out.println("\u001b[34m"+"BIRU"+"\u001b[0m");
                     biru();
                     break;
            case "UNGU":
                     System.out.println("\u001b[35m"+"UNGU"+"\u001b[0m");
                     ungu();
                     break;         
            }
        }
     }
