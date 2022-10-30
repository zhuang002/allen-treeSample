import java.util.ArrayList;
import java.util.List;

public class ArrayNode extends AbstractTreeNode implements TreeNode {
	static final int nodeSize = 100;
	static int[][] arr = new int[nodeSize][nodeSize];
	static ArrayList<TreeNode> allNodes = null;
	int id;
	
	public ArrayNode(int id) {
		this.id = id;
		if (allNodes==null) {
			allNodes = new ArrayList<>();
			for (int i=0;i<nodeSize;i++) {
				allNodes.add(null);
			}
		}
		allNodes.set(id, this);
	}

	
	

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		for (int i=0;i<this.arr.length;i++) {
			if (arr[i][this.id] == 1) {
				return this.allNodes.get(i);
			}
		}
		return null;
	}

	@Override
	public void setParent(TreeNode node) {
		// TODO Auto-generated method stub
		this.arr[node.getId()][this.id] = 1;
	}

	@Override
	public List<TreeNode> getChildren() {
		// TODO Auto-generated method stub
		List<TreeNode> list = new ArrayList<>();
		for (int i=0;i<allNodes.size();i++) {
			if (arr[this.id][i]==1)
				list.add(allNodes.get(i));
		}
		return list;
	}

	

	

	@Override
	public void addChild(TreeNode node) {
		// TODO Auto-generated method stub
		TreeNode parent = node.getParent();
		if (parent!=null) parent.removeChild(node);
		arr[this.id][node.getDepth()] = 1;
		
	}

	@Override
	public void removeChild(TreeNode node) {
		// TODO Auto-generated method stub
		arr[this.id][node.getDepth()] = 0;
			
	}

	@Override
	public void clearChildren() {
		// TODO Auto-generated method stub
		for (int i=0;i<allNodes.size();i++) {
			arr[this.id][i] = 0;
		}
	}

	
	
}
