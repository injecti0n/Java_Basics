package multithreading_03;

public class PrintThread extends Thread {
	private char c;
	private int count;
	public PrintThread(char c, int count)	{
		this.c = c;
		this.count = count;
	}

	public void run()	{
		for(int i = 0 ; i< count; i++) {
			System.out.print(c);
			Thread.yield();
		}
	}
}
