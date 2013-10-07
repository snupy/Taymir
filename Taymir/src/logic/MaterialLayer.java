package logic;

/**Класс слоя материала
 * @author Малик
 *
 */
public class MaterialLayer {
	private Material material;
	private double thickness;
	/**Создаен полноценный слой материала
	 * @param material материал, из которого состоит слой
	 * @param thickness толщина этого слоя
	 */
	public MaterialLayer(Material material, double thickness) {
		this.material = material;
		this.thickness = thickness;
	}

}
