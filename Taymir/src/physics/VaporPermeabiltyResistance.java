/**
 * 
 */
package physics;


/** ����� �������� ������������� ��������������. ���������� � �*�*���*��/��
 * @author �����
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
	
	
	
	/**����� ��������� ������ �������� ������������� ��������������.
	 * @param vaporPermeabiltyMaterialFactor ����������� ��������������
	 * @param thickness ������� ���� �������
	 * @return
	 */
	public static VaporPermeabiltyResistance createByVaporPermeabiltyMaterialFactor(VaporPermeabiltyMaterialFactor vaporPermeabiltyMaterialFactor, Length thickness){
		return new VaporPermeabiltyResistance(thickness.getValue()/vaporPermeabiltyMaterialFactor.getValue());
	}

}
