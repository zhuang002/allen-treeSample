import java.util.ArrayList;
import java.util.List;

public class Node extends AbstractTreeNode implements TreeNode {
	int id;
	TreeNode parent=null;
	ArrayList<TreeNode> children = new ArrayList<>();
	
	public Node(int id) {
		this.id = id;
	}


	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	@Override
	public List<TreeNode> getChildren() {
		// TODO Auto-generated method stub
		return this.children;
	}

	

	

	@Override
	public void addChild(TreeNode node) {
		// TODO Auto-generated method stub
		TreeNode parent = node.getParent();
		if (parent!=null)
			parent.removeChild(node);
		this.children.add(node);
		node.setParent(this);
	}

	@Override
	public void removeChild(TreeNode node) {
		// TODO Auto-generated method stub
		this.children.remove(node);
		node.setParent(null);
		
	}

	@Override
	public void clearChildren() {
		// TODO Auto-generated method stub
		this.children.clear();
	}

	@Override
	public void setParent(TreeNode node) {
		// TODO Auto-generated method stub
		this.parent = node;
	}

	
	
}
