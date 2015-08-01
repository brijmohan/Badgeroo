package cellar.badgeroo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Tab2 extends Fragment {
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2,container,false);

        ArrayList<FoodItem> listContact = GetFoodItems();
        ListView lv = (ListView) v.findViewById(R.id.sandwiches);
        lv.setAdapter(new FoodListAdapter(getActivity(), listContact));

        return v;
    }

    private ArrayList<FoodItem> GetFoodItems(){
        ArrayList<FoodItem> foodlist = new ArrayList<FoodItem>();

        FoodItem food = new FoodItem();

        food.setName("Chicken Sandwich");
        food.setPhotoUrl(R.mipmap.sandwich);
        food.setPrice(120.50);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Veg Sandwich");
        food.setPhotoUrl(R.mipmap.sandwich);
        food.setPrice(23.88);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Hash Sandwich");
        food.setPhotoUrl(R.mipmap.sandwich);
        food.setPrice(100.45);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Coleslaw Sandwich");
        food.setPhotoUrl(R.mipmap.sandwich);
        food.setPrice(30.45);
        foodlist.add(food);

        return foodlist;
    }
}