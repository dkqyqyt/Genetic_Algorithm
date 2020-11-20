package tsp;

//������ Ŭ����

public class Station {

	private static double d2r = Math.PI / 180;
	double x,y;
	double StationNum;
	String StationName = ".";
	int need;
	//������ ������
	public Station(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Station(double x, double y, String stationName) {
		this.x = x;
		this.y = y;
		this.StationName = stationName;
	}
	
	public Station(double x, double y,double stationNum, String stationName,int need) {
		this.x = x;
		this.y = y;
		this.StationNum = stationNum;
		this.StationName = stationName;
		this.need = need;
	}

	//������ x ����
	public double getX() {
		return this.x;
	}

	//������ y ����
	public double getY() {
		return this.y;
	}
	
	public String getName() {
		return this.StationName;
	}
	//�ٸ������ҿ��� �Ÿ����
	public double distanceTo(Station station) {
		double dStartPointLon = x;
		double dStartPointLat = y;
		double dEndPointLon = station.x;
		double dEndPointLat = station.y;
		
		double dLon = (dEndPointLon - dStartPointLon) * d2r;
		double dLat = (dEndPointLat - dStartPointLat) * d2r;

		double a = Math.pow(Math.sin(dLat / 2.0), 2)
				+ Math.cos(dStartPointLat * d2r)
				* Math.cos(dEndPointLat * d2r)
				* Math.pow(Math.sin(dLon / 2.0), 2);

		double c = Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)) * 2;

		double distance = c * 6378;

		return distance;
		
//		double xDistance = this.x - station.getX();
//		double yDistance = this.y - station.getY();
//		
//		double distance = Math.sqrt(Math.pow(xDistance, 2)+Math.pow(yDistance,2));
//		return distance;
	}

	public String toString() {
//		String st = Double.toString(StationNum);
		String st = StationName;
//		st += ","+x+","+y+","+need;
		st+=", "+need;
		return st;
	}
	
}

