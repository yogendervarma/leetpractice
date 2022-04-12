class Solution {
    public String[] findWords(String[] words) {
        
        int l = words.length;
        List<String> ret = new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            String current = words[i];
            if(onlyfirstline(current.toLowerCase()) || onlysecondline(current.toLowerCase()) || onlythirdline(current.toLowerCase()))
                ret.add(current);
        }
        String[] itemsArray = new String[ret.size()];
        itemsArray = ret.toArray(itemsArray);
        return itemsArray;   
    }
    public static Boolean onlyfirstline(String s)
    {
        Character[] alphabet = {'q','w','e','r','t','y','u','i','o','p'};
List<Character> array = new ArrayList<Character>();
array.addAll(Arrays.asList(alphabet));
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            if(!array.contains(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static Boolean onlysecondline(String s)
    {
        Character[] alphabet = {'a','s','d','f','g','h','j','k','l'};
List<Character> array = new ArrayList<Character>();
array.addAll(Arrays.asList(alphabet));
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            if(!array.contains(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static Boolean onlythirdline(String s)
    {
        Character[] alphabet = {'z','x','c','v','b','n','m'};
List<Character> array = new ArrayList<Character>();
array.addAll(Arrays.asList(alphabet));
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            if(!array.contains(s.charAt(i)))
                return false;
        }
        return true;
    }
}
