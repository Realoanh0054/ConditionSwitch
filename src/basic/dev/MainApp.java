package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BAI10.3
		System.out.println("Nhap vao thang trong nam:");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch (n) {
			case 1, 3 , 5, 7, 8, 10, 12: 			
				System.out.println("Thang co 31 ngay");
				break;
			case 4, 6, 9, 11: 
				System.out.println("Thang co 30 ngay");
				break;
			case 2: 			
				System.out.println("Thang co 28 ngay");
				break;
			default:
					System.out.println("Thang nhap vao khong dung");
			}
		
			System.out.println("ket thuc chuong trinh");
			System.out.println("-----------------------------------");
			//BAI10.1
			System.out.println("Nhap so a = ");
			int a;
			a = sc.nextInt();
			if (a >= 0) {
				switch (a) {
				case 0: {					
					System.out.println("So 0");
					break;
				}
				default:
					System.out.println("a la so nguyen duong ");
				}
			}
			else if (a < 0) System.out.println(" so nguyen am");
			System.out.println("Ket thuc chuong trinh.");
			System.out.println("-----------------------------------");
			//BAI10.2
			int number;
			number = sc.nextInt();
			
			int x = number % 3;
			int y = number % 5;
			
			switch (x) {
			case 0: {
				switch (y) {
				case 0: {
					
					System.out.println("chia het cho 3 va 5");
					break;
				}
				default:
					System.out.println("chia het cho 3");
					break;
				}
				break;
			}
			default:
				switch (y) {
				case 0: {
					
					System.out.println("chia het cho 5");
					break;
				}
				default:
					System.out.println("khong chia het cho 5");
					break;
				}
			}
			System.out.println("Ket thuc chuong trinh.");
			System.out.println("----------------------------------");
			// Viet ptr giai ptr bac 2
		    System.out.println("nhap cac he so cua ptr bac 2: ");
		    
		    System.out.println("Nhap va he so a = ");
		    int ax2 = sc.nextInt();
		    
		    System.out.println("Nhap vao he so b = ");
		    int bx = sc.nextInt();
		    
		    System.out.println("Nhap vao he so c = ");
		    int c0 = sc.nextInt();
		    
		    if((ax2 == 0) && (bx == 0) && (c0 == 0)) {
		    	System.out.println("ptrinh co vo so nghiem");
		    }
		    
		    if((ax2 == 0) && (bx == 0) && (c0 != 0)) {
		    	System.out.println("Phuong trinh vo nghiem");
		    }
		    
		    if((ax2 == 0) && (bx != 0)) {
		    	System.out.println("Phuong trinh co 1 nghiem duy nhat: " + (float) (-c0/bx));
		    }
		    
		    float denTa = bx * bx - 4 * ax2 * c0;
		    
		    if(denTa > 0) {
		    	
		    System.out.println("nghiem cua ptrinh la:");
		    System.out.println("x1 = " + (float) ((-bx + Math.sqrt(denTa))/(2 * ax2)));
		    System.out.println("x2 = " + (float) ((-bx - Math.sqrt(denTa))/(2 * ax2)));
		    
		    }else {  if(denTa == 0 ) {
		    			System.out.println("phuong trinh co nghiem kep x1 = x2 = " +(float) + (-bx)/(2 * ax2));
		    		  }else {
		    			  System.out.println("Ptrinh vo nghiem");
		    		  }
		    
		    }
		    
		    //Kiem tra 3 canh cua tam giac
		    System.out.println("Nhap vao canh thu nhat cua tam giac: ");
		    float canh1 = sc.nextFloat();
		    
		    System.out.println("Nhap vao canh thu hai cua tam giac");
		    float canh2 = sc.nextFloat();
		    
		    System.out.println("Nhap vao canh thu ba cua tam giac");
		    float canh3 = sc.nextFloat();
		    
		    if((canh1 + canh2>canh3) || (canh2 + canh3 > canh1) || (canh1 + canh3 > canh2)){
		    	System.out.println("ba canh da nhap la ba canh cua tam giac");
		    }		else {
		    		System.out.println("Ba canh da nhap ko phai la ba canh cua tam giac");
		    		}
						
		}
		
	}

 
