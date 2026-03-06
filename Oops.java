public class Oops{ 
    public static void main (String args[]){ 
        Pen p1=new Pen();
        p1.setColor("black");
        p1.setTip('3');
    }}
class Pen{ 
     String color;
     int tip;
     void setColor(newColor){ 
         color= newColor;

       }
     void setTip (newTip){ 
         tip=newTip;
}
}