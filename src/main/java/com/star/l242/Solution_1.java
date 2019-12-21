package com.star.l242;

import java.util.HashMap;
import java.util.Map;

/**
 * @author star
 * @Date 2019/12/21.
 * @Description: No Description Yet.
 */
public class Solution_1 {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> sCharMap = parse(s);
    Map<Character, Integer> tCharMap = parse(t);
    if (!compareMap(sCharMap, tCharMap)) return false;
    if (!compareMap(tCharMap, sCharMap))  return false;
    return true;

  }

  public Map<Character, Integer> parse(String s){
    char[] sChars = s.toCharArray();
    Map<Character, Integer> res = new HashMap<>();
    for (char c :sChars){
      int cnt = res.getOrDefault(c, 0);
      res.put(c, ++cnt);
    }
    return res;
  }

  public boolean compareMap(Map<Character, Integer> map1, Map<Character, Integer> map2){
    for (Map.Entry<Character, Integer> entity:map1.entrySet()) {
      Character c = entity.getKey();
      int sCnt = entity.getValue();

      int tCnt = map2.getOrDefault(c, 0);
      if (sCnt != tCnt) {
        return false;
      }
    }
    return true;
  }
}
