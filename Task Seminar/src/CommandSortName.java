package src;


import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandSortName<T extends Human> extends Command<T> {
  public CommandSortName(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    uc.showSortedHumanList(fts.sortByName());
  }

  @Override
  public String description() {
    return "Сортировка по имени";
  }
}