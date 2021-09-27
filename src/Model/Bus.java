package Model;
/**
 * 客车
 * @author optimistic cheerful
 *
 */
public class Bus extends MotoVehicle{
	private int seatCount;//

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	public Bus() {
		
	}
	
	public Bus(String vehicle, String brand, int seatCount, int perRent) {
		super(vehicle, brand, perRent);
		this.seatCount = seatCount;
	}
	
	/*
	 *重写计算租金 
	 * 
	 */
		@Override
		public float calRent(int days) {
			float price = this.getPerRent();
			if(days>=3&&days<7) {
				price *= 0.9f;
			}else if(days>=7&&days<=30){
				price *= 0.8f;
			}else if(days<150&&days>=30) {
				price *= 0.7f;
			}else if(days>=150) {
				price *= 0.6f;
			}
			return price*days;
		}
}
