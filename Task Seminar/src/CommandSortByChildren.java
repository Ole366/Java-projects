package src;



import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandSortByChildren<T extends Human> extends Command<T> {
  public CommandSortByChildren(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    uc.showSortedHumanList(fts.sortByNumberOfChildren());
  }

  @Override
  public String description() {
    return "Сортировка по количеству детей";
  }

}