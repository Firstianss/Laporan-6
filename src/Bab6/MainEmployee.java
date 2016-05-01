package Bab6;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<String> nm = new ArrayList<String>();
        ArrayList<String> jab = new ArrayList<String>();
        ArrayList<Integer> gaji = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        String loop;
        do{
        System.out.print("Nama : ");
        String nama = input.next();
        nm.add(nama);
        System.out.print("ID : ");
        int id = input.nextInt();
        System.out.print("Jabatan : ");
        String jabatan = input.next();
        jab.add(jabatan);
        
        if (jabatan.equalsIgnoreCase("manager")||jabatan.equalsIgnoreCase("pns")) {
            System.out.print("Tahun Kerja : ");
            int tahun = input.nextInt();
            System.out.print("Status Pernikahan (Y/N) : ");
            String nikah = input.next(); 
            boolean istri;
            int anak;
            if (nikah.equalsIgnoreCase("y")) {
                istri = true;
                System.out.print("Jumlah anak : ");
                anak = input.nextInt();
            }else{
                istri = false;
                anak = 0;
            }
            
            if (jabatan.equalsIgnoreCase("manager")) {
                System.out.println("===================");
                Manager m = new Manager(nama,id,jabatan,tahun,istri,anak);
                m.setTunjanganAnak();
                m.setTunjanganIstri();
                m.setTunjanganJabatan();
                m.setTotalGaji();
                gaji.add(m.getTotalGaji());
                
            }else{
                System.out.println("===================");
                PegawaiTetap pns = new PegawaiTetap(nama,id,jabatan,tahun,istri,anak);
                pns.setTunjanganAnak();
                pns.setTunjanganIstri();
                pns.setTotalGaji();
                gaji.add(pns.getTotalGaji());
                
            }
        }else{
            System.out.print("Jam Kerja : ");
            int jam = input.nextInt();
            System.out.println("===================");
            PegawaiTidakTetap npns = new PegawaiTidakTetap(nama,id,jabatan);
            npns.setGajiLembur(jam);
            npns.setTotalGaji();
            gaji.add(npns.getTotalGaji());
           
        }
            System.out.print("Input lagi ? (Y/N) : ");
            loop = input.next();
        }while (loop.equalsIgnoreCase("y"));
            
        System.out.println("======================================");
        System.out.println("Nama\t\tJabatan\t\tGaji");
        System.out.println("======================================");
        for (int j = 0; j < nm.size(); j++) {
            System.out.println(nm.get(j) + "\t\t" + jab.get(j) + "\t\t" + gaji.get(j));
        }
        System.out.println("======================================");
        }
        
}
