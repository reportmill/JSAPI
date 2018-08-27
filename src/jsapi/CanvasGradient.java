package jsapi;

/**
 * A custom class.
 */
public class CanvasGradient extends EventTarget {

/**
 * Adds a new stop, defined by an offset and a color, to the gradient. If the offset is not between 0 and 1 an
 * INDEX_SIZE_ERR is raised, if the color can't be parsed as a CSS <color>, a SYNTAX_ERR is raised
 */
public native void addColorStop(double aOffset, String aColor);

}