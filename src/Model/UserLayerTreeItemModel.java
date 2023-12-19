package Model;

import java.util.Map;
import java.util.HashMap;
import ModelContextMenu.ContextMenuModel;
import ModelContextMenu.GoogleMapContextMenu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

public class UserLayerTreeItemModel extends TreeItem<String>{
	
	String[] dummyLayerNames = { "nejo", "duru", "life" };
	
	ObservableList<TreeItem<String>> layerItems = FXCollections.observableArrayList();

//	ContextMenuModel childLayerContextMenu;
	
	public UserLayerTreeItemModel() {
		TreeItem<String> childItem_Layer;
		
		for(String childLayer_Name: dummyLayerNames) {
			childItem_Layer = new TreeItem<String>(childLayer_Name);
			layerItems.add(childItem_Layer);
		}
		
		this.setValue("KULLANICI KATMANLARI");
		this.getChildren().addAll(layerItems);
		this.setExpanded(true);
	}
	
}
