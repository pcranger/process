package com.hieu.testjavapackages.jacksontest.test2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JacksonTest2 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\n" +
                "\"users\": [\n" +
                "    {\n" +
                "        \"username\": \"johnSmith123\",\n" +
                "        \"email\": \"johnSmith123@gmail.com\",\n" +
                "        \"birthday\": \"1989-10-23\"\n" +
                "    }\n" +
                "]\n" +
                "}";
        //method 1: create user pojo:
        UsersHolder wrappedUsers1 = mapper.readValue(json, UsersHolder.class);
        System.out.println(wrappedUsers1.users);

        //method 2: convert to map then to pojo using typeReference
        TypeReference<Map<String, List<User>>> usersType = new TypeReference<Map<String, List<User>>>() {};
        Map<String, List<User>> wrappedUsers2 = mapper.readValue(json, usersType);
        List<User> users = wrappedUsers2.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(users);
    }
}
