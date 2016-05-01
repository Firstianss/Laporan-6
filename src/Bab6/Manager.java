package Bab6;
public class Manager extends Employee {
    private double bonus;
    private String nama;
    private int id;
    private boolean istri;
    private int anak;
    private int totalgaji;
    private int tunjanganistri;
    private int tunjangananak;
    private int tunjanganjabatan;
    
    public Manager(String nama, int id, String jabatan,  int tahun, boolean istri, int anak){
        super(jabatan, tahun); 
        this.nama = nama;
        this.id = id;
        this.istri = istri;
        this.anak = anak;   
        super.setBonusTunjangan();
        
    }
    public void setTunjanganIstri(){
        if(istri = true){
            tunjanganistri = 10*(super.getGaji()+super.getBonus()+super.getTunjangan())/100;
        }else{
            tunjanganistri = 0;
        }
    }
    public void setTunjanganAnak(){
        if(anak <= 3){
            tunjangananak = anak*(15*(super.getGaji()+super.getBonus()+super.getTunjangan())/100);
        }else{
            tunjangananak = 3*(15*(super.getGaji()+super.getBonus()+super.getTunjangan())/100);
        }
    }
    public void setTunjanganJabatan(){
        tunjanganjabatan = 10*(super.getGaji()+super.getBonus()+super.getTunjangan())/100;
    }
    public void setTotalGaji(){
        totalgaji = super.getGaji()+super.getBonus()+super.getTunjangan()+tunjangananak+tunjanganistri+tunjanganjabatan;
    }
    public int getTotalGaji(){
        return totalgaji;
    }
}
