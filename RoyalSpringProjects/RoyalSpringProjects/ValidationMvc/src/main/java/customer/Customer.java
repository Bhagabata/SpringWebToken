package customer;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	
	@NotBlank(message = "*Required")
	private String custFname;
	
	@NotBlank(message = "*Required")
	@Size(message = "Minimum 10 chars in the name")
	private String custLname;
	
	@Pattern(regexp = "^[1-9][0-9]{6}$", message = "address code is not valid")
	private String addressCode;
	
	@Pattern(regexp = "[`~,.<>;':\"/[\\/]|{}()=_+-]", message = "Address code should not contain special characters")
	private String location;
	
	@Min(value = 200, message = "Minimum of 200")
	@Max(value = 20000, message = "Maximum of 20000")
	private int salesqty;
	
	@Min(value = 2000000, message = "Shall be least 2000000")
	private double totalAmount;
	
	@AssertFalse(message = "Targent not achevied")
	private boolean targetAchived;
	
	public String getCustFname() {
		return custFname;
	}
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}
	public String getCustLname() {
		return custLname;
	}
	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}
	public String getAddressCode() {
		return addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalesqty() {
		return salesqty;
	}
	public void setSalesqty(int salesqty) {
		this.salesqty = salesqty;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean isTargetAchived() {
		return targetAchived;
	}
	public void setTargetAchived(boolean targetAchived) {
		this.targetAchived = targetAchived;
	}

}
