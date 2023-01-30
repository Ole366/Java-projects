package src;


import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandSave<T extends Human> extends Command<T> {
  public CommandSave(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    uc.saveAction(fts.save());
  }

  @Override
  public String description() {
    return "Сохранить текущее дерево в файл";
  }

}