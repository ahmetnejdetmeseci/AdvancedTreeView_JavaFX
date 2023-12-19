package Controller;

import ControllerContextMenu.ContextMenuController;
import Model.TreeItemModel;
import ModelContextMenu.ContextMenuModel;
import View.TreeViewLayerView;
import ViewContextMenu.ContextMenuView;
import javafx.scene.input.MouseButton;

public class TreeViewController {
    private TreeItemModel model;
    private TreeViewLayerView view;

    
    public TreeViewController(TreeItemModel model, TreeViewLayerView view) {
        this.model = model;
        this.view = view;
        
        view.updateTreeViewTreeCell(this.model.getTreeView());
        view.getChildren().add(model);
         
    }

    

	


	public TreeViewLayerView getView() {
        return view;
    }
    
    
}
