import java.util.List;

public abstract class AbstractTreeNode implements TreeNode {
	int id;
	
	@Override
	public TreeNode getRoot() {
		// TODO Auto-generated method stub
		if (this.getParent() == null)
			return this;
		return this.getParent().getRoot();
			
	}
	
	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		if (this.isLeaf()) return 0;
		List<TreeNode> children = this.getChildren();
		int depth = 0;
		for (TreeNode node:children) {
			int currentDepth = node.getDepth();
			if (currentDepth>depth)
				depth = currentDepth;
		}
		return depth+1;
	}
	
	
	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		return this.getParent() == null;
	}
	
	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return this.getChildren().size()==0;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
