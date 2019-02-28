package assignment13;
import java.awt.*;

/**
 * RegularPolygon objects represent a regular polygon shape
 * drawn to the screen at a particular position
 * with some radius, number of sides, and color.
 *
 * @author Brady Hartog
 * @version Fall 2018
 */
public class RegularPolygon extends Shape
{
    // Instance variables.

    private int radius;      // The radius of the polygon.
    private int side_count;  // The number of sides of the polygon.
    private Polygon poly;    // The global Polygon object.

    /**
     * Constructor - initializes the position, width, height and
     * color of this regular polygon object.  The position is a point that
     * describes the midpoint of this polygon.  The point is the
     * center of the shape about which the radius revolves to create
     * its corners.
     *
     * @param x
     *         the x coordinate of this object's position
     *
     * @param y
     *         the y coordinate of this object's position
     *
     * @param radius
     *         the radius of this polygon
     *
     * @param side_count
     *         the side count of this polygon
     *
     * @param color
     *         the color of this polygon
     */
    public RegularPolygon (int x, int y, int radius, int side_count, Color color)
    {
        super (x, y, color);   // Call the superclass constructor.
        this.radius = radius;    // Preserve width and height.
        this.side_count = side_count;
        //this.poly = poly;
    }

    /**
     * Draws the polygon at its current position and color
     * to the specified graphics object.
     *
     * @param g
     *         the graphics object (where to draw to)
     */
    public void draw (Graphics g)
    {
        double angle = 2 * Math.PI / side_count;  // The angle between each side.

        Polygon p = new Polygon();

        g.setColor (color);
        for (int i = 0; i < side_count; i++) {
            int next_x = (int)(x + Math.cos((Math.PI/2)+(angle*i))*radius);
            int next_y = (int)(y - radius - (1-Math.sin((Math.PI/2)+(angle*i)))*radius);
            p.addPoint(next_x, next_y);
        }
        poly = p;  // Assign this polygon to the global Polygon object.
        g.fillPolygon(p);
    }

    /**
     * Returns true if the coordinates are within the polygon.
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
        return poly.contains(targetX, targetY);
    }
}