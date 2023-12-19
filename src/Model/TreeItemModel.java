package Model;

import java.util.HashMap;
import java.util.Map;

import Controller.TreeViewHandlers;
import ModelContextMenu.ContextMenuModel;
import ModelContextMenu.UserLayerContextMenuModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class TreeItemModel extends TreeView<String>{
	
	String[] treeViewItemNames = { "YUKSEKLIK HARITALARI", "SIB HARITALARI", "GOOGLE HARITALAR", "YANDEX HARITALAR", "BING HARITALAR", "OVIHERE HARITALAR", "RASTER HARITALAR",
			"DENIZ HARITALARI", "VEKTOR HATIRALAR", "YUKSEKLIK ANALIZLERI"};

	ObservableList<TreeItem<String>> mainLayers = FXCollections.observableArrayList();
	
	private Map<TreeItem<String>, ContextMenuModel> contextMenuTreeItemMap = new HashMap<>();
	
    private TreeItem<String> root;

    public TreeItemModel() {
    	
        root = new TreeItem<>("Root");
        init_TreeViewRootItem();
        this.setRoot(root);
        this.setShowRoot(false);
        
        this.setPrefWidth(500);
        this.setPrefHeight(600);

    }
    
    private void init_TreeViewRootItem() {
    	TreeItem<String> childLayer;
    	
    	for(String childLayer_Name: treeViewItemNames) {
    		
			childLayer = new TreeItem<String>(childLayer_Name);
			childLayer.setExpanded(true);
			mainLayers.add(childLayer);
		
    	}

    	mainLayers.add(new UserLayerTreeItemModel());
    	mainLayers.add(new ProjectLayerTreeItemModel());
    	
		root.getChildren().addAll(mainLayers);
		root.setExpanded(true);
    }
    
    private void assignContextMenuToItems() {
    	
    	
    	
    }
    
    public TreeView<String> getTreeView(){
    	return this;
    }
}
