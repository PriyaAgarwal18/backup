package capability4;

public class Bank {

	int custid;
	String custname;
	String custaddress;
	String acttype;
	double custbalance;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getActtype() {
		return acttype;
	}
	public void setActtype(String acttype) {
		this.acttype = acttype;
	}
	public double getCustbalance() {
		return custbalance;
	}
	public void setCustbalance(double custbalance) {
		this.custbalance = custbalance;
	}
	Bank(int custid,String custname,String custaddress){
		this.custid=custid;
		this.custname=custname;
		this.custaddress=custaddress;
	}
	Bank(int custid,String custname){
		this.custid=custid;
		this.custname=custname;
		
	}
	Bank(int custid,String custname,String custaddress,String acttype,Double custbalance){
		this.custid=custid;
		this.custname=custname;
		this.custaddress=custaddress;
		this.acttype=acttype;
		this.custbalance=custbalance;
	}
}
