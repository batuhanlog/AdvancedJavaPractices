public class OgretimGorevlisi extends akademisyen {
     private String kapiNo;
    public OgretimGorevlisi(String adSoyad,String telefon,String eposta, String bolum,String unvan){
         super(adSoyad,telefon,eposta,bolum,unvan);
         this.kapiNo = kapiNo;
     }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + "ögretim görevlisi b kapısından giriş yaptı !");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() +" Ögretim görevlisi şu saat'de giriş yaptı "+saat);
    }
}

