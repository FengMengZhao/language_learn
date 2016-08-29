package org.fmz.awesome;

public class AssociativeArray<K, V>{

    private Object[][] pairs;
    private int index;

    public AssociativeArray(int len){
        pairs = new Object[len][2];
    }

    @SuppressWarnings("unchecked")
    public V put(K key, V value){
        if(index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();

        if(get(key) == null)
            pairs[index++] = new Object[]{key, value};
        
        for(int i = 0; i < index; i++){
            if(key.equals(pairs[i][0])){
                V res = (V)pairs[i][1];
                pairs[i][1] = value;
                value = res;
            }
        }
        return value;
    }

    @SuppressWarnings("unchecked")
    public V get(K key){
        for(int i = 0; i < index; i++)
            if(key.equals(pairs[i][0]))
                return (V)pairs[i][1];
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i = 0; i < index; i++){
            sb.append(pairs[i][0]);
            sb.append("=");
            sb.append(pairs[i][1]);
            sb.append(", ");
        }
        String res = sb.toString();
        return res.substring(0, res.length() - 2) + "}";
    }

    public static void main(String arg[]){
        AssociativeArray<String, String> map = new AssociativeArray<>(6);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("girl", "hot");
        map.put("man", "handsome");
        map.put("tree", "tall");
        map.put("sky", "blue");
        map.put("sky", "black");
        try{
            map.put("winter", "cold");
            map.put("summer", "hot");
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println(map);
    }
}
