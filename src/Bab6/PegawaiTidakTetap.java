package Bab6;
public class PegawaiTidakTetap extends Employee {
    private double bonus;
    private String nama;
    private int id;
    private boolean istri;
    private int anak;
    private int totalgaji;
    private int tunjanganistri;
    private int tunjangananak;
    private int gajilembur;
    
    public PegawaiTidakTetap(String nama, int id, String jabatan){
        super(jabatan,0); 
        this.nama = nama;
        this.id = id;
        
    }
   
    public void setGajiLembur(int jam){
        if(jam>10){
            gajilembur = (jam-10)*10000;
        }else{
            gajilembur = 0;
        }
    }
    
    public void setTotalGaji(){
        totalgaji = super.getGaji()+gajilembur;
    }
    public int getTotalGaji(){
        return totalgaji;
    }
}
