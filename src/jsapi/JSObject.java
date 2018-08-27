package jsapi;

/**
 * A custom class.
 */
public class JSObject {

    // The console
    public static Console console;
    
    // The current document
    public static Document document;

    // The current window
    public static Window window;

/**
 * Run alert.
 */
public native static void alert(String aStr);

}