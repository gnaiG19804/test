
  class exam{
    private question []dt;
    public exam(){
      this.dt=new question[20];
    }
    public question[] getDt() {
      return dt;
  }
    public void display(){
      for(int i=0;i<dt.length;i++){
        if(dt[i] != null){
          dt[i].display();
        }
      }
    }

    public int DKTB(){
      int dktb=0;
      int count=0;
      for(int i=0;i<dt.length;i++){
        if(dt[i]!=null){
          dktb+=dt[i].getDK();
          count++;
        }
      }
      return dktb/count;
    } 

    public String toString() {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < dt.length; i++) {
          if (dt[i] != null) {
              result.append("Câu ").append(i + 1).append(":\n");
              result.append(dt[i].toString()).append("\n");
          }
      }
      return result.toString();
  }
  }
