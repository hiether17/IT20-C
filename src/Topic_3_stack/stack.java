package Topic_3_stack;

public class stack {
	private int maxSize;
    private int[] stackArray;
    private int top; 
    
    public stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
        
}
}
