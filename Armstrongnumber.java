package week2day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		int num=153;
		int cube=0;
		int r;
		int temp;
		temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(temp==cube) {
				System.out.println("Number is Armstrong number");
		}
		else {
			System.out.println("Number is not a Armstrong number			");		
			
			
		}

	}

}
