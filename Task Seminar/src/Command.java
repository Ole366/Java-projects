package src;



import src.Human;
import src.TreeFillData;
import src.UserCommunication;

public abstract class Command<T extends Human> implements Executable {
  protected TreeFillData<T> fts;
  protected UserCommunication<T> uc;

  public Command(TreeFillData<T> fts, UserCommunication<T> uc) {
    this.fts = fts;
    this.uc = uc;
  }

}