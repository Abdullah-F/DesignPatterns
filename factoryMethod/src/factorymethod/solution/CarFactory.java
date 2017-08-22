package factorymethod.solution;

public class CarFactory extends TransportFactory{
	Transport create() {
		return new Car();
	}
}
