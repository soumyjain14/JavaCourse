package maps;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K, V>> buckets;
	int numBuckets;
	int size;

	public Map() {
		// TODO Auto-generated constructor stub
		numBuckets=5;
		buckets=new ArrayList<MapNode<K,V>>();
		for(int i=0;i<20;i++) {
			buckets.add(null);
		}

	}
	private int getBucketIndex(K key) {
		int hashCode=key.hashCode();
		//System.out.println(hashCode);
		return Math.abs(hashCode) % numBuckets;
	}

	public int size() {
		return size;
	}
	public V removekey(K key) {
		int bucketIndex=getBucketIndex(key);
		
		MapNode<K, V> head=buckets.get(bucketIndex);
		MapNode<K, V> prev=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev==null) {
					buckets.set(bucketIndex, head.next);
				}else {
					prev.next=head.next;
				}				
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		return null;
	}

	public V getValue(K key) {
		int bucketIndex=getBucketIndex(key);
		MapNode<K, V> head=buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public boolean search(K key) {
		int bucketIndex=getBucketIndex(key);
		MapNode<K, V> head=buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return true;
			}
			head=head.next;
		}
		return false;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public double loadFactor() {
		return (1.0*size)/numBuckets;
	}
	
	private void rehash() {
		System.out.println("Rehashing"+" "+" size "+ size+ "NumberBuckets"+numBuckets);
		ArrayList<MapNode<K, V>> temp=buckets;
		buckets=new ArrayList<>();
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		numBuckets*=2;
		size=0;
		for(int i=0;i<temp.size();i++) {
			MapNode<K, V> head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V value=head.value;
				insert(key, value);
				head=head.next;
			}
		}
	}

	public void insert(K key, V value) {
		int bucketIndex=getBucketIndex(key);
		//System.out.println(bucketIndex);
		MapNode<K, V> head=buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		head=buckets.get(bucketIndex);
		MapNode<K, V> newElementNode=new MapNode<K,V>(key, value);
		size++;
		newElementNode.next=head;
		buckets.set(bucketIndex, newElementNode);
		double loadFactor=(1.0*size)/numBuckets;
		if(loadFactor>0.7) {
			rehash();
		}
	}
}
