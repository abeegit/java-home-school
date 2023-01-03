package Main;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		int digitsLength = digits.length;
		int carry = 1;
		
		for (int i = digitsLength - 1; i >= 0; i--) {
			int digit = digits[i];
			int sum = digit + carry;
			if (sum >= 10) {
				digits[i] = sum % 10;
				carry = 1;
			} else {
				digits[i] = sum;
				carry = 0;
			}
		}
		
		if (carry == 1) {
			int[] newDigits = new int[digitsLength + 1];
			newDigits[0] = 1;
			for (int j = 0; j < digits.length; j++) {
				newDigits[j + 1] = digits[j];
			}
			
			return newDigits;
		}
        return digits;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[] {9};
		PlusOne cl = new PlusOne();
		int[] newDigits = cl.plusOne(digits);
		for (int i = 0; i < newDigits.length; i++) {
			System.out.println(newDigits[i]);
		}
	}

}
