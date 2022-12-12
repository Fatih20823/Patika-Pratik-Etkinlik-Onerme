package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sicaklik Giriniz :");
		heat = input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak Yapabilirsiniz");
		}
		if(heat>=5 && heat<10) {
			System.out.println("Sinema izleyebilirsiniz");
		}
		if(heat>=10 && heat<15) {
			System.out.println("Sinema izleyebilir Yada piknige gideblirsiniz");
		}
		if(heat>=15 && heat<25) {
			System.out.println("Piknige Gidebilirsiniz");
		}
		if(heat>=25) {
			System.out.println("Yuzmeye Gidebilirsiniz");
		}
	}
}
