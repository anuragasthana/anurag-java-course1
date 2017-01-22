import java.util.Random;
public class hare {
	
	Random randomGenerator;
	int position;  //current postion of hare
//	int bighopCount;  //not used, only for debugging purpose
//	int smallhopCount;
//	int bigslipCount;
//	int smallslipCount;
//	int fallasleepCount;
//	int totalMoves;

	
	public hare() {
		this.randomGenerator = new Random();
		this.position = 1;
//		this.bighopCount = 0;
//		this.smallhopCount = 0;
//		this.bigslipCount = 0;
//		this.smallslipCount = 0;
//		this.fallasleepCount = 0;
//		this.totalMoves = 0;
	}
	
	//sets new position
	public void setPosition(int move) {
		this.position += move;
		if (this.position < 1)
			this.position = 1;
		if (this.position > 50)
			this.position = 50;
	}
	public int getPosition() {
		return this.position;
	}
	
	
	//gets the move length based on randomgenerator value 
	// and hare logic
	public int getMove(){
		int index = randomGenerator.nextInt(10);
		int move = 2;
		switch (index){
		case 0:
		case 1: move = 9;
				//bighopCount++;
			break;
		case 2:
		case 3:
		case 4: move = 1;
				//smallhopCount++;
			break;
		case 5: move = -12;
				//bigslipCount++;
			break;
		case 6: 
		case 7: move = -2;
		        //smallslipCount++;
			break;
		case 8:
		case 9: move = 0;
		        //fallasleepCount++;
			break;
		}
		//totalMoves++;
		return move;
		
	}
	
	
}


