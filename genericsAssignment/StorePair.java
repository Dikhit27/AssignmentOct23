package genericsAssignment;

import java.util.Date;

class Pair {

	private String key;

	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void display() {
		System.out.println(getKey() + "   " + getValue());
	}

}

class Pair1 {

	private String key;
	private Date date;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}


public class StorePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p = new Pair();

		p.setKey("Dikhit");
		p.setValue("Gogoi");

		p.display();

		p.setKey("Gayatri");
		p.setValue("Gogoi");

		p.display();
		
		
		Pair1 pair = new Pair1();
		
		pair.setKey("Todat is : ");
		pair.setDate(new java.util.Date());
		
		System.out.println(pair.getKey()+"  "+pair.getDate());

	}

}
