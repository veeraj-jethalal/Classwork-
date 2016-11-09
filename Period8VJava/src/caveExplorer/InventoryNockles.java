package caveExplorer;

public class InventoryNockles {

	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		hasMap = false;
		updateMap();
	}

	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}

	void updateMap() {
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
				for(CaveRoomPd8 cr : row){
					String str = "|   ";
					String contents = cr.getContents();
					
					if(textRow == 1){
						if(cr.getDoor(CaveRoomPd8.WEST) != null &&
								cr.getDoor(CaveRoomPd8.WEST).isOpen()){
							str = "  " + contents + " ";
						}
						else{
							str = "| " + contents + " ";
						}
					}
					else if(textRow == 2){
						if(cr.getDoor(CaveRoomPd8.SOUTH) != null &&
								cr.getDoor(CaveRoomPd8.SOUTH).isOpen()){
							str = "|_ _";
						}
						else{
							str ="|___";
						}
					}
				map+= str;
				}//end of row of cave rooms
				map+="|\n";
			}
		}
	}

	public String getDescription() {
		if(hasMap) return map;
		else return "You have no inventory";
	}
}
