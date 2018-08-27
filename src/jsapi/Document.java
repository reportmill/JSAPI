package jsapi;

/**
 * A custom class.
 */
public class Document extends Node {

    // The body element
    public HTMLBodyElement    body;

/**
 * Creates a new element.
 */
public native HTMLElement createElement(String aName);

}