public class PrimaryState extends AbstractState{
  public PrimaryState(AbstractState state) {
    this.acc = state.acc;
    this.point = state.point;
    this.stateName = "新手";
  }

  public PrimaryState(ForcumAccount acc) {
    this.acc = acc;
    this.point = 0;
    this.stateName = "新手";
  }

  @Override
  public void downloadFile(int score) {
    System.out.println("对不起,"+acc.getName() + ",宁没有下载文件的权限!");
  }

  @Override
  public void checkState(int score) {
    if (point >=1000) {
      acc.setState(new HightState(this));
    }
    else if (point>=100) {
      acc.setState(new MiddleState(this));
    }
  }
}
