package inter;

public class ABankasi implements IBanka{
    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }


@Override
   public boolean connect(String ipAdress){
       System.out.println("Kullanıcı ip :" + ipAdress);
       System.out.println("Makina ip : "+this.hostIpAdres);
       System.out.println(this.bankaAdi + " Baglanıldı !");
       return true;
   }
    @Override
    public boolean payment(double price,String cardNumber,String date,String ccv){
        //Banka ödeme işlemleri
       System.out.println("Bankadan cevap bekleniyor !");
       System.out.println("İşlem Başarılı Bir şekilde Gerçekleşmiştir.");
       return true;
   }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }
}
