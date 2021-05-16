package com.zzl.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaozhonglong
 * @version 1.0.0
 * @date 2021/5/5 8:47 下午
 */
@RestController
public class Test {

    @RequestMapping("/hello")
    public Object home() {
        Map<String, String> map = new HashMap();
        map.put("content", "hello docker!!!");
        return map;
    }
}
