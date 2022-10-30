package week1.day1;

public class Mobile{
	public void makecall() {
		String mobileModel="appo";
		float mobileWeight=175.3f;
	   System.out.println("To Make Call");
	}
	public void sendmsg() {
		boolean FullCharged=true;
		int mobilecost=180000;	
	System.out.println("To send Message");
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile ();
	    obj.makecall();
	    obj.sendmsg();
		System.out.println("This is my mobile");
	}
}



