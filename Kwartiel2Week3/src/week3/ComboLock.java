package week3;

public class ComboLock {
	private int[] combination = new int[3];
	private boolean correct = true;
	public int pointer = 0;
	public int base = 40;
	public int tryNo = 0;

	public ComboLock(int numberOne, int numberTwo, int numberThree) {
		this.combination[0] = numberOne;
		this.combination[1] = numberTwo;
		this.combination[2] = numberThree;
	}

	public void turnLeft(int ticks) {
		this.pointer = this.pointer - ticks;
		int result = this.pointer - ticks;
		if (this.correct) {
			if (this.tryNo == 2) {
				if (result == this.combination[1]) {
					this.correct = true;
				} else {
					this.correct = false;
				}
			} else {
				this.correct = false;
			}
		}
	}

	public void turnRight(int ticks) {
		int result = this.pointer + ticks;
		this.pointer = this.pointer + ticks;
		this.tryNo = this.tryNo + 1;
		if (this.correct) {
			if (this.tryNo == 1) {
				if (result == this.combination[0]) {
					//System.out.println(result);
					this.correct = true;
				} else {
					this.correct = false;
				}
			} else if (this.tryNo == 3) {
				if (result == this.combination[2]) {
					//System.out.println(result);
					this.correct = true;
				} else {
					this.correct = false;
				}
			} else {
				this.correct = false;
			}
		}
	}
	
	public void reset() {
		this.pointer = 0;
		this.tryNo = 0;
		this.correct = true;
	}
	
	public boolean open() {
		if(tryNo == 3 && this.correct) {
			return true;
		} else {
			return false;
		}
	}
}
