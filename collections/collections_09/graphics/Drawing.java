package collections_09.graphics;

import java.awt.*;
import java.util.*;

/**This class represents a drawing, containing drawable objects.
 * The drawing is implemented according the <i><b>Composite Design Pattern</b></i>
 * 
 * @author Noel Vaes
 * @version 1.0
 */
@SuppressWarnings("rawtypes")
public class Drawing implements Drawable,Iterable<Drawable> {
   private Collection<Drawable> drawables = new ArrayList<Drawable>();

   /**Add a drawable object to the drawing.
    * @param d The drawable object to add.
    */
   public void add(Drawable d) {
      if (d != null) { // ArrayList can contain null!!
         drawables.add(d);
      }
   }

	/**
	 * Remove all drawable objects from drawing.
	 */
   public void clear() {
      drawables.clear();
   }

   public Iterator<Drawable> iterator() {
      return drawables.iterator();
   }
	
   /**Get the number of drawables in the drawing.
    * @return The number of drawables.
    */
   public int getSize() {
      return drawables.size();
   }
	
   /**
    * Remove drawable object from the drawing.
    * @param d Object to remove
    */
   public void remove(Drawable d) {
      drawables.remove(d);
   }
	
   public void draw(Graphics g) {
      for (Drawable d : drawables) {
         d.draw(g);
      }
   }

   public void scale(int factor) {
      for (Drawable d : drawables) {
         d.scale(factor);
      }
   }
}
