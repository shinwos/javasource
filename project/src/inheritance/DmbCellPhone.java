package inheritance;

public class DmbCellPhone extends Cellphone{
 int channel;
 
 DmbCellPhone(String model, String color, int channel){
	 this.model=model;
	 this.color=color;
	 this.channel=channel;
	  }
  void turnOnDmb() {
	  System.out.println("ä��"+channel +"�� BMB ��� ������ �����մϴ�.");
	  
  }
  void changeChannelDmb(int channel) {
	  this.channel=channel;
	  System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
  }
  void turnOffDmb() {
	  System.out.println("DMB��ۼ����� ����ϴ�.");
  }
}