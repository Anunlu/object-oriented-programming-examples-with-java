package HW;
import java.util.*;
public class GeometricObject {
	String color="white";
	boolean filled;
	Date dateCreated;
	public GeometricObject() {
		Date date = new Date();
		dateCreated=date;
	}
	public GeometricObject(String color,boolean filled) {
		Date date=new Date(); 
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public boolean getFilled() {
		return filled;
	}
	public Date getDate() {
		return dateCreated;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public String toString() {
		return "GEOMETRIC OBJECT CLASS: created on " +getDate()+"\ncolor: "+getColor()+" and filled: "+getFilled();
		
	}
}
