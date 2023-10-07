package inter;

public interface IBanka {

    final String hostIpAdres = "127.0.0.1";

    boolean connect(String ipAddress);
    boolean payment(double price,String cardNumber,String date,String ccv);
}
