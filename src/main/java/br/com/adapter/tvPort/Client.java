package br.com.adapter.tvPort;

import br.com.adapter.tvPort.devices.Computer;
import br.com.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		


		System.out.println("------ Monitor Class Adapter ----------");
		

	}
}
