package src;


import java.util.Map;

import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandSearch<T extends Human> extends Command<T> {
  public CommandSearch(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    Map.Entry<Integer, T> personWithId = fts.searchByName(uc.askFullName());
    uc.showMoreHumansInfo(personWithId);
  }

  @Override
  public String description() {
    return "Найти человека по имени и фамилии";
  }

}