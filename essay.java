class essay extends question{
  private String dap_an;
  public essay(String cau_hoi,int do_kho,String dap_an){
    super(cau_hoi, do_kho);
    this.dap_an=dap_an;
  }
  public void display(){
    System.out.print(super.getCH()+"("+super.getDK()+")\n");
  }
  public String toString(){
    return super.getCH()+"("+super.getDK()+") dap an:"+dap_an+"\n";
  }
}