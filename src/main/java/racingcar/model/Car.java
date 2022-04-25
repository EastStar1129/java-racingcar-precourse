package racingcar.model;

public class Car{
	private Name name;
	private Position position; 
	
	public Car(String name,int position) {
		this.name = new Name(name);
		this.position = new Position(position);
	}
	
	public void move(CarStatus carStatus) {
		position.move(carStatus);
	}

	public String getName() {
		return name.getName();
	}

	public int getPosition() {
		return position.getPosition();
	}
}