package com.ninghoo.beta.myapplication.WeiboModel;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-4.
 */

public class TokenList {
    public ArrayList<Token> tokenList = new ArrayList<Token>();
    public int total_number;
    public String current_uid;


    public static TokenList parse(String jsonString) {
        Gson gson = new Gson();
        TokenList tokenList = gson.fromJson(jsonString, TokenList.class);
        if (tokenList == null) {

        }
        return tokenList;
    }

}