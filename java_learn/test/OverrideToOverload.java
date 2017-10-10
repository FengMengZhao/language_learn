class SuperOverrideToOverload{

    public int count(int num){
        return num;
    }
}

public class OverrideToOverload extends SuperOverrideToOverload{

    public void count(int num){
    }
}
