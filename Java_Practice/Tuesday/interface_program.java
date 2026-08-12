package Java_Practice.Tuesday;

interface car{
 void speed();
 void breaks();
}
interface tata extends car{
 void quality();
 void price();
}
interface tata_nano extends tata{
 void budget();
}
interface diesel extends tata_nano{
 void density();
}
interface petrol extends tata_nano{
 void spark();
}
interface ev extends tata_nano{
 void Li_battery();
}

class owner implements diesel,petrol,ev{
 public void density(){
  System.out.println("high");
 }
 public void spark() {
  System.out.println("flame");
 }
 public void Li_battery() {
  System.out.println("5 years");
 }
 public void budget() {
  System.out.println("700000");
 }
 public void quality() {
  System.out.println("high quality(A)");
 }
 public void price() {
  System.out.println("price low");
 }
 public void speed() {
  System.out.println("220 km/hr");
 }
 public void breaks() {
  System.out.println("front break");
 }
}
public class interface_program {
    public static void main(String[] args) {
    owner r = new owner();
    r.density();
    r.breaks();
    r.budget();
    r.Li_battery();
    r.price();
    r.quality();
    r.spark();
    r.speed();
   }
}
