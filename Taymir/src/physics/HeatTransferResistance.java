/**
 * 
 */
package physics;

/**
 * ����� �������� ������������� ����������� ����. ������� ��������� � �*�*����.
 * �������/��
 * 
 * @author �����
 * 
 */
public class HeatTransferResistance extends SimplePhysicsValue {

	/**
	 * @param value
	 *            �������� ������������� ����������� ���� �������� � �*�*����.
	 *            �������/��
	 */
	public HeatTransferResistance(double value) {
		super(value);
	}

	/**
	 * �������� ������� �������� ������������� ����������� ���� ����� ��������
	 * ������� ���� � �������� ������������ ������������� ����� ����
	 * 
	 * @param heatTransferMaterialFactor
	 *            ����������� ������������ ������������� ���� ���������
	 * @param thickness
	 *            ������� ����
	 * @return ������ �������� ������������� ����������� ����
	 */
	public static HeatTransferResistance createByHeatTransferMaterialFactor(
			HeatTransferMaterialFactor heatTransferMaterialFactor,
			Length thickness) {
		return new HeatTransferResistance(thickness.getValue()
				/ heatTransferMaterialFactor.getValue());
	}

	/**
	 * �������� ������� �������� ������������� ����������� ���� ����� ��������
	 * ������������ ������������� ������������� �����������
	 * 
	 * @param heatTransferSurfaceFactor
	 *            ����� �������� ������������ ������������� �������������
	 *            �����������
	 * @return ������ �������� ������������� ����������� ����
	 */
	public static HeatTransferResistance createByHeatTransferSurfaceFactor(
			HeatTransferSurfaceFactor heatTransferSurfaceFactor) {
		return new HeatTransferResistance(
				1 / heatTransferSurfaceFactor.getValue());
	}

}
