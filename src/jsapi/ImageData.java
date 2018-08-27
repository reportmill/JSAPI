package jsapi;

/**
 * ImageData represents the underlying pixel data of an area of a <canvas> element. It is created using the ImageData()
 * constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData()
 * and getImageData(). It can also be used to set a part of the canvas by using putImageData()..
 */
public class ImageData {

/**
 * Returns the data byte at given index.
 */
public native byte getData(int anIndex);

/**
 * Returns the data int at given index.
 */
public native int getDataInt(int anIndex);

}