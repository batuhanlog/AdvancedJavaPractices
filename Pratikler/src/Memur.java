public abstract class Memur extends calisan{
    private String deparmant;
    private String mesai;

    public Memur(String adSoyad, String telefon, String ePosta, String deparmant, String mesai) {
        super(adSoyad, telefon, ePosta);
        this.deparmant = deparmant;
        this.mesai = mesai;
    }

    public String getDeparmant() {
        return deparmant;
    }

    public void setDeparmant(String deparmant) {
        this.deparmant = deparmant;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println("Kişi Çalışıyor !");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+ " Çalışanı c kapısından giriş yaptı");
    }
}
