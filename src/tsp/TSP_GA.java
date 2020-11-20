package tsp;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
//import java.io.FileOutputStream;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
/**
 * @author 82106
 *
 */
public class TSP_GA {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 정류소 생성
		Station station = new Station(37.549561,126.905754,"(구)합정동 주민센터");
		TourManager.addStation(station);
		Station station2 = new Station(37.555649,126.910629,"망원역");
		TourManager.addStation(station2);
		Station station3 = new Station(37.550629,126.914986,"합정역");
		TourManager.addStation(station3);
		Station station4 = new Station(37.55751,126.918503,"신한은행 서교동금융센터 앞");
		TourManager.addStation(station4);
		Station station5 = new Station(37.552746,126.918617,"서교동 사거리");
		TourManager.addStation(station5);
		Station station6 = new Station(37.547871,126.923531,"상수역");
		TourManager.addStation(station6);
		Station station7 = new Station(37.549202,126.923203,"극동방송국 앞");
		TourManager.addStation(station7);
		Station station8 = new Station(37.557499,126.923805,"홍대입구역");
		TourManager.addStation(station8);
		Station station9 = new Station(37.547733,126.931763,"광흥창역");
		TourManager.addStation(station9);
		Station station10 = new Station(37.545284,126.931053,"서강나루공원");
		TourManager.addStation(station10);
		Station station11 = new Station(37.545242,126.934113,"신수동 사거리");
		TourManager.addStation(station11);
		Station station12 = new Station(37.549767,126.933174,"마포소방서 앞");
		TourManager.addStation(station12);
		Station station13 = new Station(37.547249,126.939293,"신성기사식당 앞");
		TourManager.addStation(station13);
		Station station14 = new Station(37.55114,126.936989,"서강대 정문 건너편");
		TourManager.addStation(station14);
		Station station15 = new Station(37.549484,126.93895,"서강대 남문 옆");
		TourManager.addStation(station15);
		Station station16 = new Station(37.550411,126.943848,"서강대 후문 옆");
		TourManager.addStation(station16);
		Station station17 = new Station(37.555054,126.937569,"신촌역");
		TourManager.addStation(station17);
		Station station18 = new Station(37.556004,126.942299,"대흥동 주민센터");
		TourManager.addStation(station18);
		Station station19 = new Station(37.557201,126.955666,"아현역");
		TourManager.addStation(station19);
		Station station20 = new Station(37.544579,126.950218,"공덕역");
		TourManager.addStation(station20);
		Station station21 = new Station(37.539936,126.945824,"마포역");
		TourManager.addStation(station21);
		Station station22 = new Station(37.542347,126.943024,"용강동 주민센터 앞");
		TourManager.addStation(station22);
		Station station23 = new Station(37.552956,126.934341,"서강대역");
		TourManager.addStation(station23);
		Station station24 = new Station(37.555687,126.905548,"망원1동주민센터");
		TourManager.addStation(station24);
		Station station25 = new Station(37.55661,126.898018,"마포구민체육센터 앞");
		TourManager.addStation(station25);
		Station station26 = new Station(37.564697,126.912613,"성산2교 사거리");
		TourManager.addStation(station26);
		Station station27 = new Station(37.560909,126.905495,"마포구청역");
		TourManager.addStation(station27);
		Station station28 = new Station(37.56855,126.914513,"가좌역");
		TourManager.addStation(station28);
		Station station29 = new Station(37.549904,126.955147,"서울서부지방법원 앞");
		TourManager.addStation(station29);
		Station station30 = new Station(37.553001,126.956688,"애오개역");
		TourManager.addStation(station30);
		Station station31 = new Station(37.568722,126.896225,"서울 월드컵경기장");
		TourManager.addStation(station31);
		Station station32 = new Station(37.551342,126.902672,"망원초록길 입구");
		TourManager.addStation(station32);
		Station station33 = new Station(37.565166,126.919395,"하늘채코오롱아파트 건너편");
		TourManager.addStation(station33);
		Station station34 = new Station(37.558949,126.907753,"SK망원동주유소 건너편");
		TourManager.addStation(station34);
		Station station35 = new Station(37.542545,126.934296,"마포 신수공원 앞");
		TourManager.addStation(station35);
		Station station36 = new Station(37.563965,126.898209,"월드컵 공원");
		TourManager.addStation(station36);
//		Station station37 = new Station(37.566845,126.896446,"서울 월드컵 경기장");
//		TourManager.addStation(station37);
		Station station38 = new Station(37.587524,126.883003,"상암한화오벨리스크 1차 앞");
		TourManager.addStation(station38);
		Station station39 = new Station(37.586189,126.881615,"상암월드컵파크 10단지 앞");
		TourManager.addStation(station39);
		Station station40 = new Station(37.58559,126.884727,"부엉이공원 앞");
		TourManager.addStation(station40);
		Station station41 = new Station(37.582657,126.885788,"DMC빌딩 앞");
		TourManager.addStation(station41);
		Station station42 = new Station(37.581314,126.880585,"상암월드컵파크 7단지 앞");
		TourManager.addStation(station42);
		Station station43= new Station(37.580631,126.883675,"마포구 육아종합지원센터");
		TourManager.addStation(station43);
		Station station44 = new Station(37.580811,126.88665,"LG CNS앞");
		TourManager.addStation(station44);
		Station station45 = new Station(37.579399,126.88916,"누리꿈스퀘어 앞");
		TourManager.addStation(station45);
		Station station46 = new Station(37.577496,126.887772,"상암중학교 옆");
		TourManager.addStation(station46);
		Station station47 = new Station(37.575802,126.890739,"DMC 산학협력연구센터 앞");
		TourManager.addStation(station47);
		Station station48 = new Station(37.571476,126.889687,"상암 월드컵파크 3단지 후문");
		TourManager.addStation(station48);
		Station station49 = new Station(37.57822,126.89447,"상암동주민센터 옆");
		TourManager.addStation(station49);
		Station station50 = new Station(37.577469,126.897362,"DMC역 9번출구");
		TourManager.addStation(station50);
		Station station51 = new Station(37.575665,126.894447,"상암월드컵파크 1단지 교차로");
		TourManager.addStation(station51);
		Station station52 = new Station(37.570721,126.898979,"월드컵경기장역");
		TourManager.addStation(station52);
		Station station53 = new Station(37.56842,126.899429,"홈플러스 앞");
		TourManager.addStation(station53);
		Station station54 = new Station(37.566246,126.896179,"서울시 공공자전거 상암센터");
		TourManager.addStation(station54);
		Station station55 = new Station(37.565903,126.901184,"마포구청 앞");
		TourManager.addStation(station55);
		Station station56 = new Station(37.569084,126.894424,"문화비축기지");
		TourManager.addStation(station56);
		Station station57 = new Station(37.57362,126.898048,"롯데하이마트(상암월드컵점)");
		TourManager.addStation(station57);
		Station station58 = new Station(37.584503,126.885597,"DMC첨단산업센터");
		TourManager.addStation(station58);
		Station station59 = new Station(37.549061,126.954178,"서울신용보증재단");
		TourManager.addStation(station59);
		Station station60 = new Station(37.569584,126.903816,"성산시영아파트");
		TourManager.addStation(station60);
		Station station61 = new Station(37.563339,126.908203,"마포중앙도서관");
		TourManager.addStation(station61);
		
//		ArrayList<Integer> StationNumber = new ArrayList<>();
//		ArrayList<String> StationName = new ArrayList<>();
//		ArrayList<Integer> Bike = new ArrayList<>();
//		ArrayList<Double> LAT = new ArrayList<>();
//		ArrayList<Double> LON = new ArrayList<>();
//		ArrayList<Integer> NEED = new ArrayList<>();
//		
//		//xlxs 불러오기
//		FileInputStream fis = new FileInputStream("C:/Users/82106/Desktop/Bike/seoulbike22.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		int rowindex = 0;
//		int columnindex = 0;
//		
//		//시트 읽기
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		//행의 수 
//		int rows = sheet.getPhysicalNumberOfRows();
//		for(rowindex = 1;rowindex<rows;rowindex++) {
//			//행 읽기
//			XSSFRow row = sheet.getRow(rowindex);
//			if(row != null) {
//				//셀의 수
//				int cells = row.getPhysicalNumberOfCells();
//				for(columnindex = 1;columnindex <= cells;columnindex++) {
//					//셀값읽기
//					XSSFCell cell = sheet.getRow(rowindex).getCell((short)columnindex);
//					String value = "";
//					double doubleValue = 0;
//					//셀이 빈칸일 경우
//					if(cell == null) {
//						continue;
//					}else {
//						switch(cell.getCellType()) {
//							case FORMULA:
//								value = cell.getCellFormula();
//								break;
//							case NUMERIC:
//								doubleValue = cell.getNumericCellValue();
//								break;
//							case STRING:
//								value = cell.getStringCellValue();
//								break;
//							case BLANK:
//								value = cell.getBooleanCellValue()+"";
//								break;
//							case ERROR:
//								value = cell.getErrorCellValue()+"";
//								break;
//							
//						}
//					}
//					
//					switch(columnindex) {
//						case 1:
//							StationNumber.add((int)doubleValue);
//							break;
//						case 2:
//							StationName.add(value);
//							break;
//						case 3:
//							Bike.add((int)doubleValue);
//							break;
//						case 4:
//							LAT.add(doubleValue);
//							break;
//						case 5:
//							LON.add(doubleValue);
//							break;
//						case 6:
//							NEED.add((int)doubleValue);
//							break;
//							
//					}
//				}
//			}			
//		}
//		for(int i = 0;i<NEED.size();i++) {
//			if(NEED.get(i) != 0) {
//				TourManager.addStation(new Station(LAT.get(i),LON.get(i),StationNumber.get(i),StationName.get(i),NEED.get(i)));
//			}
//		}
		

