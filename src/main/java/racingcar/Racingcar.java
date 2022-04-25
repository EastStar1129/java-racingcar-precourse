package racingcar;

import java.util.ArrayList;
import java.util.List;

import racingcar.exception.CustomIllegalArgumentException;
import racingcar.model.Car;
import racingcar.model.Cars;

public class Racingcar {
	public static final String INPUT_NAMES_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String NAME_REGEX = ",";
	public static final int INIT_POSITION = 0;
	
	private Cars cars;
	
	public boolean initCars(String names) {
		try {
			cars = new Cars(arrayToList(names));
	    	return true;
		}catch (CustomIllegalArgumentException e) {
			System.out.println(e.getMessage());
			return false;
		}
    }
	
	private List<Car> arrayToList(String names){
		List<Car> list = new ArrayList<Car>();
    	for(String value : names.split(NAME_REGEX, -1)) {
    		list.add(new Car(value, INIT_POSITION));
    	}
    	return list;
	}
}
