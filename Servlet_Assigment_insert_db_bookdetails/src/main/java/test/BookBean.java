package test;
import java.io.*;
@SuppressWarnings("serial")
public class BookBean implements Serializable{
	private String bcode,bname,bauthour;
	private float price;
	private int bqty;
	public BookBean()
	{
		
	}
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthour() {
		return bauthour;
	}
	public void setBauthour(String bauthour) {
		this.bauthour = bauthour;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getBqty() {
		return bqty;
	}
	public void setBqty(int bqty) {
		this.bqty = bqty;
	}

}
