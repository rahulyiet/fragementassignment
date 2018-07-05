package com.example.rahulyiet.fragmentassignment;

import android.hardware.camera2.params.BlackLevelPattern;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView Tab1,Tab2,Tab3;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Tab1=findViewById(R.id.Tab1);
        Tab2=findViewById(R.id.Tab2);
        Tab3=findViewById(R.id.Tab3);



//        Fragementone fragementone =new Fragementone();
//        Bundle bundle = new Bundle();
//        bundle.putString("Fragement1", String.valueOf(fragementone));
//        fragementone.setArguments(bundle);
//        FragementTwo fragementTwo=new FragementTwo();
//        bundle.putString("Fragement2", String.valueOf(fragementTwo));
//         fragementTwo.setArguments(bundle);

//         FragementThree fragementThree = new FragementThree();
//
//         bundle.putString("Fragement3",String.valueOf(FragementThree));
//         fragementThree.setArguments(bundle);

//
         fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.output,new Fragementone() ).commit();

        Tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.output,new Fragementone() ).commit();
                Tab1.setEnabled(false);
                Tab2.setEnabled(true);
                Tab3.setEnabled(true);

            }
        });

         Tab2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 fragmentManager.beginTransaction().replace(R.id.output,new FragementTwo()).commit();
                 Tab2.setEnabled(false);
                 Tab1.setEnabled(true);
                 Tab3.setEnabled(true);


             }
         });


          Tab3.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  fragmentManager.beginTransaction().replace(R.id.output,new FragementThree()).commit();
                  Tab3.setEnabled(false);
                  Tab1.setEnabled(true);
                  Tab2.setEnabled(true);
              }
          });
//        fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().add(R.id.output,new Fragementone() ).commit();
//
//        View.OnClickListener listener = new View.OnClickListener() {
//            public void onClick(View view) {
//                Fragment fragment=null;
//
//                if(view == findViewById(R.id.fragement1)){
//                   fragment=new Fragementone();
//                } else if
//                    (view == findViewById(R.id.fragement2)){
//                   fragment=new FragementTwo();
//
//                }else  {
//
//                     fragment=new FragementThree();
//
//
//
//                }
//                FragmentManager manager = getSupportFragmentManager();
//                        FragmentTransaction transaction = manager.beginTransaction();
//                        transaction.replace(R.id.output, fragment);
//                        transaction.commit();
//            }
//        };
//
//        Tab1.setOnClickListener(listener);
//
//        Tab2.setOnClickListener(listener);
//
//        Tab3.setOnClickListener(listener);
    }
}



