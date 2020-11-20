package tsp;

import java.util.ArrayList;
import java.util.Collections;

public class Tour {
	private ArrayList tour = new ArrayList<Station>();

	//Cache
	private double fitness = 0;
	private double distance = 0;

	//빈 루트 생성
	public Tour() {
		for(int i = 0;i<TourManager.numberOfStations();i++) {
			tour.add(null);
		}
	}

	public Tour(ArrayList tour) {
		this.tour = tour;
	}

	public Station getStation(int tourPosition) {
		return (Station)tour.get(tourPosition);
	}

	public void setStation(int tourPosition,Station station) {
		tour.set(tourPosition, station);

		fitness = 0;
		distance = 0;
	}
	public void generateIndividual() {
		for(int stationIndex = 0;stationIndex < TourManager.numberOfStations();stationIndex++) {
			setStation(stationIndex,TourManager.getStation(stationIndex));			
		}

		Collections.shuffle(tour);
		
//		for(int i = 0;i<tour.size();i++) {
//			if(getStation(i).StationName == "서울시 공공자전거 상암센터") {
//				Station temp = getStation(i);
//				setStation(i,getStation(0));
//				setStation(0,temp);
//				break;
//			}
//		}
		
	}

	public double getFitness() {
		double firstFit  = 0;
		if(getStation(0).StationName == "서울시 공공자전거 상암센터") {
			firstFit = 2;
		}
		if(fitness == 0) {
			fitness = 1/(double)getDistance()+firstFit;
		}
		
		return fitness;
	}

	public double getDistance() {
		if(distance == 0) {
			double tourDistance = 0;

			for(int stationIndex = 0; stationIndex < tourSize();stationIndex++) {
				Station startStation = getStation(stationIndex);
				Station endStation;

				//종착지인지 아닌지
				if(stationIndex+1<tourSize()) {
					endStation = getStation(stationIndex+1);
				}else {
					endStation = getStation(stationIndex);
				}

				tourDistance += startStation.distanceTo(endStation);
			}

			distance = tourDistance;
		}

		return distance;
	}


	public int tourSize() {
		return tour.size();
	}

	public boolean containsStation(Station station) {
		return tour.contains(station);
	}
	
//	public String FirstSta() {
//		return getStation(0).StationName;
//	}
	
	public String toString() {
		String geneString = "";
		for(int i = 0;i<tourSize();i++) {
			geneString += getStation(i)+"\n";
		}

		return geneString;
	}

}
