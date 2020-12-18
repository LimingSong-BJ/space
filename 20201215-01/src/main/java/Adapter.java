public class Adapter implements TargetI  {
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee= adaptee;
    }
    public boolean outputByBoolean() {
        String mark = adaptee.output();
        return "1".equals(mark)?true:false;
    }
}
