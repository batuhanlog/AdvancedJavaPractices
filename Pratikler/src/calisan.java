public abstract class calisan {                                                               // Class
    private String adSoyad;                                                          // Object
    private String telefon;
    private String ePosta;


    public calisan(String adSoyad, String telefon, String ePosta) {                  // Abstraction
        super();
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.ePosta =  ePosta;
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }
    public void giris(){
        System.out.println(this.getAdSoyad()+"Üniye Giriş Yapıldı !!");
    }

    public void cikis(){
        System.out.println(this.getAdSoyad()+"Üniden çıkış yapıldı !!");
    }
    public void yemekhane(){
        System.out.println(this.getAdSoyad()+" Yemak Haneye Girdi !");
    }

    public static void girisYapanlar(calisan[] loginUsers){
        for(calisan c : loginUsers){
            c.giris();
        }
    }
}
