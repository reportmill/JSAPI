package jsapi;

/**
 * HTMLCanvasElement provides properties and methods for manipulating the layout and presentation of canvas elements.
 */
public class HTMLCanvasElement extends HTMLElement implements CanvasImageSource {
    
    // The width
    public int width;
    
    // The height
    public int height;

/**
 * Returns the positive integer reflecting the width HTML attribute of the <canvas> element interpreted in CSS pixels.
 */
//public native int getWidth();

/**
 * Sets the positive integer reflecting the width HTML attribute of the <canvas> element interpreted in CSS pixels.
 */
//public native void setWidth(int aValue);

/**
 * Returns the positive integer reflecting the height HTML attribute of the <canvas> element interpreted in CSS pixels.
 */
//public native int getHeight();

/**
 * Sets the positive integer reflecting the height HTML attribute of the <canvas> element interpreted in CSS pixels.
 */
//public native void setHeight(int aValue);

/**
 * Sets the canavas width and height.
 */
//public void setSize(int aWidth, int aHeight)  { setWidth(aWidth); setHeight(aHeight); }

/**
 * Returns a drawing context on the canvas, or null if the context ID is not supported. A drawing context lets you
 * draw on the canvas. Calling getContext with "2d" returns a CanvasRenderingContext2D object, whereas calling it
 * with "experimental-webgl" (or "webgl") returns a WebGLRenderingContext object. This context is only available on
 * browsers that implement WebGL.
 */
public native Object getContext(String aName);
/*{
    // Create context JSO
    Object rc_jso = getContextJSO(aName);
    
    // Create Java context
    EventTarget rc = null;
    if(aName.equals("2d"))
        rc = new CanvasRenderingContext2D();

    // Set JSO and return
    rc._jso = rc_jso;        
    return rc;
}*/

/**
 * Returns a drawing context on the canvas.
 */
//native Object getContextJSO(String aName);

}