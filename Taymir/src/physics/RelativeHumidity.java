/**
 * 
 */
package physics;

/**
 * Класс относительной влажности. Единица измерения - нет. 0 соответсвует 0%, 1
 * соотвествует 100%
 * 
 * @author Малик
 * 
 */
public class RelativeHumidity extends SimplePhysicsValue {
	/**
	 * @param value значение относительной влажности (0.0 равно 0% и 1.0 равно 100%)
	 */
	public RelativeHumidity(double value) {
		super(value);
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
