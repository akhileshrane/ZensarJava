package com.Akhilesh.Train;
import java.util.*;


public class Test {
	/*Display method:
	 * 
	 */
	public static void displayMapOfTrains(Map<Integer,Train> mapOfTrains) {
		Set <Integer> setOfKeys = mapOfTrains.keySet();
		for(Integer key : setOfKeys) {
			Train trainKey= mapOfTrains.get(key);
			System.out.println(trainKey);
		}
	}
	
	/*Get the trains which start at the given station:
	 * 
	 */
	public  Map<Integer , Train> findTrainsStartingFrom (Map<Integer,Train> mapOfTrains,String string){
		Map <Integer,Train> searchResult = new HashMap<Integer,Train>();
		Set <Integer> setOfKeys = mapOfTrains.keySet();
			for(Integer key : setOfKeys) {
				Train trainKey= mapOfTrains.get(key);
			if(trainKey.getStartingStation().equals(string)){					
				searchResult.put(key,trainKey);			
			}			
		}		
		return searchResult;
	}
	/*Get the trains which end at the given station:
	 * 
	 */
	public  Map<Integer , Train> findTrainsEndingAt (Map<Integer,Train> mapOfTrains,String string){
		Map <Integer,Train> searchResult = new HashMap<Integer,Train>();
		Set <Integer> setOfKeys = mapOfTrains.keySet();
			for(Integer key : setOfKeys) {
				Train trainKey= mapOfTrains.get(key);
			if(trainKey.getEndingStation().equals(string)){					
				searchResult.put(key,trainKey);			
			}			
		}		
		return searchResult;
	}
	
	
	public static void main(String[] args) {
		Map<Integer,Train> mapOfTrains= new HashMap<Integer, Train>();
		Train train=new Train(11,"Shatabdi","Mumbai","Delhi");
		Train train1=new Train(99, "Modi Express", "Pune", "Gujrat");
		Train train2=new Train(15, "Chennai Express", "Delhi", "Chennai");
		Train train3=new Train(19, "Rajdhani", "Mumbai", "Ahemdabad");
		Train train4=new Train(12, "Express", "Pune", "Delhi");
		
		mapOfTrains.put(train.getTrainid(),train);
		mapOfTrains.put(train1.getTrainid(),train1);
		mapOfTrains.put(train2.getTrainid(),train2);
		mapOfTrains.put(train3.getTrainid(),train3);
		mapOfTrains.put(train4.getTrainid(),train4);
		//displayMapOfTrains(mapOfTrains);
		Test test=new Test();
		Map <Integer,Train> station=test.findTrainsStartingFrom(mapOfTrains,"Pune");
		Map <Integer,Train> station1=test.findTrainsEndingAt(mapOfTrains,"Delhi");
		//displayMapOfTrains(station);
		displayMapOfTrains(station1);
	}

}
