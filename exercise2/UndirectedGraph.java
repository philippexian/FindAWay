package exercise2;

import java.util.*;

import javax.xml.soap.Node;

public interface UndirectedGraph {

	public int getVexNum();
	
	public int getEdgeNum();
	
	public Iterator getVertex();
	
	public Iterator getEdge();
	
	public void remove(Station s);
	
	public void remove(Line e);
	
	public Node insert(Station s);
	
	public Node insert(Line e);
	
	public boolean areAjacent(Station s1, Station s2);
	
	public Iterator adjStations(Station s);
	
	
}
