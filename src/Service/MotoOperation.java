package Service;
import Model.*;
/*
 * import Model.Car;
 */
//import Model.Bus;
/**
 * 操作类
 * @author optimistic cheerful
 *
 */
public class MotoOperation {
	public MotoVehicle motos[] = new MotoVehicle[8];//定义车辆数组
	
	public void init() {
		motos[0] = new Car("京NY91880", "宝马", "X6", 800);
		motos[1] = new Car("京NY91880", "宝马", "X6", 800);
		motos[2] = new Car("京NY91880", "宝马", "X6", 800);
		motos[3] = new Car("京NY91880", "宝马", "X6", 800);
		
		motos[4] = new Bus("京NY91880", "金龙", 16, 800);
		motos[5] = new Bus("京NY91880", "宝马", 34, 800);
		motos[6] = new Bus("京NY91880", "宝马", 16, 800);
		motos[7] = new Bus("京NY91880", "宝马", 34, 800);

	}
	//租赁汽车方法
	public MotoVehicle motoLeaseOut(String brand, String type, int seat) {
		MotoVehicle moto = null;
		for(MotoVehicle myMoto : motos) {
			if(myMoto instanceof Car){
				//判断当前对象属于哪一个类
				Car car = (Car)myMoto;
				if(car.getBrand().equals(brand)&&car.getType().equals(type)) {
					moto = car;
					break;
				}
			}else {
				Bus bus = (Bus)myMoto;
				if(bus.getBrand().equals(brand)&&bus.getSeatCount() == seat) {
					moto = bus;
					break;
				}
			}
		}
		return moto;
	}
}
