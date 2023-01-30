package src;


import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandShowHumans<T extends Human> extends Command<T> {
  public CommandShowHumans(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    uc.showHumansFromTree(fts.getHumans());
  }

  @Override
  public String description() {
    return "Показать всех людей";
  }

}