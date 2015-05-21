package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeurTCP extends ServerSocket {
	private int numPort;
	private Socket client;
	public MonServeurTCP() throws IOException {
		super(Param.numPort);
		numPort = Param.numPort;
		client = this.accept();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		MonServeurTCP ms = null;
		int i;
		for ( i = Param.numPort; i< 65535; i++){
			try {
				ms = new MonServeurTCP();
				System.out.println("le serveur ecoute sur le port : "+Param.numPort);
				break;
				//Socket client = ms.accept();
			} catch (IOException e) {
				e.printStackTrace();
				Param.numPort ++;
			}
			System.out.println("aucun port n'est disponible");
		}
		if (i == 65536){
			System.out.println("none");
		}

	}
}
