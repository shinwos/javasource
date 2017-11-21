package access_modify;

public class p_267 {
 
	private int speed;
	private boolean stop;
	
	public int getspeed() {
		return speed;}
    public void setspeed(int speed) {
    	if(speed<0) {
    		this.speed=0;
    		return;
    	}else {
    		this.speed=speed;
    	}
    }
  
public boolean isstop() {
	return stop;
	
}
 public void setstop(boolean stop) {
	 this.stop =stop;
	 this.speed=0;
 }
}
