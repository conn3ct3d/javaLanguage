public class JavaArrays {
    public static void main(String[] args) {
        // Working with arrays in Java
        System.out.println("Arrays");
	int[] integers;
	integers = new int[3];
	// These values are only valid within the main function (local values)
	// values inside an array are known as stack
	// objects inside memory are known as heap
	// values inside the array point to objects inside the heap where 
	// objects are stored
	
	// ways to declare and init an array:
	// int[] nums = new int[2];
	// var nums = new int[2];

	// modifying array values:
	integers[0] = 1;
	integers[1] = 2;
	integers[2] = 3;        
	
	System.out.println("Using an enhanced for-loop");
	for (int value: integers){
		System.out.println(value);
	}

	// Additional array initialization methods:
	// Initialize with values at declaration
	int[] numbers1 = {1,2,3,4,5};

	// Using array literal with new keyword
	int[] numbers2 = new int[]{1,2,3,4,5};
	
	// Initialize all elements to the same value
	int[] numbers3 = new int[5];
	Arrays.fill(numbers3, 10);

	}
}