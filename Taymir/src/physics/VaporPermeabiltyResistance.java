/**
 * 
 */
package physics;


/** Класс значения сопротивления паропроницанию. Измеряется в м*м*сек*Па/кг
 * @author Малик
 *
 */
public class VaporPermeabiltyResistance extends SimplePhysicsValue{
	public VaporPermeabiltyResistance(double value) {
		super(value);
	}



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
	
	
	
	/**Метод создающий объект значения сопротивления паропроницанию.
	 * @param vaporPermeabiltyMaterialFactor коэффициент паропроницания
	 * @param thickness толщина слоя материи
	 * @return
	 */
	public static VaporPermeabiltyResistance createByVaporPermeabiltyMaterialFactor(VaporPermeabiltyMaterialFactor vaporPermeabiltyMaterialFactor, Length thickness){
		return new VaporPermeabiltyResistance(thickness.getValue()/vaporPermeabiltyMaterialFactor.getValue());
	}

}
