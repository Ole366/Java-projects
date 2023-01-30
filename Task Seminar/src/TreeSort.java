package src;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import src.FamilyTree;
import src.Human;
import src.HumanComparatorChildCount;

public class TreeSort<T extends Human> extends TreeAction<T> {
  List<T> humanList;

  public TreeSort(FamilyTree<T> tree) {
    super(tree);
  }

  protected void fillHumanList() {
    humanList = new ArrayList<T>(tree.getHumans().values());
  }

  public List<T> byName() {
    fillHumanList();
    Collections.sort(humanList);
    return humanList;
  }

  public List<T> byNumberOfChildren() {
    fillHumanList();
    Collections.sort(humanList, new HumanComparatorChildCount());
    return humanList;
  }

}