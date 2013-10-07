/**
 * 
 */
package fiziki;

import utils.SimpleValue;

/**
 * Класс давления. Хранит значения в Паскалях
 * 
 * @author Малик
 * 
 */
public class Pressure implements SimpleValue<Double> {

	private double value;

	@Override
	public Double getValue() {
		return value;
	}

	@Override
	public Double setValue(Double value) {
		this.value = value;
		return this.value;
	}

	/**Создается объект давления
	 * @param value значение давления в Паскалях
	 */
	public Pressure(double value) {
		this.value = value;
	}
	
	

}
