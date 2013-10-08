/**
 * 
 */
package physics;

import utils.SimpleValue;

/**Абстрактный класс простейшей физической величины. 
 * @author Малик
 *
 */
public abstract class SimplePhysicsValue implements SimpleValue<Double> {
	private double value;
	
	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	@Override
	public Double setValue(Double value) {
		this.value = value;
		return this.value;
	}

	/**
	 * @param value
	 */
	public SimplePhysicsValue(double value) {
		this.value = value;
	}
	
	
}
