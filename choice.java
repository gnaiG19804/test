class choice {
  private String dap_an;
  private boolean dung_sai;
  public choice(String dap_an, boolean dung_sai){
    this.dap_an=dap_an;
    this.dung_sai=dung_sai;
  }
  public String getLC(){
    return dap_an;
  }
  public boolean getDS(){
    return dung_sai;
  }
}
