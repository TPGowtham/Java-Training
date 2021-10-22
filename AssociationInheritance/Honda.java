package AssociationInheritance;

public class Honda extends Car {
	
	public void hondaStartEngine() {
		
		CarEngine hondaCarEngine = new CarEngine();
		hondaCarEngine.engineStarts();		
	}
	public void hondaMusicPlayer() {
		
		MusicPlayer hondaPlayer = new MusicPlayer();
		hondaPlayer.carMusicPlayer();
	}

}
