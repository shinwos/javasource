package problem;

public abstract class Tv {
 String logo = "Made in";
 
 Tv(String country){
	 this.logo(country);
 }
 
 public abstract void logo(String country);

 abstract void gotoPrevChannel();
}
