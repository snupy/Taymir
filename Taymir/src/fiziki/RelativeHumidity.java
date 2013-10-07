/**
 * 
 */
package fiziki;

import utils.SimpleValue;

/**
 * Класс относительной влажности. Единица измерения - нет. 0 соответсвует 0%, 1
 * соотвествует 100%
 * 
 * @author Малик
 * 
 */
public class RelativeHumidity implements SimpleValue<Double> {
	private double value;

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public Double setValue(Double value) {
		this.value = value;
		return this.value;
	}

	/**
	 * @param value
	 */
	public RelativeHumidity(double value) {
		this.value = value;
	}

	/**
	 * Метод создания объекта значения относительной влажности через парциальные
	 * давления водяного пара.
	 * 
	 * @param vaporPartialPressure
	 *            парциальное давление водяного пара
	 * @param saturationVaporPartialPressure
	 *            нарциальное давления насыщенног водяного пара
	 * @return
	 */
	public static RelativeHumidity CreateByVaporPartialPressure(
			VaporPartialPressure vaporPartialPressure,
			SaturationVaporPartialPressure saturationVaporPartialPressure) {
		return new RelativeHumidity(vaporPartialPressure.getValue()
				/ saturationVaporPartialPressure.getValue());
	}
}
