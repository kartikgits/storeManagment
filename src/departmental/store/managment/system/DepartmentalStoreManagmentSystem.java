package departmental.store.managment.system;

import static departmental.store.managment.system.GUI.DEFAULT_UI;
import java.io.IOException;


public class DepartmentalStoreManagmentSystem {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
         Store UoGStore = new Store("Univerty of Gondar");
         Manager uogStoreManager = new Manager(UoGStore,"store.db");
         DEFAULT_UI=userInterface.GRAPHICAL;
        while(uogStoreManager.update()!=0);
    }
   
}