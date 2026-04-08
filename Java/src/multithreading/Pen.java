package multithreading;

public class Pen {

	public synchronized void writeWithPenAndPaper(Paper paper) {
		System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use pen");
		paper.finishWriting();
	}

	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " finish using this pen " + this);
	}
}

class Paper {
	
	public synchronized void writeWithPenAndPaper(Pen pen) {
		System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper");
		pen.finishWriting();
	}

	public synchronized void finishWriting() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + " finish using this pen " + this);

	}

}
