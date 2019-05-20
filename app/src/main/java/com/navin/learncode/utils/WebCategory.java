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
        categoryList.add(categoryModel);
/////////////////////////////////////////////////////////

        CategoryModel categoryModel2=new CategoryModel();
        categoryModel2.setImage(R.drawable.css);
        categoryModel2.setTitle("CSS");
        categoryList.add(categoryModel2);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel3=new CategoryModel();
        categoryModel3.setImage(R.drawable.js);
        categoryModel3.setTitle("JavaScript");
        categoryList.add(categoryModel3);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel4=new CategoryModel();
        categoryModel4.setImage(R.drawable.angularjs);
        categoryModel4.setTitle("AngularJs");
        categoryList.add(categoryModel4);
/////////////////////////////////////////////////////////
        CategoryModel categoryModel5=new CategoryModel();
        categoryModel5.setImage(R.drawable.bootstrap);
        categoryModel5.setTitle("Bootstrap");
        categoryList.add(categoryModel5);
/////////////////////////////////////////////////////////


return categoryList;



    }
    public static List<CategoryModel> getAllProgramming(){

        List<CategoryModel> categoryList=new ArrayList<>();

        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setTitle("C++");
        categoryModel.setImage(R.drawable.cplusplus);
        categoryList.add(categoryModel);

        //============================================

        CategoryModel categoryModel1 = new CategoryModel();
        categoryModel1.setTitle("Java");
        categoryModel1.setImage(R.drawable.java);
        categoryList.add(categoryModel1);
        //============================================

        CategoryModel categoryModel2 = new CategoryModel();
        categoryModel2.setTitle("Kotlin");
        categoryModel2.setImage(R.drawable.kotlin);
        categoryList.add(categoryModel2);
        //============================================

        CategoryModel categoryModel3 = new CategoryModel();
        categoryModel3.setTitle("C#");
        categoryModel3.setImage(R.drawable.csharp);
        categoryList.add(categoryModel3);
        //============================================

        CategoryModel categoryModel4 = new CategoryModel();
        categoryModel4.setTitle("Python 3");
        categoryModel4.setImage(R.drawable.python);
        categoryList.add(categoryModel4);
        //============================================

        CategoryModel categoryModel5 = new CategoryModel();
        categoryModel5.setTitle("Java Script");
        categoryModel5.setImage(R.drawable.js);
        categoryList.add(categoryModel5);
        //============================================

        CategoryModel categoryModel6 = new CategoryModel();
        categoryModel6.setTitle("C");
        categoryModel6.setImage(R.drawable.c);
        categoryList.add(categoryModel6);
        //============================================

        CategoryModel categoryModel7 = new CategoryModel();
        categoryModel7.setTitle("PHP");
        categoryModel7.setImage(R.drawable.php);
        categoryList.add(categoryModel7);
        //============================================

        CategoryModel categoryModel8 = new CategoryModel();
        categoryModel8.setTitle("Ruby");
        categoryModel8.setImage(R.drawable.ruby);
        categoryList.add(categoryModel8);


        return categoryList;
    }

    public static List<CategoryModel> getAllMobile(){

        List<CategoryModel> categoryList=new ArrayList<>();
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setImage(R.drawable.android);
        categoryModel.setTitle("Android");
        categoryList.add(categoryModel);
        //====================================
        CategoryModel categoryModel1=new CategoryModel();
        categoryModel1.setImage(R.drawable.swift);
        categoryModel1.setTitle("Swift");
        categoryList.add(categoryModel1);
        //============================================
        CategoryModel categoryModel2=new CategoryModel();
        categoryModel2.setTitle("Kotlin");
        categoryModel2.setImage(R.drawable.kotlin);
        categoryList.add(categoryModel2);
        //============================================
        CategoryModel categoryModel3=new CategoryModel();
        categoryModel3.setImage(R.drawable.react);
        categoryModel3.setTitle("React Native");
        categoryList.add(categoryModel3);
        return categoryList;
    }
}
