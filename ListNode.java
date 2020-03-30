package Link;

public class ListNode {
	private String data;
	public ListNode link;
	public ListNode() {
		this.data = null;
		this.link = null;
	}
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	public String getData(){
	return this.data;
	}
}