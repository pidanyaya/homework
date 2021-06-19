package demo2;

public abstract class Builder {
  abstract Builder BuilderA(String msg);
  abstract Builder BuilderB(String msg);
  abstract Builder BuilderC(String msg);
  abstract Builder BuilderD(String msg);
  abstract Product getProduct();
}
