/**
 * 
 */
package logic;

import java.util.ArrayList;

/** ����� �����
 * @author �����
 *
 */
public class Wall {

	private ArrayList<MaterialLayer> materialLayers;
	public Wall() {
		materialLayers = new ArrayList<MaterialLayer>();
	}
	public Wall(ArrayList<MaterialLayer> materialLayers){
		materialLayers = this.materialLayers;
	}

}
