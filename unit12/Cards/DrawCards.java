/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

/**
 *
 * @author Flin
 */
public class DrawCards extends Applet
{
    
    Image [] card = new Image [52];
    int [] ran = new int[52];
    Random randomGenerator = new Random();
    int idx =0;
    int total_ran_num =0;
    int rand =0;
    boolean dup_found ;
    
    public void init(){
    
         // loop to remove duplicate 
        while(idx<52)
        {
            rand= randomGenerator.nextInt(52);
            total_ran_num++;
            // check if there is duplicate assume dup_found is 0
            dup_found = false;
            for(int k=0;k<idx;k++)
            {
               if(ran[k]==rand)
               {
                   // find the duplicate 
                    dup_found =true;     
               }
            }
            if(dup_found==false)
            {
                ran[idx] = rand;
                idx++;
            } 
                 
        }
        
        
      
        // load card image
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
        card[24] = getImage( getDocumentBase(), "Cards/ec.gif");
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
        card[38] = getImage( getDocumentBase(), "Cards/c1.gif");
        card[39] = getImage( getDocumentBase(), "Cards/jb.gif");
        card[40] = getImage( getDocumentBase(), "Cards/jr.gif");
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
 
        
        
        
        
        
    }

    
    public void paint(Graphics g){
        
        // use card idx from ran idx value
        for(int idx = 0; idx<=4; idx++)
        {
           g.drawImage(card[ran[idx]] , (10+idx*80),10,120,80, this);   
           
        }
        // card idx add 5 
         for(int idx = 0; idx<=4; idx++)
        {
           g.drawImage(card[ran[idx+5]] , (10+idx*80),150,120,80, this);            
        }
        
        
        
    }
        
}
