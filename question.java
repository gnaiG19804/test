public abstract class question {
  private String cau_hoi;
  private int do_kho;
  public question(String cau_hoi,int do_kho){
    this.cau_hoi=cau_hoi;
    this.do_kho=do_kho;
  }
  public String getCH(){
    return cau_hoi;
  }
  public int getDK(){
    return do_kho;
  }
  public void setCH(String ch){
    this.cau_hoi=ch;
  }
  public void setDK(int dk){
    this.do_kho=dk;
  }
  public abstract void display();
}
