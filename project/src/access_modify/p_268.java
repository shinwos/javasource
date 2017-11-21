package access_modify;

public class p_268 {
 public static void main(String[] args) {
	 p_267 mycar = new p_267();
	 
	 mycar.setspeed(-50);
	 System.out.println("현재속도:"+mycar.getspeed());
	 
	 mycar.setspeed(60);
	 if(!mycar.isstop()) {
		 mycar.setstop(true);
		 
		 System.out.println("현재속도 :"+mycar.getspeed());
		 
	 }
	 
 }
}
