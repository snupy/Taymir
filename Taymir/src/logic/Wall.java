/**
 * 
 */
package logic;

import java.util.ArrayList;

/** Класс стены
 * @author Малик
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
