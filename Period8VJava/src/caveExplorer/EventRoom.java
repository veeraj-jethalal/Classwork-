package caveExplorer;

public class EventRoom extends CaveRoomPd8 {

	private boolean eventHappened;
	private Playable event;
	
	public EventRoom(String description, Playable event) {
		super(description);
		eventHappened = false;
		this.event = event;
	}

	public void enter(){
		super.enter();
		if(!eventHappened){
			eventHappened = true;
			event.play();
		}
	}
}
