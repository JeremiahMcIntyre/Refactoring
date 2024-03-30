package q1.extract_method.refactored;

import java.util.List;


public class A {
   Node m1(List<Node> nodes, String p) {
      processList(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      processList(edgeList, p);
      return null;
   }

   private <T extends Graph> void processList(List<T> list, String p) {
       for (T element : list) {
           if (element.contains(p));
       }
   }
}

class Graph {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }

	}

	class Node extends Graph {
	}

	class Edge extends Graph {
	}