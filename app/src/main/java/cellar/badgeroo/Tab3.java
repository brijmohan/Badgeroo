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
public class Tab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_3,container,false);

        ArrayList<FoodItem> listContact = GetFoodItems();
        ListView lv = (ListView) v.findViewById(R.id.combos);
        lv.setAdapter(new FoodListAdapter(getActivity(), listContact));

        return v;
    }

    private ArrayList<FoodItem> GetFoodItems(){
        ArrayList<FoodItem> foodlist = new ArrayList<FoodItem>();

        FoodItem food = new FoodItem();

        food.setName("Chicken + Coke");
        food.setPhotoUrl(R.mipmap.combo);
        food.setPrice(120.50);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Veg + Orange Juice");
        food.setPhotoUrl(R.mipmap.combo);
        food.setPrice(23.88);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Ganja + Chocolate Milkshake");
        food.setPhotoUrl(R.mipmap.combo);
        food.setPrice(100.45);
        foodlist.add(food);

        food = new FoodItem();
        food.setName("Mango + Cheese Mayo Special");
        food.setPhotoUrl(R.mipmap.combo);
        food.setPrice(30.45);
        foodlist.add(food);

        return foodlist;
    }
}
