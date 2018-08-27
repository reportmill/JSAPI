package jsapi;

/**
 * The window object represents a window containing a DOM document.
 */
public class Window extends EventTarget {
    
    // The innerWidth
    public int innerWidth;
    
    // The inner Height
    public int innerHeight;
    
    // The current document
    public static Document   document;
    
    // The current window
    public static Window   window;

/** Returns the current window. */
/*public static Window current()  { Window win = new Window(); win._jso = currentJSO(); return win; }*/

/** Returns a reference to the document that the window contains. */
/*public Document getDocument()
{ if(_doc!=null) return _doc;_doc = new HTMLDocument(); _doc._jso = getDocumentJSO(); return _doc; }*/

/** Returns a reference to the document that the window contains. */
//native Object getDocumentJSO();

/** Returns the current window. */
//static native Object currentJSO();

/** Returns the width of the content area of the browser window including, if rendered, the vertical scrollbar. */
//public native int getInnerWidth();

/** Returns the width of the content area of the browser window including, if rendered, the vertical scrollbar. */
//public native int getInnerHeight();

/** Returns ratio of resolution in physical pixels to the resolution in CSS pixels for the current display device. */
//public native double getDevicePixelRatio();

/**
 * Loads the specified resource into the browsing context (window or tab) with the specified name. If the name doesn't
 * exist, then a new window is opened and the specified resource is loaded into its browsing context
 */
public Window open(String aURL, String aWinName)  { return open(aURL, aWinName); }

/**
 * Loads the specified resource into the browsing context (window or tab) with the specified name. If the name doesn't
 * exist, then a new window is opened and the specified resource is loaded into its browsing context
 */
public native Window open(String aURL, String aWinName, String theWinFeatures);
/*{
    Object win_jso = openJSO(aURL, aWinName, theWinFeatures);
    if(win_jso==null) return null;
    
    // Create new window and return
    Window win = new Window(); win._jso = win_jso; return win;
}*/

/** Loads the specified resource into the browsing context (window or tab) with the specified name. */
//public native Object openJSO(String aURL, String aWinName, String theWinFeatures);

/**
 * Schedules a function to execute every time a given number of milliseconds elapses. 
 */
public static native int setInterval(Runnable aFunc, int aDelay);

/**
 * Cancels the repeated execution set using setInterval(). 
 */
public static native void clearInterval(int anID);

/**
 * Schedules a function to execute in a given amount of time. 
 */
public static native int setTimeout(Runnable aFunc, int aDelay);

/**
 * Cancels the delayed execution set using setTimeout(). 
 */
public static native void clearTimeout(int anID);

}