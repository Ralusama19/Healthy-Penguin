package com.webs.asciipenguins.healthypenguin;

        import java.util.ArrayList;

        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Context;
        import android.view.Menu;

        import android.widget.ListView;

public class statsActivity extends Activity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={       R.drawable.water,   R.drawable.coke,   R.drawable.candy,    R.drawable.pizza,       R.drawable.apple,   R.drawable.beans,   R.drawable.vegetables,  R.drawable.egg, R.drawable.meat,R.drawable.fish,R.drawable.milk,R.drawable.bread,   R.drawable.pasta,   R.drawable.cereals, R.drawable.potato ,R.drawable.cheese, R.drawable.coffee, R.drawable.croissant, R.drawable.cake, R.drawable.wine};
    public static String [] prgmNameList={  "Agua",             "Refrescos",        "Dulces",           "Picsa",                "Fruta",            "Legumbres",        "Verduras",             "Huevos",       "Carne",        "Pescado",      "Leche"        ,     "Pan",              "Pasta",            "Cereales"        ,"Patatas"          ,"Queso"           ,"Café"           , "Pastas"            , "Pastel"       , "Vino"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats_layout);

        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}