package week2day2;

public class Missingnumbersinarray {

	public static void main(String[] args) {
            int a[]= {1,2,3,4,5,7,8};
            int sum=0;
            for(int i=0;i<a.length;i++) {
            	sum=sum+a[i];
            }
            System.out.println("Print sum"  +sum);
            	int sum1=0;
            	for(int j=1;j<=8;j++) {
            		sum1=sum1+j;
            	}
            	System.out.println("Print sum1" +sum1);
            	
            	System.out.println("missing number"	+(sum1-sum));
            }

	}


