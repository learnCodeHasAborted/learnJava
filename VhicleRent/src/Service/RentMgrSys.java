package Service;
import Model.MotoVehicle;
import java.util.*;
import java.io.*;
/**
 * 汽车租赁管理类
 * @author optimistic cheerful
 *
 */
public class RentMgrSys {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		MotoOperation motoMgr = new MotoOperation();
		motoMgr.init();
		
		MotoVehicle moto = null;
		//System.out.print("1.jiaoche 2.keche");
		//System.out.print("请选择要租赁的汽车类型\n");
		//int motoType = input.nextInt();
		String brand = "";
		String type = "";
		int seat = 0;
		
		/*if(motoType==1) {
			System.out.print("Select brand :1.bieke 2.baoma");
			int choose2 = input.nextInt();
			if(choose2==1) {
				brand = "bieke";
				System.out.print("Select type: 1.lin 2.GL8");
				type = (input.nextInt()==1) ? "lin" : "GL8";
			}else if(choose2==2) {
				brand = "baoma";
				System.out.print("1.X6   2.550i");
				type = (input.nextInt()==1) ? "X6" : "550i";
			}
		}else if(motoType==2) {
			type = "";
			System.out.print("Select brand :1.jinlong 2.jinbei");
			brand = (input.nextInt()==1) ? "jinlong" : "jinbei";
			System.out.print("seat :1. 16   2.  34");
			seat = (input.nextInt()==1) ? 16 : 34;
		}
		*/
		moto = motoMgr.motoLeaseOut("宝马", "X6", seat);
		int per = moto.getPerRent();
		
		System.out.println(per);
		System.out.println("days:");
		int days = input.nextInt();
		float money = moto.calRent(days);
		System.out.println("pay:"+money);
		//System.out.print("您的车牌号是:"+moto.getVehicledId()+"您需要支付租金"+money+"元");
		input.close();
	}

}
