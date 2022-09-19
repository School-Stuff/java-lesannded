public class Magic {
	public static void main(String[] args) {
    // Originaalne number - myNumber
		final int myNumber = 322;
    int magicNumber = ((((myNumber * myNumber) + myNumber) / myNumber) + 17 - myNumber) / 6;
    System.out.println(magicNumber);

	}
}