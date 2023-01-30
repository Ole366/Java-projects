package src;


import src.FamilyTree;
import src.Human;

public abstract class TreeAction<T extends Human> {
  protected FamilyTree<T> tree;

  public TreeAction(FamilyTree<T> tree) {
    this.tree = tree;
  }
}