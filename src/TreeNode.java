import java.util.List;

public interface TreeNode {
	TreeNode getRoot();
	int getDepth();
	TreeNode getParent();
	void setParent(TreeNode node);
	List<TreeNode> getChildren();
	boolean isRoot();
	boolean isLeaf();
	void addChild(TreeNode node);
	void removeChild(TreeNode node);
	void clearChildren();
	int getId();
}
