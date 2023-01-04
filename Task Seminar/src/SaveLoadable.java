package src;

import java.io.Serializable;

import src.FamilyTree;
import src.Human;

public interface SaveLoadable {
  void save(Serializable serializable);

  FamilyTree<? extends Human> load(String path);

  FamilyTree<? extends Human> load();
}