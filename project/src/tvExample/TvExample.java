package tvExample;

import tv_package.*;

public class TvExample {
 public static void main(String[]args) {
	 TV tv= new TV("Samsung",
			 "60inch","stand type"
			 		, "UHD");
	 tv.volumeUP(10);
	 
	 
	 LG_tv lg_tv= new LG_tv("Samsung",
			 "60inch","stand type"
		 		, "UHD");
	 Samsung_tv samsung_tv= new Samsung_tv("Samsung",
			 "60inch","stand type"
		 		, "UHD");
	 
 }
}
