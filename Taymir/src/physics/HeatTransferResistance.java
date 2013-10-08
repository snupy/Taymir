/**
 * 
 */
package physics;

/**
 * Класс значения сопротивления теплоперачи слоя. Единица измерения — м*м*град.
 * цельсия/Вт
 * 
 * @author Малик
 * 
 */
public class HeatTransferResistance extends SimplePhysicsValue {

	/**
	 * @param value
	 *            значение сопротивления теплоперачи слоя материал в м*м*град.
	 *            цельсия/Вт
	 */
	public HeatTransferResistance(double value) {
		super(value);
	}

	/**
	 * Создание объекта значения сопротивления теплоперачи слоя через значение
	 * толщины слоя и значение коэффициента сопротивления этого слоя
	 * 
	 * @param heatTransferMaterialFactor
	 *            коэффициент сопртивления теплопередачи слоя материала
	 * @param thickness
	 *            толщина слоя
	 * @return объект значения сопротивления теплоперачи слоя
	 */
	public static HeatTransferResistance createByHeatTransferMaterialFactor(
			HeatTransferMaterialFactor heatTransferMaterialFactor,
			Length thickness) {
		return new HeatTransferResistance(thickness.getValue()
				/ heatTransferMaterialFactor.getValue());
	}

	/**
	 * Создание объекта значения сопротивления теплоперачи слоя через значение
	 * коэффициента сопротивления теплопередачи поверхности
	 * 
	 * @param heatTransferSurfaceFactor
	 *            объет значения коэффициента сопротивления теплопередачи
	 *            поверхности
	 * @return объект значения сопротивления теплоперачи слоя
	 */
	public static HeatTransferResistance createByHeatTransferSurfaceFactor(
			HeatTransferSurfaceFactor heatTransferSurfaceFactor) {
		return new HeatTransferResistance(
				1 / heatTransferSurfaceFactor.getValue());
	}

}
