import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
public class Cards extends Applet {
	
	Image [] card = new Image [52];
    Random randomGenerator = new Random();
    Image [] rowCards = new Image[52];
   
    public void init(){ 
    	
    	card[0] = getImage( getDocumentBase(), "Cards/c1.gif");
        card[1] = getImage( getDocumentBase(), "Cards/c2.gif");
        card[2] = getImage( getDocumentBase(), "Cards/c3.gif");
        card[3] = getImage( getDocumentBase(), "Cards/c4.gif");
        card[4] = getImage( getDocumentBase(), "Cards/c5.gif");
        card[5] = getImage( getDocumentBase(), "Cards/c6.gif");
        card[6] = getImage( getDocumentBase(), "Cards/c7.gif");
        card[7] = getImage( getDocumentBase(), "Cards/c8.gif");
        card[8] = getImage( getDocumentBase(), "Cards/c9.gif");
        card[9] = getImage( getDocumentBase(), "Cards/c10.gif");
        card[10] = getImage( getDocumentBase(), "Cards/cj.gif");
        card[11] = getImage( getDocumentBase(), "Cards/ck.gif");
        card[12] = getImage( getDocumentBase(), "Cards/cq.gif");
        card[13] = getImage( getDocumentBase(), "Cards/d1.gif");
        card[14] = getImage( getDocumentBase(), "Cards/d2.gif");
        card[15] = getImage( getDocumentBase(), "Cards/d3.gif");
        card[16] = getImage( getDocumentBase(), "Cards/d4.gif");
        card[17] = getImage( getDocumentBase(), "Cards/d5.gif");
        card[18] = getImage( getDocumentBase(), "Cards/d6.gif");
        card[19] = getImage( getDocumentBase(), "Cards/d7.gif");
        card[20] = getImage( getDocumentBase(), "Cards/d8.gif");
        card[21] = getImage( getDocumentBase(), "Cards/d9.gif");
        card[22] = getImage( getDocumentBase(), "Cards/d10.gif");
        card[23] = getImage( getDocumentBase(), "Cards/dj.gif");
        card[24] = getImage( getDocumentBase(), "Cards/dq.gif");
        card[25] = getImage( getDocumentBase(), "Cards/h1.gif");
        card[26] = getImage( getDocumentBase(), "Cards/h2.gif");
        card[27] = getImage( getDocumentBase(), "Cards/h3.gif");
        card[28] = getImage( getDocumentBase(), "Cards/h4.gif");
        card[29] = getImage( getDocumentBase(), "Cards/h5.gif");
        card[30] = getImage( getDocumentBase(), "Cards/h6.gif");
        card[31] = getImage( getDocumentBase(), "Cards/h7.gif");
        card[32] = getImage( getDocumentBase(), "Cards/h8.gif");
        card[33] = getImage( getDocumentBase(), "Cards/h9.gif");
        card[34] = getImage( getDocumentBase(), "Cards/h10.gif");
        card[35] = getImage( getDocumentBase(), "Cards/hj.gif");
        card[36] = getImage( getDocumentBase(), "Cards/hk.gif");
        card[37] = getImage( getDocumentBase(), "Cards/hq.gif");
        card[38] = getImage( getDocumentBase(), "Cards/dk.gif");
        card[39] = getImage( getDocumentBase(), "Cards/sq.gif");
        card[40] = getImage( getDocumentBase(), "Cards/sk.gif");
        card[41] = getImage( getDocumentBase(), "Cards/s1.gif");
        card[42] = getImage( getDocumentBase(), "Cards/s2.gif");
        card[43] = getImage( getDocumentBase(), "Cards/s3.gif");
        card[44] = getImage( getDocumentBase(), "Cards/s4.gif");
        card[45] = getImage( getDocumentBase(), "Cards/s5.gif");
        card[46] = getImage( getDocumentBase(), "Cards/s6.gif");
        card[47] = getImage( getDocumentBase(), "Cards/s7.gif");
        card[48] = getImage( getDocumentBase(), "Cards/s8.gif");
        card[49] = getImage( getDocumentBase(), "Cards/s9.gif");
        card[50] = getImage( getDocumentBase(), "Cards/s10.gif");
        card[51] = getImage( getDocumentBase(), "Cards/sj.gif");
        
        
        for (int i = 0; i<52; i++){
        	int index = randomGenerator.nextInt(52);
        	while (isCardPresent(index)) {
        		index = randomGenerator.nextInt(52);
        	}
        	rowCards[i] = card[index];        	      	
        }
         
    }
    
    //Check if this index card is already present in the rowCard
    // true is present, false if not present
    public boolean isCardPresent(int index) {
    	boolean result = false;
    	for (int i =0; i < 10; i ++) {
    		if (rowCards[i] == card[index]) {
    			result = true;
    			break;
    		}   			
    	}
    	return result;
    }
    
    public void paint(Graphics g){
    	for (int k = 0; k<5; k++){
    		g.drawImage(rowCards[k],10 + (80*k), 10, this );
    	}
    	for (int k = 5; k<10; k++){
    		g.drawImage(rowCards[k],10 + (80*(k-5)), 150, this );
    	}
    }
    
    
 

}
