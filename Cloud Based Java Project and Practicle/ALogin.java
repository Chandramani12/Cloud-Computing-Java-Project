package com.info.libraryProject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ALogin {

	public static void main(String args[]) {
		try {
			ServerSocket ss = new ServerSocket(8001);
			System.out.println("Chandramani server started...");
			Socket s = ss.accept();
			DataInputStream in = new DataInputStream(s.getInputStream());
			int x = in.readInt();
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			int y = x / 2;
			if (x == 1 || x == 2 || x == 3) {
				out.writeUTF(x + " is prime number");
				System.exit(0);
			}
			for (int i = 2; i <= y; i++) {
				if (x % i != 0) {
					out.writeUTF(x + " is prime number");
				} else {
					out.writeUTF(x + " is not prime number");
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
