import java.util.Random;
public class tortoise {
	
	Random randomGenerator;	
	int position;
//	int fastplodCount;  //not used only for debug purposes
//	int slowplodCount;
//	int slipCount;
//	int totalMoves;
	
	public tortoise() {
		this.randomGenerator = new Random();
		this.position = 1;
//		this.fastplodCount = 0;
//		this.slowplodCount = 0;
//		this.slipCount = 0;
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
	
	//gets the move length based on random generator value 
	// and tortoise logic
	public int getMove(){
		int index = randomGenerator.nextInt(10);
		int move = 2;
		switch (index){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: move = 3;
		        //fastplodCount++;
			break;
		case 5:
		case 6:
		case 7: move = 1;
		        //slowplodCount++;
			break;
		case 8:
		case 9: move = -6;
		        //slipCount++;
			break;
		}		
		//totalMoves++;
		return move;
	}
}
