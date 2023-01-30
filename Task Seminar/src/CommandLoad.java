package src;


import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public class CommandLoad<T extends Human> extends Command<T> {
  public CommandLoad(TreeFillData<T> fts, UserCommunication<T> uc) {
    super(fts, uc);
  }

  @Override
  public void execute() {
    fts.createBackup();
    fts.clearTree();
    boolean success = fts.load();
    uc.loadAction(success);
    if (!success)
      fts.restoreBackup();
  }

  @Override
  public String description() {
    return "Загрузить дерево из файла";
  }

}