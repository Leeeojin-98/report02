package BTNode;

public class BTNode<Key extends Comparable<Key>> {
	private Key item;
	private BTNode<Key> left;
	private BTNode<Key> right;
	
	public BTNode(Key newItem, BTNode<Key> It, BTNode<Key> rt) { //노드생성자
		item = newItem; left = It; right = rt; }
	
	public Key getKey() {return item;}
	public BTNode<Key> getLeft() {return left;}
	public BTNode<Key> getRight(){return right;}
	
	public void setKey(Key newItem) {item = newItem;}
	public void setLeft(BTNode<Key> It) {left = It;}
	public void setRight(BTNode<Key> rt) {right = rt;}
}
