package src;


import src.FamilyTree;
import src.Human;
import src.TreeFirstFill;

public class Program {
  public static void main(String[] args) {
    FamilyTree<Human> familyTree = new FamilyTree<Human>();
    new TreeFirstFill(familyTree);
    Controller<Human> control = new Controller(familyTree);

    while (control.getControllerStatus()) {
      control.startControl();
    }
  }

}

