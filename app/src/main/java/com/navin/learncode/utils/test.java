package com.navin.learncode.utils;

import com.navin.learncode.R;
import com.navin.learncode.model.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static List<CategoryModel> getAllProducts() {

        List<CategoryModel> storeList = new ArrayList<>();

        CategoryModel store = new CategoryModel();

     store.setTitle("tst");
     store.setImage(R.drawable.html);


        storeList.add(store);

        //--------------------------------------
        CategoryModel store1 = new CategoryModel();
        store.setTitle("tst");
        store.setImage(R.drawable.angularjs);


        storeList.add(store1);


        //--------------------------------------
        CategoryModel store3 = new CategoryModel();
        store.setTitle("tst");
        store.setImage(R.drawable.css);

        storeList.add(store3);


        return storeList;
    }
}
