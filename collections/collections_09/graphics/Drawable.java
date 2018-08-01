package collections_09.graphics;

import java.awt.*;
/**Drawable objects
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public interface Drawable extends Scaleable{
   /**Draw the object.
    * @param g Graphical context.
    */
	public void draw(Graphics g);
}
