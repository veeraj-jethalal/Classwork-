package caveExplorer;

public class InventoryNockles {

	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		hasMap = true;
		updateMap();
	}

	private void updateMap() {
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//create the top side
		map = " ";
		//horizontal line across top row width 4
		//except for the last one
		for(int i = 0; i < caves[0].length-1; i++){
			map += "____";
		}
		map+="___\n";
		//each room
		for(CaveRoomPd8[] row: caves){
			//There are three rows of text
			for(int textRow = 0; textRow < 3; textRow++){
				//The text is for each room	
			}
		}
	}

	public String getDescription() {
		if(hasMap) return map;
		else return "You have no inventory";
	}

}
