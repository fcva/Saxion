package P81;

public class Counter {

	private static int count;
	private static int step;
	private static int max = 10;

	public Counter(int startIndex, int stepValue) {
		count = startIndex;
		step = stepValue;
	}
	
	/** 
	 * <p>
	 * Increments the counter by stepper value. Does not continue
	 * if the maximum value is reached.
	 *
	 * @param  Nothing
	 * @return Nothing
	 */
	public void count() {
		if (count < max) {
			count = count + step;
		} else {
			System.out.println("Limit exceeded");
		}
	}

	public void undo() {
		if (count > 0) {
			count = count - step;
		}
	}

	public int getCurrentCount() {
		return count;
	}

	public void setLimit(int maximum) {
		max = maximum;
	}
}
