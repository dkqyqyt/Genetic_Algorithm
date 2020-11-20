package tsp;

public class GA {
	// GA 파라미터
	private static final double mutationRate = 0.015;
	private static final int tournamentSize = 5;
	private static final boolean elitism = true;

	// 진화
	public static Population evolvePopulation(Population pop) {
		Population newPopulation = new Population(pop.populationSize(),false);

		//가장 좋은 개체를 0번으로 설정
		int elitismOffset = 0;
		if(elitism) {
			newPopulation.saveTour(0, pop.getFittest());
			elitismOffset = 1;
		}

		//교차선택
		//다음세대 개체 생성
		for(int i = elitismOffset;i < newPopulation.populationSize();i++) {
			//부모 선택
			Tour parent1 = tournamentSelection(pop);
			Tour parent2 = tournamentSelection(pop);
			//crossover
			Tour child = crossover(parent1,parent2);
			//개체에 자식 추가
			newPopulation.saveTour(i, child);
		}

		//돌연변이(이전 세대에서 가장 좋은 개체를 제외)
		for(int i = elitismOffset;i<newPopulation.populationSize();i++) {
			mutate(newPopulation.getTour(i));
		}

		return newPopulation;


	}

	public static Tour crossover(Tour parent1,Tour parent2) {
		Tour child = new Tour();

		//첫번째 부모에서 떼낼 것
		int startPos = (int)(Math.random()*parent1.tourSize());
		int endPos = (int)(Math.random()*parent2.tourSize());

		for(int i = 0;i<child.tourSize();i++) {
			if(startPos<endPos && i > startPos && i <endPos) {
				child.setStation(i, parent1.getStation(i));
			}else if(startPos>endPos) {
				if(!(i<startPos && i > endPos)) {
					child.setStation(i, parent1.getStation(i));
				}
			}
		}

		//나머지는 두번째 부모에서 선택
		for(int i = 0;i<parent2.tourSize();i++) {
			if(!child.containsStation(parent2.getStation(i))) {
				for(int j = 0; j<child.tourSize();j++) {
					if(child.getStation(j) == null) {
						child.setStation(j, parent2.getStation(i));
						break;
					}
				}
			}
		}

		return child;
	}

	//돌연변이 생성
	private static void mutate(Tour tour) {
		for(int tourPos1 = 1; tourPos1 < tour.tourSize();tourPos1++) {
			//돌연변이 확률에 의한 계산 -> 1.5%
			if(Math.random()<mutationRate) {
				//교환할 루트
				int tourPos2 = (int)(tour.tourSize()*Math.random());
				
				if(tourPos2 == 0) continue;
				
				Station temp1 = tour.getStation(tourPos1);
				Station temp2 = tour.getStation(tourPos2);

				tour.setStation(tourPos2, temp1);
				tour.setStation(tourPos1, temp2);
			}
		}
	}

	//
	private static Tour tournamentSelection(Population pop) {
		Population tournament = new Population(tournamentSize,false);

		for(int i = 0;i <tournamentSize;i++) {
			int randomID = (int)(Math.random()*pop.populationSize());
			tournament.saveTour(i,pop.getTour(randomID));
		}

		Tour fittest = tournament.getFittest();
		return fittest;
	}
}
