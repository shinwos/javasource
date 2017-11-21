package tv_package;

public class TV {
//field
	boolean power=false;
	public boolean mute;
	int volume;
	public int preVolume;
	public int channel;

	 String maker;
      String tvSize;
      String tvType;
	 String quality;
	final String design_date = "20171115";

//constructor
	
		
 TV(String maker,String tvSize,String tvType,String quality)
 {//초기화
		//super();
		this.maker=maker;
		this.tvSize=tvSize;
		this.tvType=tvType;
		this.quality=quality;
		}
 
 public TV(){
		this.mute = false;
		this.volume =5;
		this.channel = 7;//kbs2
	}
//method
 public void powerOn() {
    this.power=true;
    System.out.println("TV Power ON");}
 void powerOff(){
	    this.power=false;
	System.out.println("TV Power OFF");}
 
 public int volumeUP() {
	 if(power==true) {
	 this.volume++;
	 }System.out.println("volumUp");
	 return volume;
	 }
 
 
public int volumeUP(int upCount) {
	 if(power==true) {
	volume=volume +upCount;
	 
	 }System.out.println("volumUp("+upCount+")");
	 return volume;
	 }
 
 int volumeDown() {
	 if(power==true) {
		 this.volume--;
		 
		 }
	 return volume;
	 }
 
 int channelUp() {
	 if(power==true) {
      this.channel++;
	 }
	 
	 return channel;
 }
 
 int channeldown() {
	 if(power==true) {
	 this.channel--;
	 }
	 return channel;
 }
 
 public int choiceChannel(int futurecha) {
	 int dif=0;
	 if((futurecha-channel)>0) {
		 dif = futurecha-channel;
		 for(int i=0;i<dif;i++) {
			 channelUp();
		 }System.out.println(futurecha +"번 입니다.");
	 }else if ((futurecha-channel)<0) {
		 dif = channel-futurecha;
		 for (int i=0;i<dif;i++) {
			 channeldown();
		 }System.out.println(futurecha="번 입니다.");
	 }
	 return this.channel;
 }
 
 
		 
	 }
 

 
 





