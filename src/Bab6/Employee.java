package Bab6;
import java.util.*;
    public class Employee {
        private String jabatan;
        private int gaji;
        private int tahun;
        private int tunjangan;
        private int bonus;
    public Employee(String jabatan, int tahun) {
        if (jabatan.equalsIgnoreCase("manager")) {
            gaji = 10000000;
            this.tahun = tahun;
           
        }else{
            gaji = 4000000;
            this.tahun = tahun;
        }
    }
    
    public void setBonusTunjangan(){
        if(2016-tahun <= 5){
            bonus = 0;
            tunjangan = 0;
        }else if (2016-tahun >=6 && 2016-tahun <=10) {
            bonus = 5*tahun*gaji/100;
            tunjangan = 0;
        }else{
            bonus = 10*tahun*gaji/100;
            tunjangan = 10*tahun*gaji/100;
        }
    }
    public int getGaji(){
        return gaji;
    }
    public int getBonus(){
        return bonus;
    }
    public int getTunjangan(){
        return tunjangan;
    }
    
   
    
}
