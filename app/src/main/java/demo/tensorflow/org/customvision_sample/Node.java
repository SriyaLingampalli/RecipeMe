package demo.tensorflow.org.customvision_sample;

/**
 * Created by Emily on 2/18/2018.
 */

public class Node {
    public String id;
    public demo.tensorflow.org.customvision_sample.Node next;

    public Node(String idText) {
        id = idText;
        next = null;
    }
}