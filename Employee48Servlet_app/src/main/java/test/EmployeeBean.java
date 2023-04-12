package test;
import java.io.*;
@SuppressWarnings("serial")


public class EmployeeBean implements Serializable {
	private String id,name,desgn;
	private int bsal;
	private float totSal;
	public EmployeeBean()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public int getBsal() {
		return bsal;
	}
	public void setBsal(int bsal) {
		this.bsal = bsal;
	}
	public float getTotSal() {
		return totSal;
	}
	public void setTotSal(float totSal) {
		this.totSal = totSal;
	}

}
