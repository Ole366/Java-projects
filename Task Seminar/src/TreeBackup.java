package src;


import java.util.HashMap;
import java.util.Map;

import src.FamilyTree;
import src.Human;

public class TreeBackup<T extends Human> extends TreeAction<T> {
  private Map<Integer, T> backup = new HashMap<Integer, T>();

  public TreeBackup(FamilyTree<T> tree) {
    super(tree);
  }

  public void create() {
    backup.putAll(tree.getHumans());
  }

  public void restore() {
    tree.getHumans().putAll(backup);
  }
}