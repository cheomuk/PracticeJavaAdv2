package network.tcp.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);

        InetAddress google = InetAddress.getByName("google.com");   // 분산 처리로 인해 IP 주소가 변경될 수 있다.
        System.out.println(google);
    }
}
