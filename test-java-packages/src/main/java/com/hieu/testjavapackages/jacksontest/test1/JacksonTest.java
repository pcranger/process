package com.hieu.testjavapackages.jacksontest.test1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JacksonTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //map
        HashMap<String, Object> mapobj = new HashMap<String, Object>();
        mapobj.put("name", "hieu");
        mapobj.put("age", "22");
            HashMap<String, Object> innermapobj = new HashMap<String, Object>();
            innermapobj.put("Java", 5);
            innermapobj.put("JavaScript", 4);
            innermapobj.put("Python", 2);

            HashMap<String, Object> innerpojoobj = new HashMap<String, Object>();
            innermapobj.put("university", "usth");
            innermapobj.put("company", Arrays.asList("inlab", "cmc"));
            innermapobj.put("certificate", Arrays.asList("microsoft office specialist", "IELTS"));
        mapobj.put("skills", innermapobj);
        mapobj.put("experience", innerpojoobj);



        //Map to ObjectNode
        ObjectNode objectNodecv = mapper.convertValue(mapobj, ObjectNode.class);
        Object objectcv = mapper.convertValue(mapobj, Object.class);    //works with object, but no one does this, only the opposite, more below



        //ObjectNode to Map
        Map<String, String> mapobjcv = mapper.convertValue(objectNodecv, Map.class);


        //objectNode to Json String
        String jsoncv = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectNodecv);
        System.out.println("map to objectnode " + jsoncv);

        //Json String to objectNode
        ObjectNode json = (ObjectNode) new ObjectMapper().readTree("{}");


        //ObjectNode to POJO


    }

}
