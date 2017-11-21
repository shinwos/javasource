package tv_package;

public class LG_tv extends TV{
	String panel = "OLED";
 public LG_tv(String maker,String tvSize,
		 String tvType,String quality) {
	 super(maker, tvSize,tvType,quality);
	 maker = "LG";
	 
	@Override 
	public int volumeUp(int upCount) {
	 if(this.power == true) {
		 volumeUp();
	 }
	}

 }
}
