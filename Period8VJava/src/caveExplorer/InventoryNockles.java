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
	}

	public String getDescription() {
		if(hasMap) return map;
		else return "You have no inventory";
	}

}
