package assignment13;
import java.awt.*;

/**
 * Rect objects represent a rectangle shape
 * drawn to the screen at a particular position
 * with some size and color.
 *
 * @author Brady Hartog
 * @version Fall 2018
 */
public class Rect extends Shape
{
    // Instance variables.

    private int width;    // The width of our rectangle, measured in pixels.
    private int height;   // The height of our rectangle, measured in pixels.

    /**
     * Constructor - initializes the position, width, height and
     * color of this rectangle object.  The position is a point that
     * describes a box that contains this rectangle.  The point is
     * the upper-left corner of the box that would contain this
     * rectangle.
     *
     * @param x
     *         the x coordinate of this object's position
     *
     * @param y
     *         the x coordinate of this object's position
     *
     * @param width
     *         the width of this rectangle
     *
     * @param height
     *         the height of this rectangle
     *
     * @param color
     *         the color of this rectangle
     */
    public Rect (int x, int y, int width, int height, Color color)
    {
        super (x, y, color);   // Call the superclass constructor.
        this.width = width;    // Preserve width and height.
        this.height = height;
    }

    /**
     * Draws the rectangle at its current position and color
     * to the specified graphics object.
     *
     * @param g
     *         the graphics object (where to draw to)
     */
    public void draw (Graphics g)
    {
        g.setColor (color);
        g.fillRect (x, y, width, height);
    }

    /**
     * Returns true if the coordinates are within the rectangle.
     *
     * @param targetX
     *               an x coordinate
     *
     * @param targetY
     *               a y coordinate
     *
     * @return
     *        true if the coordinates are within the shape
     */
    public boolean isInside (int targetX, int targetY)
    {
        return targetX >= x &&
               targetX < x + width &&
               targetY >= y &&
               targetY < y + height;
    }
}