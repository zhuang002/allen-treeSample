
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode[] nodes = new TreeNode[12];
		for (int i=0;i<=11;i++) {
			nodes[i] = new Node(i);
		}
		nodes[0].addChild(nodes[1]);
		nodes[0].addChild(nodes[2]);
		nodes[1].addChild(nodes[3]);
		nodes[1].addChild(nodes[4]);
		nodes[1].addChild(nodes[5]);
		nodes[2].addChild(nodes[6]);
		nodes[2].addChild(nodes[7]);
		nodes[4].addChild(nodes[8]);
		nodes[4].addChild(nodes[9]);
		nodes[6].addChild(nodes[10]);
		nodes[6].addChild(nodes[11]);
		
	}

}
