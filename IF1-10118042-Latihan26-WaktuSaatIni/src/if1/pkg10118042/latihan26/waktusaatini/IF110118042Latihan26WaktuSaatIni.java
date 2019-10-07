/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan26.waktusaatini;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Menampilkan waktu terkini
 */
public class IF110118042Latihan26WaktuSaatIni {


    public static void main(String[] args) {
    String hari; 
    
        Date dKini = new Date( );
        SimpleDateFormat day = new SimpleDateFormat ("EEEE");
        
        if(day.equals("Sunday")){
            hari = "Minggu";
        }
        else if(day.equals("Monday")){
            hari = "Senin";
        }
        else if(day.equals("Tuesday")){
            hari = "Selasa";
        }
        else if(day.equals("Wednesday")){
            hari = "Rabu";
        }
        else if (day.equals("Thursday")){
            hari = "Kamis";
        }
        else if (day.equals("Friday")){
            hari = "Jumat";
        }
        else {
            hari = "Sabtu";
        }
        
        SimpleDateFormat today = new SimpleDateFormat (", dd MMM yyyy h:mm:ss");
        System.out.println("Hari ini adalah hari : "+ hari  + today.format(dKini));
    }
    
}
