package capability4;


public class Employee {
	private int id;
	private String name;
	private String designation;
	private String department;
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setname(String name) {
	
		
			this.name= name;	
		}
		
     public String getname() {
    	 return name;
     }
     public void setdesignation(String designation) {
    
    		 this.designation=designation;
    	}
    	 public String getdesignation() {
    		 return designation;
    	 }
    	 public void setdepartment(String department) {
    		
    			 this.department=department;
    		 }
    		 public String getdepartment() {
    			 return department;
    		 }
    		 Employee(int id,String name,String designation,String department){
    			 this.id=id;
    			 this.name=name;
    			 this.designation=designation;
    			 this.department=department;
    		 }
    	 
     }
	


