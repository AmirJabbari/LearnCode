package com.navin.learncode.utils;

import com.navin.learncode.R;
import com.navin.learncode.model.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class WebCategory {


    public  List<CategoryModel> getAllWebCategory(){

        List<CategoryModel> categoryList=new ArrayList<>();


        categoryList.clear();
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setImage(R.drawable.html);
        categoryModel.setTitle("HTML");
        categoryModel.setId("1");
        categoryList.add(categoryModel);
/////////////////////////////////////////////////////////

        CategoryModel categoryModel2=new CategoryModel();
        categoryModel2.setImage(R.drawable.css);
        categoryModel2.setTitle("CSS");
        categoryModel2.setId("2");

        categoryList.add(categoryModel2);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel3=new CategoryModel();
        categoryModel3.setImage(R.drawable.js);
        categoryModel3.setTitle("JavaScript");
        categoryModel3.setId("3");
        categoryList.add(categoryModel3);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel4=new CategoryModel();
        categoryModel4.setImage(R.drawable.angularjs);
        categoryModel4.setTitle("AngularJs");
        categoryModel4.setId("4");
        categoryList.add(categoryModel4);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel5=new CategoryModel();
        categoryModel5.setImage(R.drawable.bootstrap);
        categoryModel5.setTitle("Bootstrap");
        categoryModel5.setId("5");

        categoryList.add(categoryModel5);
/////////////////////////////////////////////////////////


return categoryList;



    }
    public static List<CategoryModel> getAllProgramming(){

        List<CategoryModel> categoryList=new ArrayList<>();

        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setTitle("C++");
        categoryModel.setId("10");
        categoryModel.setImage(R.drawable.cplusplus);
        categoryList.add(categoryModel);

        //============================================

        CategoryModel categoryModel1 = new CategoryModel();
        categoryModel1.setTitle("Java");
        categoryModel1.setImage(R.drawable.java);
        categoryModel1.setId("11");
        categoryList.add(categoryModel1);
        //============================================

        CategoryModel categoryModel2 = new CategoryModel();
        categoryModel2.setTitle("Kotlin");
        categoryModel2.setImage(R.drawable.kotlin);
        categoryModel2.setId("8");
        categoryList.add(categoryModel2);
        //============================================

        CategoryModel categoryModel3 = new CategoryModel();
        categoryModel3.setTitle("C#");
        categoryModel3.setImage(R.drawable.csharp);
        categoryModel3.setId("12");
        categoryList.add(categoryModel3);
        //============================================

        CategoryModel categoryModel4 = new CategoryModel();
        categoryModel4.setTitle("Python 3");
        categoryModel4.setImage(R.drawable.python);
        categoryModel4.setId("13");
        categoryList.add(categoryModel4);
        //============================================

        CategoryModel categoryModel5 = new CategoryModel();
        categoryModel5.setTitle("Java Script");
        categoryModel5.setImage(R.drawable.js);
        categoryModel5.setId("3");
        categoryList.add(categoryModel5);
        //============================================

        CategoryModel categoryModel6 = new CategoryModel();
        categoryModel6.setTitle("C");
        categoryModel6.setImage(R.drawable.c);
        categoryModel6.setId("14");
        categoryList.add(categoryModel6);
        //============================================

        CategoryModel categoryModel7 = new CategoryModel();
        categoryModel7.setTitle("PHP");
        categoryModel7.setImage(R.drawable.php);
        categoryModel7.setId("15");
        categoryList.add(categoryModel7);
        //============================================

        CategoryModel categoryModel8 = new CategoryModel();
        categoryModel8.setTitle("Ruby");
        categoryModel8.setImage(R.drawable.ruby);
        categoryModel8.setId("16");
        categoryList.add(categoryModel8);


        return categoryList;
    }

    public static List<CategoryModel> getAllMobile(){

        List<CategoryModel> categoryList=new ArrayList<>();
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setImage(R.drawable.android);
        categoryModel.setTitle("Android");
        categoryModel.setId("6");
        categoryList.add(categoryModel);
        //====================================
        CategoryModel categoryModel1=new CategoryModel();
        categoryModel1.setImage(R.drawable.swift);
        categoryModel1.setTitle("Swift");
        categoryModel1.setId("7");
        categoryList.add(categoryModel1);
        //============================================
        CategoryModel categoryModel2=new CategoryModel();
        categoryModel2.setTitle("Kotlin");
        categoryModel2.setImage(R.drawable.kotlin);
        categoryModel2.setId("8");
        categoryList.add(categoryModel2);
        //============================================
        CategoryModel categoryModel3=new CategoryModel();
        categoryModel3.setImage(R.drawable.react);
        categoryModel3.setTitle("React Native");
        categoryModel3.setId("9");

        categoryList.add(categoryModel3);
        return categoryList;
    }
}
