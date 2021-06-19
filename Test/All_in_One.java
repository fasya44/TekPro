package Test;

class All_in_One<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Robot;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setRobot(T Robot){
        this.Robot = Robot;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Robot
    protected T getRobot(){
        return Robot;
    }
}