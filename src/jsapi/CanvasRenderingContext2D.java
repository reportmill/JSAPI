package jsapi;

/**
 * CanvasRenderingContext2D is used for drawing rectangles, text, images and other objects onto the canvas element.
 * It provides the 2D rendering context for the drawing surface of a <canvas> element.
 */
public class CanvasRenderingContext2D extends EventTarget {
    
    // The fill style
    public Object fillStyle;

/**
 * Sets the color or style to use inside shapes. Default #000 (black).
 */
//public native void setFillStyle(String aStr);

/**
 * Sets the gradient to use inside shapes. Default #000 (black).
 */
//public native void setFillStyle(CanvasGradient aCG);

/**
 * Sets the color or style to use for the lines around shapes. Default #000 (black).
 */
public native void setStrokeStyle(String aStr);

/**
 * Sets the gradient to use for the lines around shapes. Default #000 (black).
 */
public native void setStrokeStyle(CanvasGradient aCG);

/**
 * Sets the width of lines. Default 1.0.
 */
public native void setLineWidth(double aValue);

/**
 * Returns the current line dash pattern array containing an even number of non-negative numbers.
 */
public double[] getLineDash()
{
    Object dashArrayJSO = getLineDashJSO();
    if(dashArrayJSO instanceof double[])
        return (double[])dashArrayJSO;
    System.out.println("getLineDash is broken - not returning double[]"); return new double[0];
}

/**
 * Returns the current line dash pattern array containing an even number of non-negative numbers.
 */
native Object getLineDashJSO();

/**
 * Sets the current line dash pattern array containing an even number of non-negative numbers.
 */
public void setLineDash(double theDashes[])
{
    setLineDashJSO(theDashes);
}

/**
 * Returns the current line dash pattern array containing an even number of non-negative numbers.
 */
native void setLineDashJSO(double theDashes[]);

/**
 * Returns where to start a dash array on a line.
 */
public native double getLineDashOffset();

/**
 * Sets where to start a dash array on a line.
 */
public native void setLineDashOffset(double anOffset);

/**
 * Sets the Alpha value applied to shapes and images before they are composited onto the canvas. Default 1.0 (opaque).
 */
public native void setGlobalAlpha(double aValue);

/**
 * Font setting. Default value 10px sans-serif.
 */
public native void setFont(String aFontStr);

/**
 * Sets all pixels in the rectangle defined by starting point (x, y) and size (width, height) to transparent black.
 */
public native void clearRect(double aX, double aY, double aW, double aH);

/**
 * Draws a filled rectangle at (x, y) position whose size is determined by width and height.
 */
public native void fillRect(double aX, double aY, double aW, double aH);

/**
 * Paints a rectangle which has a starting point at (x, y) and has a w width and an h height onto the canvas,
 * using the current stroke style.
 */
public native void strokeRect(double aX, double aY, double aW, double aH);

/**
 * Starts a new path by emptying the list of sub-paths. Call this method when you want to create a new path.
 */
public native void beginPath();

/**
 * Moves the starting point of a new sub-path to the (x, y) coordinates.
 */
public native void moveTo(double aX, double aY);

/**
 * Connects the last point in the subpath to the x, y coordinates with a straight line.
 */
public native void lineTo(double aX, double aY);

/**
 * Adds a cubic B?zier curve to the path.
 */
public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);

/**
 * Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line
 * from the current point to the start. If the shape has already been closed or has only one point,
 * this function does nothing.
 */
public native void closePath();

/**
 * Fills the subpaths with the current fill style.
 */
public native void fill();

/**
 * Strokes the subpaths with the current stroke style.
 */
public native void stroke();

/**
 * Creates a clipping path from the current sub-paths. Everything drawn after clip() is called appears inside the
 * clipping path only.
 */
public native void clip();

/**
 * Draws (fills) a given text at the given (x,y) position.
 */
public native void fillText(String aStr, double aX, double aY);

/**
 * Returns a TextMetrics object that contains information about the measured text
 */
public TextMetrics measureText(String aStr)
{
    TextMetrics tm = new TextMetrics();
    //tm._jso = measureTextJSO(aStr);
    return tm;
}

/**
 * Returns a TextMetrics object that contains information about the measured text
 */
native Object measureTextJSO(String aStr);

/**
 * Draws the specified image at the given (x,y) position.
 */
public native void drawImage(CanvasImageSource aImg, double aX, double aY);

/**
 * Draws the specified image at the given (x,y) position with given (w,h) size.
 */
public native void drawImage(CanvasImageSource aImg, double aX, double aY, double dW, double dH);

/**
 * Draws the specified rect of given image at the given position.
 */
public native void drawImage(CanvasImageSource aImg, double aX, double aY, double sW, double sH,
    double dX, double dY, double dW, double dH);

/**
 * Saves the current drawing style state using a stack so you can revert any change you make to it using restore().
 */
public native void save();

/**
 * Restores the drawing style state to the last element on the 'state stack' saved by save().
 */
public native void restore();

/**
 * Multiplies the current transformation matrix with the matrix described by its arguments.
 */
public native void transform(double a, double b, double c, double d, double e, double f);

/**
 * Resets the current transform to the identity matrix, and then invokes the transform() method with the same arguments.
 */
public native void setTransform(double a, double b, double c, double d, double e, double f);

/**
 * Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted by the
 * rectangle which starts at (sx, sy) and has an sw width and sh height.
 */
public ImageData getImageData(int aX, int aY, int aW, int aH)
{
    ImageData idata = new ImageData();
    //idata._jso = getImageDataJSO(aX, aY, aW, aH);
    return idata;
}

/**
 * Returns an ImageData object representing the underlying pixel data for the area of the canvas denoted by the
 * rectangle which starts at (sx, sy) and has an sw width and sh height.
 */
native ImageData getImageDataJSO(int aX, int aY, int aW, int aH);

/**
 * Sets the image smoothing mode; if disabled, images will not be smoothed if scaled.
 */
public native void setImageSmoothingEnabled(boolean aValue);

/**
 * Sets the quality of image smoothing ("low", "medium" or "high").
 */
public native void setImageSmoothingQuality(String aValue);

/**
 * Sets the ShadowBlur.
 */
public native void setShadowBlur(double aValue);

/**
 * Sets the ShadowColor.
 */
public native void setShadowColor(String aValue);

/**
 * Returns the filter.
 */
public native String getFilter();  //{ return getString(getFilterJSO()); }

/**
 * Returns the filter.
 */
native Object getFilterJSO();

/**
 * Returns the filter.
 */
public native String setFilter(String aFilter);

/**
 * Returns the type of compositing operation to apply when drawing new shapes.
 */
public native String getGlobalCompositeOperation();  //{ return getString(getGlobalCompositeOperationJSO()); }

/**
 * Returns the type of compositing operation to apply when drawing new shapes.
 */
native Object getGlobalCompositeOperationJSO();

/**
 * Sets the type of compositing operation to apply when drawing new shapes.
 */
public native String setGlobalCompositeOperation(String aType);

/**
 * Creates a gradient along the line given by the coordinates represented by the parameters
 */
public CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1)
{
    CanvasGradient cg = new CanvasGradient();
    //cg._jso = createLinearGradientJSO(x0,y0,x1,y1);
    return cg;
}

/**
 * Creates a gradient along the line given by the coordinates represented by the parameters
 */
native Object createLinearGradientJSO(double x0, double y0, double x1, double y1);

}