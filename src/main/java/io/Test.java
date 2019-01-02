package io;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String url = "http://bim-model-dev.oss-cn-hangzhou.aliyuncs.com/bim/destModel/d6a0bc6aae58000/Resource/____/3D/3D.svf";
        //url.substring("d6a0bc6aae58000",url.length())
        String array = "[\"cebe3681fb85001\",\"85a17cb5a787000\"]";
        System.out.println(array.toCharArray());
        String charSequence = array.subSequence(1, array.length() - 1).toString();
        System.out.println(charSequence);
        String[] split = charSequence.split(",");
        System.out.println(split[0]);
        String id = split[0].subSequence(1, split[0].length() - 1).toString();
        System.out.println(id);

        List<String> strings = JSONArray.parseArray(array, String.class);
        System.out.println(strings);

    }
}