		//첫 개체 생성
		Population pop = new Population(50,true);
		
//		for(int i = 0;i<50;i++) {
//			System.out.println(pop.getTour(i).FirstSta());
//			
//		}
		
		System.out.println("Initial distance : " + pop.getFittest().getDistance());

		//100세대 진화 진행
		pop = GA.evolvePopulation(pop);
		for(int i = 0; i < 1000 ;i++) {
			pop = GA.evolvePopulation(pop);
		}

		System.out.println("Finished");
		System.out.println("Final distance : "+ pop.getFittest().getDistance());
		System.out.println("Solution : ");
		System.out.println(pop.getFittest());
		
		
//		String excelFile = "C:/Users/82106/Desktop/GA_Location/Location_station11.xlsx";
//		
//		int numofStation = TourManager.numberOfStations();
//		
//		XSSFWorkbook xlsWb = new XSSFWorkbook();
//		
//		XSSFSheet sheet1 = xlsWb.createSheet("sheet1");
//		
//		for(int i = 0;i<numofStation;i++) {
//			XSSFRow row1 = sheet1.createRow(i);
//			for(int j = 0;j<3;j++) {
//				XSSFCell cell = row1.createCell(j);
//				switch(j) {
//				case 0:
//					pop.getFittest().getStation(i).getName();
//					break;
//				case 1:
//					pop.getFittest().getStation(i).getX();
//					break;
//				case 2:
//					pop.getFittest().getStation(i).getY();
//					break;
//				}
//			}
//		}
//		
//		FileOutputStream fileOut = new FileOutputStream(excelFile);
//		fileOut.close();
		
		
		
	}

}
