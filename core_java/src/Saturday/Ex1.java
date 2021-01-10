package Saturday;

import java.util.ArrayList;

public class Ex1 {
public static void main(String[] args) {
	ArrayList obj = new ArrayList();
    obj.add("A");
    obj.add(0,"B");
    obj.add(1,"C");
    obj.add(1,"D");
    System.out.println(obj.size());
    System.out.println(obj);
}
}
