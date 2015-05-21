package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur extends ServerSocket implements Runnable {
	private int numPort;
	private ArrayList<Socket> tabClient = new ArrayList<Socket>();
	public MonServeur() throws IOException {
		super(Param.numPort);
		this.numPort = Param.numPort;
		// TODO Auto-generated constructor stub
	}
	
	public MonServeur (int numPort) throws IOException {
		super (numPort);
		this.numPort = numPort;
		
		System.out.println("*** Le serveur ecoute*** : " + numPort);
		while(! this.isClosed()){
			(new Thread(this)).start();
		}	
	}

	public static void main(String[] args) {
		while (Param.numPort <= 65535){
		try {
			MonServeur ms = new MonServeur(Param.numPort);
			Socket client = ms.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Param.numPort++;
		}
		}
	}

	@Override
	public void run() {
		try {
			tabClient.add(this.accept());
			System.out.println("le serveur a recu un client");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
