package exercise2;

import java.util.*;

public class Line {

	private String lineName;
	private int firstID;
	private int secondID;
	private Station firstStation;
	private Station secondStation;
	
	public Line(String lineName, int firstID, int secondID){
		this.lineName=lineName;
		this.firstID=firstID;
		this.secondID=secondID;
		this.firstStation = new Station();
		this.secondStation=new Station();
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public int getFirstID() {
		return firstID;
	}

	public void setFirstID(int firstID) {
		this.firstID = firstID;
	}

	public int getSecondID() {
		return secondID;
	}

	public void setSecondID(int secondID) {
		this.secondID = secondID;
	}
	
	public Station getFirstStation(){
		return firstStation;
	}//link two 
	
	public Station getSecondStation(){
		return secondStation;
	}
	
	
	public void setFirstStation(LinkedList<Station> Stations){
		for(Station s:Stations){
			if(s.getStationID()==this.firstID){
				this.firstStation=s;
			}
		}
	}	
	
	
	public void setSecondStation(LinkedList<Station> Stations){
		for(Station s:Stations){
			if(s.getStationID()==this.secondID){
				this.secondStation=s;
			}
		}
	}
	

}
