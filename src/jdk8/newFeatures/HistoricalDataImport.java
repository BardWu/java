package jdk8.newFeatures;


import java.util.List;
import java.util.Map;

/**
 * @program: innerplatform
 * @description:
 * @author: wuheng
 * @create: 2020-06-20 17:06
 **/

public class HistoricalDataImport {

    private List<String> keyList;

    private Map<String,String> map;

    private int index;

    public HistoricalDataImport(List<String> keyList, Map<String, String> map, int index) {
        this.keyList = keyList;
        this.map = map;
        this.index = index;
    }

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public String toString() {
        return "HistoricalDataImport{" +
                "keyList=" + keyList +
                ", map=" + map +
                ", index=" + index +
                '}';
    }

    public String[] toRow(){
        String[] strs = new String[keyList.size()+1];
        strs[0] = String.valueOf(++index);
        int j = 0;
        String item ;
        for(int i=0;i<keyList.size();i++){
            j = i+1;
            item = map.get(keyList.get(i));
            strs[j] = item == null?"":item;
        }
        return strs;
    }
}
