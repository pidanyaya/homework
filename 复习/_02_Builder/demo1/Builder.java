package demo1;

public abstract class Builder {
  abstract void BuilderA();//地基
  abstract void BuilderB();//钢筋水泥
  abstract void BuilderC();//铺电线
  abstract void BuilderD();//粉刷

  abstract Product getProduct();
}
