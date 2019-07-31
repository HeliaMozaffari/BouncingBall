package ballPanel;

public class Ball implements Runnable {
	
	int X = 50;
	int Y = 10;

	public int getX() {
		return X;
	}


	public int getY() {
		return Y;
	}


	public Ball(int x, int y) {
		x=X;
		y=Y;
	}


	@Override
	public void run() {
		try {
			
			while(true) {
			
			while(X <190 && Y < 190)
			{
			Thread.sleep(50);
				X++;
				Y++;
			}
			while(X > 0 && Y > 0){
			Thread.sleep(50);
				X--;
				Y--;
			}
			
						
			
			}
			
		}
		catch(Exception e) {}
		
	}

	

}
