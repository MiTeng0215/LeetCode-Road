class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> bigList = new ArrayList<>();
        int i;
        //迭代numRows次
        for(i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            //第一个元素直接是1,直接添加
            list.add(1);
            //根据上一层的数字计算下一层
            for(int j =1;j<i;j++){
                list.add(bigList.get(i-1).get(j-1)+bigList.get(i-1).get(j));
            }
            //如果没有上一层,直接continue
            if(i==0){
                bigList.add(list);
                continue;
            }
            //末尾再添上1
            list.add(1);
            //将小list加入到bigList中
            bigList.add(list);
        }
        return bigList;
    }
}
