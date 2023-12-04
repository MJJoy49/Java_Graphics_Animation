import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class panel_Graphics extends JPanel 
{
    int x=0;
    int x1=610;
    int position=1;
        String urlS="star.png";
        Image imageS=new ImageIcon(urlS).getImage();

        String urlM="moon.png";
        Image imageM=new ImageIcon(urlM).getImage();


        String url1="1.png";
        Image image1=new ImageIcon(url1).getImage();
      
        String url2="2.png";
        Image image2=new ImageIcon(url2).getImage();

        String url3="3.png";
        Image image3=new ImageIcon(url3).getImage();
      
        String url4="4.png";
        Image image4=new ImageIcon(url4).getImage();

        String url5="5.png";
        Image image5=new ImageIcon(url5).getImage();

        String url7="7.png";
        Image image7=new ImageIcon(url7).getImage();

        String url6="6.png";
        Image image6=new ImageIcon(url6).getImage();

        String url8="8.png";
        Image image8=new ImageIcon(url8).getImage();

        String url16="16.png";
        Image image16=new ImageIcon(url16).getImage();
      
        String url17="17.png";
        Image image17=new ImageIcon(url17).getImage();

        String url18="18.png";
        Image image18=new ImageIcon(url18).getImage();
      
        String url19="19.png";
        Image image19=new ImageIcon(url19).getImage();

        String url20="20.png";
        Image image20=new ImageIcon(url20).getImage();

    
    public void paint(Graphics g)
    {
        
       super.paint(g);
        g.setColor(new Color(199,195,185));
        g.fillRect(0,300,800,300);


        
        g.drawImage(imageS, 0, 0, 100,100,null);
        g.drawImage(imageS, 50, 0, 100,100,null);
        g.drawImage(imageS, 100, 0, 100,100,null);
        g.drawImage(imageS, 150, 0, 100,100,null);
        g.drawImage(imageS, 200, 0, 100,100,null);
        g.drawImage(imageS, 250, 0, 100,100,null);
        g.drawImage(imageS, 300, 0, 100,100,null);
        g.drawImage(imageS, 350, 0, 100,100,null);
        g.drawImage(imageS, 400, 0, 100,100,null);
        g.drawImage(imageS, 450, 0, 100,100,null);
        g.drawImage(imageS, 500, 0, 100,100,null);
        g.drawImage(imageS, 550, 0, 100,100,null);
        g.drawImage(imageS, 600, 0, 100,100,null);
        g.drawImage(imageS, 650, 0, 100,100,null);
        g.drawImage(imageS, 700, 0, 100,100,null);

        g.drawImage(imageS, 0, 50, 100,100,null);
        g.drawImage(imageS, 50, 50, 100,100,null);
        g.drawImage(imageS, 100, 50, 100,100,null);
        g.drawImage(imageS, 150, 50, 100,100,null);
        g.drawImage(imageS, 200, 50, 100,100,null);
        g.drawImage(imageS, 250, 50, 100,100,null);
        g.drawImage(imageS, 300, 50, 100,100,null);
        g.drawImage(imageS, 350, 50, 100,100,null);
        g.drawImage(imageS, 400, 50, 100,100,null);
        g.drawImage(imageS, 450, 50, 100,100,null);
        g.drawImage(imageS, 500, 50, 100,100,null);
        g.drawImage(imageS, 550, 50, 100,100,null);
        g.drawImage(imageS, 600, 50, 100,100,null);
        g.drawImage(imageS, 650, 50, 100,100,null);
        g.drawImage(imageS, 700, 50, 100,100,null);

        g.drawImage(imageM, 500, 0, 150,150,null);

        
        
        if(x==600)
        {
            try 
            {
                Thread.sleep(800);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }

            
            g.drawImage(image8, 650, 200, 100,100,null);
            g.drawImage(image8, 700, 200, 100,100,null);

          
            position=5;


            try 
             {
                Thread.sleep(1200);
             } 
            catch (Exception e) 
            {
                 System.out.println(e);
            }
            
        }
        else if(x<600)
        {
            g.drawImage(image6, 650, 200, 100,100,null);
        }
        

        if (position== 1)
        {
           g.drawImage(image1, x, 200, 100,100,null);  
        }

        else if (position==2) 
        {
            g.drawImage(image2, x, 200, 100,100,null);
        } 

        else if (position==3) 
        {
            g.drawImage(image3, x, 200, 100,100,null);
        } 

        else if (position==4) 
        {
            g.drawImage(image4, x, 200, 100,100,null);
        } 

        else if(position==5)
        {
            if(x==590 ||x==600)
            {
                 g.drawImage(image7, x, 200, 100,100,null);
                 
            }

            else
            {
                 g.drawImage(image5, x, 200, 100,100,null);
            }
        }

        else if(position==11)
        {
            if(x1==600)
            {
                try 
                {
                    Thread.sleep(3000);
                } 
                catch (Exception e) 
                {
                    System.out.println(e);
                }
            }
            g.drawImage(image16, x1, 200, 100,100,null);
        }

        else if(position==12)
        {
            g.drawImage(image17, x1, 200, 100,100,null);
        }


        else if(position==13)
        {
            g.drawImage(image18, x1, 200, 100,100,null);
        }

        else if(position==14)
        {
            g.drawImage(image19, x1, 200, 100,100,null);

        }

         else if(position==15)
        {
            g.drawImage(image20, x1, 200, 100,100,null);
        }

        if(x==600)
        {
                    
            position=10;
            try 
             {
                Thread.sleep(1200);
             } 
            catch (Exception e) 
            {
                 System.out.println(e);
            }
        }

       

        g.fillRect(100, 270, 20, 30);
        g.fillRect(200, 270, 20, 30);
        g.fillRect(300, 270, 20, 30);
        g.fillRect(400, 270, 20, 30);
        g.fillRect(500, 270, 20, 30);
        g.fillRect(600, 270, 20, 30);
        g.fillRect(700, 270, 20, 30);
        
        g.setColor(Color.GREEN);
        g.drawString("Created by MJ.Joy with Java language", 500, 550);

        
        if(x==600||x>600)
        {
            
            x1=x1-10;
            x=x+10;
        }
        else
        {
            x=x+10;
        }

        if(position==5)
        {
            position=position-5;
            position++;
        }
        else if(position==10||position>10)
        {
            if(position==15)
            {
                position=position-5;
                position++;

                try 
                     {
                        Thread.sleep(200);
                     } 
                catch (Exception e) 
                    {
                        System.out.println(e);
                    }
                
            }
            else
            {
                position++;
            }
            
        }
        else
        {
            position++;
        }
        
       
        

        try 
        {
            Thread.sleep(200);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }


       if(x<1400)
       {
        repaint();
       }
       else
       {
         g.dispose();
       }
    }

   

    
}
