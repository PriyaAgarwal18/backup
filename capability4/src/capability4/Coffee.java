package capability4;

public class Coffee {
	private String name;
	private String mobile;
	private double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Coffee(String name, String mobile, double rating) {
		
		this.name = name;
		this.mobile = mobile;
		this.rating = rating;
	}
	
}
