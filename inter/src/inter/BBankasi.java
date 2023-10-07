package inter;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String password;

    public BBankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }
    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip :" + ipAddress);
        System.out.println("Makina ip : "+this.hostIpAdres);
        System.out.println(this.bankaAdi + " Baglanıldı !");

        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String ccv) {
        System.out.println("Bankadan cevap bekleniyor !");
        System.out.println("İşlem Başarılı Bir şekilde Gerçekleşmiştir.");
        return false;
    }
}
