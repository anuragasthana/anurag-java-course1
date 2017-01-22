import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class race extends Applet{
	
    public static final int fontsize = 36;	//font size for printing baner
    public static final int FINISHCOUNT = 50;	// number of steps in the race
    public static final int BANNER_Y = 400;	//Y coordinate for banner
    public static final int BANNER_X = 0;	//X coordinate for banner  
    
    public static final int SINGLESTEPSIZE = 28;	//horizontal size of a single step in pixels
    public static final int SINGLESTEPHEIGHT = 120;// height/width of the track
    public static final int LEFTSIDE = 0;	//Absolute left ie. start of track
    public static final int T_TRACKTOP = 100;		//Y coordinate of tortoise track top
    public static final int T_TRACKBOTTOM = 220;	//Y coordinate of tortoise track bottom
    public static final int H_TRACKTOP = 580;	//Y coordinate of hare track top
    public static final int H_TRACKBOTTOM = 700;	//Y coordinate of hare track bottom

    //tortoise and hare image objects
	Image tortoiseImage , hareImage;
	
	tortoise rt = new tortoise();
	hare rh = new hare();
	
	//init applet, load images
	public void init(){
		tortoiseImage = getImage( getDocumentBase(), "pics-p2/tortoise.gif");
		hareImage = getImage( getDocumentBase(), "pics-p2/hare.gif");
		
	}
	public void paint(Graphics g){
		
		boolean t = true;
		while(t){
			//move tortoise and hare
			this.moveTortoise(g);
			this.moveHare(g);
			
			//have any of them reached the finish  line yet
			if ((rt.getPosition() >=FINISHCOUNT ) || (rh.getPosition() >=FINISHCOUNT)) {
			
				//both reached WOW tie !!
				if ((rt.getPosition() >=FINISHCOUNT ) && (rh.getPosition() >=FINISHCOUNT)) {
					Font f = new Font("Arial", Font.BOLD, fontsize);
					g.setFont(f);
					g.setColor(Color.black);
					g.drawString("It is a tie!!!", BANNER_X , BANNER_Y);
					break;
				}
				
				//tortoise reached
				if (rt.getPosition() >= FINISHCOUNT) {
					Font f = new Font("Arial", Font.BOLD, fontsize);
					g.setFont(f);
					g.setColor(Color.blue);
					g.drawString("The tortoise won!!!", BANNER_X , BANNER_Y);
				
				} else {  //hare reached
					Font f = new Font("Arial", Font.BOLD, fontsize);
					g.setFont(f);
					g.setColor(Color.red);
					g.drawString("The hare won!!!", BANNER_X , BANNER_Y);
				}
				
				break;
			}
			
			run();
		}
	}
	
    //sleep for 0.5 second after every move
    // repaint after u wake up
	public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int tmove = rt.getMove();
			rt.setPosition(tmove);
			int hmove = rh.getMove();
		    rh.setPosition(hmove);
		    
		    System.out.println("Tortoise Position: " + rt.getPosition());
		    System.out.println("Hare Position: " + rh.getPosition());
		    System.out.println();
		    repaint();
		    
		}
			
	//method to move tortoise
	public void moveTortoise(Graphics g) {
		
		//paint all the steps in the tortoise track
		for(int i = 0; i<FINISHCOUNT; i++){
			g.setColor(Color.blue);
			g.fillRect(SINGLESTEPSIZE*i, T_TRACKTOP, SINGLESTEPSIZE,SINGLESTEPHEIGHT); //fill step
			g.setColor(Color.black);
			g.drawLine(LEFTSIDE, T_TRACKBOTTOM, SINGLESTEPSIZE*i, T_TRACKBOTTOM); //border for each step
			g.drawLine(LEFTSIDE, T_TRACKTOP, SINGLESTEPSIZE*i, T_TRACKTOP);
			g.drawLine(SINGLESTEPSIZE*i, T_TRACKTOP, SINGLESTEPSIZE*i, T_TRACKBOTTOM);
		}
		g.drawLine(1372, LEFTSIDE, 1372, 800);  //last cell after finish line
		g.setColor(Color.blue);
		g.fillRect(1372, T_TRACKTOP, 78, SINGLESTEPHEIGHT);  //finish line
		g.drawImage(tortoiseImage, SINGLESTEPSIZE*((rt.getPosition())-1), T_TRACKTOP, this); //place tortoise new position

	}
	
	
	public void moveHare(Graphics g) {
		for (int i = 0; i<FINISHCOUNT; i++){
			g.setColor(Color.red);
			g.fillRect(SINGLESTEPSIZE*i,H_TRACKTOP, SINGLESTEPSIZE,SINGLESTEPHEIGHT); //fill step
			//g.fillRect(1372, H_TRACKTOP, 78, SINGLESTEPHEIGHT);
			g.setColor(Color.black);
			g.drawLine(LEFTSIDE, H_TRACKTOP, SINGLESTEPSIZE*i, H_TRACKTOP);  // border for each step
			g.drawLine(LEFTSIDE, H_TRACKBOTTOM, SINGLESTEPSIZE*i, H_TRACKBOTTOM);
			g.drawLine(SINGLESTEPSIZE*i, H_TRACKTOP, SINGLESTEPSIZE*i, H_TRACKBOTTOM);
		}
		g.drawLine(1373, LEFTSIDE, 1373, 800); //last cell after finish line
		g.setColor(Color.red);
		g.fillRect(1372, H_TRACKTOP, 78, SINGLESTEPHEIGHT); //finish line
		g.drawImage(hareImage, SINGLESTEPSIZE*((rh.getPosition())-1), H_TRACKTOP, this);//place hare new position

	}
	
	
}
