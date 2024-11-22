class Rectangle
{
 
 private float length;
 private float width;
 
 // For all rectangles with no measurements specified

 public Rectangle()
 {
     System.out.println("** Constructing a default Rectangle**");
     
     length = 40;
     width = 30;
 }
 
 
 // For all rectangles with unequal sides
 
 public Rectangle(float l, float w)
 {
     System.out.println("** Constructing a Rectangle **");
     
     length = l;
     width = w;
 }
 
 // For squares
 
  public Rectangle(float side)
 {
     System.out.println("** Constructing a Square **");
     
     length = side;
     width = side;
 }
 
 public void reduce(float dl, float dw)
 {
     System.out.println("Hello from reduce(float, float)");
      
     length -= dl;
     width -= dw;
 }
 
  public void reduce(float dl)
 {
     System.out.println("Hello from reduce(float)");
     length -= dl;
     width -= dl;
 }
 
 
 public void setLength(float l)
 {  
     length = l;
 }
 
 public void setWidth(float w)
 {  
     width = w;
 }  
    
 public float getLength()
 {
     return length;
 }
  
 public float getWidth()
 {
     return width;
 }  
    
}


public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box;
        
        box = new Rectangle(10);
        
        System.out.println("Original Rectangle :");
        System.out.println("Length = "+ box.getLength() + " :: Width =  " + box.getWidth());
        
        System.out.println("Printing the constructed Rectangle : \n\n");
        
        displayRectangle(box);
        
        box.reduce(3,5);
        
        System.out.println("\n\n After reduction - Rectangle :");
        System.out.println("Length = "+ box.getLength() + " :: Width =  " + box.getWidth());
        
        System.out.println("Printing the reduced Rectangle : \n\n");
        
        displayRectangle(box);
    }

    public static void displayRectangle(Rectangle rect)
    {
        for(int i=0 ; i< rect.getWidth() ;++i)
        {
            for(int j=0 ; j< rect.getLength() ; ++j)
                System.out.print("* ");
                
            System.out.println();
        }
    }

}    
