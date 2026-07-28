class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int oc=0;
        int cc = 0;
        find_answer(n,oc,cc,list,str);
        return list;
    }
    public static void find_answer(int n , int oc, int cc, ArrayList<String> list , StringBuilder str){
        // this is over condition 
        if(oc==n && cc == n){
            // perform some task lets understand 
            list.add(str.toString());
            return;
        }
        if(oc>n || cc>n){
            return ;
        }
        if(oc<n){
            str.append("(");
            find_answer(n,oc+1,cc,list,str);
            str.deleteCharAt(str.length()-1);
        }
        if(oc>=1&&cc<oc){
            str.append(")");
            find_answer(n,oc,cc+1,list,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
