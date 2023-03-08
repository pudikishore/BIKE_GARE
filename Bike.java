public class Bike{
private int gear;

public void setGear(int gear)throws IllegalArgumentException {
if (gear <0 || gear >5) 
     throw new  IllegalArgumentException
                       ("invaid gear :gear must be in between(0-5)");
if (gear==0) throw new IllegalArgumentException ("bike is in nutral");
if (gear==1) throw new IllegalArgumentException ("bike is in Speed :20");
if (gear==2) throw new IllegalArgumentException ("bike is in Speed :40");
if (gear==3) throw new IllegalArgumentException ("bike is in Speed :60");
if (gear==4) throw new IllegalArgumentException ("bike is in Speed :80");
if (gear==5) throw new IllegalArgumentException ("bike is in Speed :100");


}
public int getGear() {
return gear;
}
}


	