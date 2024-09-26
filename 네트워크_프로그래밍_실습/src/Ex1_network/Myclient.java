package Ex1_network;

import java.io.IOException;
import java.net.Socket;

public class Myclient {
public static void main(String[] args) {
	
	try {
		Socket s = new Socket("192.168.0.22",3000);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
}//main
}
