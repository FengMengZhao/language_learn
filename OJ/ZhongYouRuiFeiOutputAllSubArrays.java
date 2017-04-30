import java.util.*;

public class ZhongYouRuiFeiOutputAllSubArrays{
    public List<List<Character>> outputAllSubArrays(List<Character> origin){
        List<List<Character>> res = new ArrayList<>();
        if(origin.isEmpty()){
            res.add(new ArrayList<Character>());
            return res;
        }
        Character head = origin.get(0);
        List<Character> rest = origin.subList(1, origin.size());
        for(List<Character> ls : outputAllSubArrays(rest)){
            List<Character> newList = new ArrayList<>();
            newList.add(head);
            newList.addAll(ls);
            res.add(newList);
            res.add(ls);
        }
        return res;
    }

    public static void main(String args[]){
        Character[] arr = new Character[8];
        for(int i = '1'; i < '1' + 8; i++)
            arr[i - '1'] = (char)i;
        List<Character> origin = new LinkedList<>(Arrays.asList(arr));
        List<List<Character>> res = new ZhongYouRuiFeiOutputAllSubArrays().outputAllSubArrays(origin);
        Collections.sort(res, new Comparator<List<Character>>(){
            public int compare(List<Character> one, List<Character> another){
                int tmp = one.size() - another.size();
                if(tmp != 0)
                    return tmp;
                int i = 0;
                while(one.get(i) - another.get(i) == 0) i++;
                return one.get(i) - another.get(i);
            }
        });
        for(List<Character> ls : res)
            System.out.print(ls + " ");
        System.out.println(res.size());
    }
}
