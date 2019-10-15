/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan40.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Warna kepribadian
 */
public class PBO11K10118905Latihan40WarnaKepribadian {
    public static final String NORMAL = "\u001b[0m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String BIRUMUDA = "\u001B[36m";
    public static final String PUTIH = "\u001B[37m";
    
    public static final String BG_HITAM = "\u001B[40m";
    public static final String BG_MERAH = "\u001B[41m";
    public static final String BG_HIJAU = "\u001B[42m";
    public static final String BG_KUNING = "\u001B[43m";
    public static final String BG_BIRU = "\u001B[44m";
    public static final String BG_UNGU = "\u001B[45m";
    public static Scanner input = new Scanner(System.in);
    public static void tc(String warna, String teks){
        System.out.println(warna+teks+NORMAL);
    }
    public static void tcln(String warna, String teks){
        System.out.println(warna+teks+NORMAL);
    }
    public static void bgtcln(String warna, String teks, String bg){
        System.out.println(bg+warna"\t\t"+teks"\t\t"+NORMAL);
    }
    
    public static void main(String[] args) {
      String pilih,nama;
      tc(MERAH, "YUK");
      tc(HIJAU, "CEK");
      tc(KUNING, "KEPRIBADIANMU");
      tc(BIRUMUDA, "DARI");
      tc(UNGU, "WARNA");
      tc(BIRU, "FAVORITMU");
        System.out.println("");
      bgtcln(PUTIH,"MERAH",BG_MERAH);
      bgtcln(PUTIH,"HIJAU",BG_HIJAU);
      bgtcln(PUTIH,"KUNING",BG_KUNING);
      bgtcln(PUTIH,"BIRU",BG_BIRU);
      bgtcln(PUTIH,"UNGU",BG_UNGU);
        System.out.println("");
        System.out.println("PILIH WARNA FAVORITMU : ");
        pilih = input.next().toUpperCase();
        System.out.println("NAMA KAMU : ");
        nama = input.next().toUpperCase();
        System.out.println("");
        if ((pilih.equals("MERAH"))||(pilih.equals("HIJAU"))|| (pilih.equals("KUNING"))|| (pilih.equals("BIRU"))|| (pilih.equals("UNGU"))){
            System.out.println("==========HASIL TES KEPRIBADIAN "+nama+"==========");
            warna.hasilTes(pilih);
        }else {
            System.out.println("=========HASIL TES KEPRIBADIAN "+nama+"==========");
            System.out.println("Ooops... Belum Treidentifikasi");
        }
    }
    
}
