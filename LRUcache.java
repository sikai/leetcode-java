public class LRUCache {
    
        private HashMap<Integer,DoubleLinekdListNode> map = new HashMap<Integer,DoubleLinekdListNode>();
		private DoubleLinekdListNode head;
		private DoubleLinekdListNode end;
		private int capacity;
		private int len;
		public LRUCache(int c){
			this.capacity = c;
			len = 0;
		}
    
    public int get(int key) {
        if(map.containsKey(key)){
			DoubleLinekdListNode node = map.get(key);
			removeNode(node);
			setHead(node);
			return node.value;
		}else{
			return -1;	
		}
    }

	public void removeNode(DoubleLinekdListNode node){
		if(node==null) return;
		DoubleLinekdListNode pre = node.pre;
		DoubleLinekdListNode post = node.post;
		if(pre!=null){
			pre.post=post;
		}else{
			head=post;
		}
		if(post!=null){
			post.pre=pre;
		}else{
			end=pre;
		}
	}
	
	public void setHead(DoubleLinekdListNode node){
		if(node==null) return;
		node.post = head;
		node.pre = null;
		if(head!=null){
			head.pre = node;
		}else{
			end = node;
		}
		head = node;		
	}
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
			DoubleLinekdListNode node = map.get(key);
			node.value = value;
			removeNode(node);
			setHead(node);
		}else{
			DoubleLinekdListNode node = new DoubleLinekdListNode(key,value);
			map.put(key,node);
			if(len<capacity){
				setHead(node);
				len++;
			}else{
				map.remove(end.key);
				removeNode(end);
				setHead(node);
			}
		}
    }
	class DoubleLinekdListNode{
		public int key;
		public int value;
		DoubleLinekdListNode pre;
		DoubleLinekdListNode post;
		public DoubleLinekdListNode(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
	
	
	
}

	
	public void set(int key, int value){
		if(map.containsKey(key)){
			DoubleLinkedListNode node = map.get(key);
			node.value = value;
			removeNode(node);
			setHead(node);
		}else{
			DoubleLinkedListNode node = new DoubleLinkedListNode(key,value);
			map.put(key,node);
			if(len<capacity){
				setHead(node);
				len++;
			}else{
				map.remove(tail.key)
				removeNode(tail);
				setHead(node);
			}
		}
	}