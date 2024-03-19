class multiple_choice extends question{
  private choice[] lua_chon;
  public multiple_choice(String cau_hoi,int do_kho,choice []lua_chon){
    super(cau_hoi, do_kho);
    this.lua_chon=lua_chon;
  }
  public void display(){
    System.out.println(super.getCH()+"("+super.getDK()+")");
    char s='A';
    for(int i=0;i<=3;i++){
      System.out.println(s+":"+lua_chon[i].getLC());
      s++;
    }
  }
public String toString(){
    StringBuilder result = new StringBuilder();
    result.append(super.getCH()).append(" (").append(super.getDK()).append(")\n");
    char choiceLabel = 'A';
    for(int i = 0; i <= 3; i++){
        result.append(choiceLabel).append(": ").append(lua_chon[i].getLC()).append("(").append(lua_chon[i].getDS()+")\n");
        choiceLabel++;
    }
    return result.toString();
  }
}