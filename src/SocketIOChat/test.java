import java.util.*;

class ClientSide implements Runnable {
    String string;
    String Msg;
    Scanner sc;

    ClientSide(String name, Scanner sc) {
        this.string = name;
        this.sc = sc;
    }

    public void run() {

        synchronized (sc) {
            while (true) {
                System.out.print(string + " : ");
                Msg = sc.next();
                if (Msg.equals("exit")) {
                    break;
                }
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}

class ServerSide implements Runnable {
    String string;
    Scanner sc;
    String Msg;

    ServerSide(String str, Scanner sc) {
        this.string = str;
        this.sc = sc;
    }

    public void run() {
        synchronized (sc)

        {
            while (true) {
                System.out.print(string + " : ");
                Msg = sc.next();
                if (Msg.equals("exit")) {
                    break;
                }
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.err.println(e);
        }

    }
}

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClientSide cs = new ClientSide("Client", sc);
        ServerSide ss = new ServerSide("Server", sc);

        Thread t1 = new Thread(cs);
        Thread t2 = new Thread(ss);

        t1.start();
        t2.start();
    }
}
