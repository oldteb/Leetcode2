// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    int head = 0;
    int hasHead = 0;
    Iterator<Integer> iter;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
        if(iter.hasNext() == true){
            head = iter.next();
            hasHead = 1;
        }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return head;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int temp = head;
        if(iter.hasNext() == true){
            head = iter.next();
            hasHead = 1;
        }
        else{
            hasHead = 0;
        }
        return temp;
	}

	@Override
	public boolean hasNext() {
        return hasHead == 1 ? true : false;
	}
}
