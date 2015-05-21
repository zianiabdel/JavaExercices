package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	public MonClient() throws UnknownHostException, IOException{
		super("127.0.0.1",Param.numPort);
		System.out.println("Le client est connecté");
	}
		
	public MonClient(String ip, int numPort) throws UnknownHostException, IOException{
		super(ip,numPort);
		System.out.println("Le client est connecté");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MonClient mc = new MonClient("127.0.0.1",Param.numPort);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
