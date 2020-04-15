package space.kroha.flagswithnewlibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import space.kroha.flagswithnewlibraries.JSONFromNetwork.NetworkUtils;

public class MainActivity extends AppCompatActivity {
    private static final String BASE_URL = "https://restcountries.eu/rest/v2/all";

    private TextView textViewResult;
    JSONArray jsonArrayNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.text_view_result);
        NetworkUtils.NetworkUtils(); //запускаем парсинг jsonarray с сети
    }
}


