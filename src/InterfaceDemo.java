
public class InterfaceDemo {
	
	public static void callAutomobile(Automobile auto)
	{
		auto.engineType();
		auto.fuelType();
		auto.speed();
	}
	public static void main(String[] args) {
		callAutomobile(new TwoWeelar());
		System.out.println(Automobile.z);
		
		
		
	}

}


interface Automobile
{
	int z=9000;
	public void speed();
	public void engineType();
	public void fuelType();
}
interface Vehile
{
	void gear();
}

interface MixAuto extends Automobile,Vehile
{
	
}

class TwoWeelar implements Automobile
{

	@Override
	public void speed() {
		System.out.println("TwoWeelar.speed()");
		
	}

	@Override
	public void engineType() {
		System.out.println("TwoWeelar.engineType()");
		
	}

	@Override
	public void fuelType() {
		System.out.println("TwoWeelar.fuelType()");
		
	}
	
}
