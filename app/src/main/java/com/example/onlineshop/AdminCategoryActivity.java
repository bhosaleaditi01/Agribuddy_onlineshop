package com.example.onlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView fruits, egg, vegetables;
    private ImageView cowmilk, leafyvegetable, buffalomilk;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        fruits = (ImageView) findViewById(R.id.fruits);
        egg = (ImageView) findViewById(R.id.egg);
        vegetables = (ImageView) findViewById(R.id.vegetables);

        cowmilk = (ImageView) findViewById(R.id.cowmilk);
        leafyvegetable = (ImageView) findViewById(R.id.leafyvegetable);
        buffalomilk = (ImageView) findViewById(R.id.buffalomilk);



        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "fruits");
                startActivity(intent);
            }
        });


        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "egg");
                startActivity(intent);
            }
        });


        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "vegetables");
                startActivity(intent);
            }
        });


        cowmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "cowmilk");
                startActivity(intent);
            }
        });


        leafyvegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "leafyvegetable");
                startActivity(intent);
            }
        });


        buffalomilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "buffalomilk");
                startActivity(intent);
            }
        });


    }
}