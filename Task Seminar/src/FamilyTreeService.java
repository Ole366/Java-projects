package src;

import src.FamilyTree;
import src.Human;

public class FamilyTreeService<T extends Human> {
  private FamilyTree<T> familyTree;

  public FamilyTreeService(FamilyTree<T> familyTree) {
    this.familyTree = familyTree;
  }

}
