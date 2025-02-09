package com.co.choucair.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class BuyLombokData {
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;

    public static List<BuyLombokData> setData(DataTable table){
        List<BuyLombokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for(Map<String, String>map : mapInfo){
            data.add(new ObjectMapper().convertValue(map, BuyLombokData.class));
        }

        return data;
    }

}
