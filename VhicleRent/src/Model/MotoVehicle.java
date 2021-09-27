package Model;
/**
 * 租车父类
 * @author optimistic cheerful
 *
 */
public abstract class MotoVehicle {
	private String vehicledId;//
	private String brand;//
	private int perRent;//
	public String getVehicledId() {
		return vehicledId;
	}
	public void setVehicledId(String vehicledId) {
		this.vehicledId = vehicledId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
	
	public abstract float calRent(int days);
	
	public MotoVehicle() {
		
	}
	
	public MotoVehicle(String vehicleId, String brand, int perRent) {
		this.vehicledId = vehicleId;
		this.brand = brand;
		this.perRent = perRent;
	}
}