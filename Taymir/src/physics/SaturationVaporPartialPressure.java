package physics;

/**
 * Класс насыщенного парциального давления. Хранит значения в паскалях.
 * 
 * @author Малик
 * 
 */
public class SaturationVaporPartialPressure extends VaporPartialPressure {

	/**
	 * @param value
	 *            значение насыщенного паруиаольного давления в Паскалях.
	 */
	public SaturationVaporPartialPressure(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Метод создает объект значения насыщенного парциального давления по
	 * значениям относительной влажности и насыщенного парциаольного давления
	 * 
	 * @param relativeHumidity
	 *            относительная влажность
	 * @param saturationVaporPartialPressure
	 *            насыщенное парциальное давление
	 * @return
	 */
	public static SaturationVaporPartialPressure CreateByRelativeHumidity(
			RelativeHumidity relativeHumidity,
			SaturationVaporPartialPressure saturationVaporPartialPressure) {
		return new SaturationVaporPartialPressure(relativeHumidity.getValue()
				* saturationVaporPartialPressure.getValue());
	}

}
