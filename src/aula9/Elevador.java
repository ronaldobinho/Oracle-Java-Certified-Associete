package aula9;

public class Elevador {
	private boolean doorOpen = false;
	private int currentFloor = 10;
	private final int topFloor = 10;
	private final int bottomFloor = 1;

	private void openDoor() {
		System.out.println("Abrindo as portas");
		doorOpen = true;
		System.out.println("Porta Aberta");

	}

	private void closeDoor() {

		System.out.println("Closing door");
		doorOpen = false;
		System.out.println("Door is closed");
	}

   private void goUp(){
	   System.out.println("Going Up");
	   currentFloor++;
	   System.out.println("Current Floor : " + currentFloor);
	   
   }
   
   private void goDown(){
	   System.out.println("Going Down");
	   currentFloor--;
	   System.out.println("Current Floor : "+ currentFloor);	   
   }
   
   
   public void setFloor (int desiredFlor){
	   while(currentFloor != desiredFlor){
		   if(currentFloor < desiredFlor){
			   goUp();
		   }else {
			goDown();
		} 
			  
		   
	   }openDoor();
	   
	   
   }
}
