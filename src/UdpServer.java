import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        // Step 1 : Create a socket to listen at port 1234
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = null;
        System.out.println("Server Ready...");
        while (true) {

            // Step 2 : create a DatagramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);

            // Step 3 : receive the data in byte buffer.
            ds.receive(DpReceive);

            System.out.println("Client:- " + data(receive));

            // Exit the server if the client sends "bye"
            if (data(receive).toString().equals("Bye")) {
                System.out.println("Client sent bye.....EXITING");
                ds.close();
                break;
            }

            // Clear the buffer after every message.
            receive = new byte[65535];
        }
    }
    public static StringBuilder data(byte[] a) {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}