package exercise2;

import java.util.*;

import javax.xml.soap.Node;


public class Station {
	
	private int stationID;
	private String stationName;
	private LinkedList<Line> adjacentLines= new LinkedList<Line>();;
	private LinkedList<Station> adjacentStations=new LinkedList<Station>();
	private boolean isVisited;
	

	public Station(){}
	public Station(int stationID, String stationName){
		this.stationID=stationID;
		this.stationName=stationName;
		//this.adjacentLines= new LinkedList<Line>();
		//this.adjacentStations=new LinkedList<Station>();
		this.isVisited=false;
	}


	public int getStationID() {
		return stationID;
	}


	public void setStationID(int stationID) {
		this.stationID = stationID;
	}


	public String getStationName() {
		return stationName;
	}


	public void setStationName(String stationName) {
		this.stationName = stationName;
	}


	public LinkedList<Line> getAdjacentLines() {
		return adjacentLines;
	}

	
	public LinkedList<Station> getAdjacentStations(){
		return adjacentStations;
	}

	
	public void addAdjacentLines(Line l) {
		this.adjacentLines.add(l);
	}
	
	
	public void addAdjacentStations(Station s){
		this.adjacentStations.add(s);
	}


	public boolean isVisited() {
		return isVisited;
	}


	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	

}
