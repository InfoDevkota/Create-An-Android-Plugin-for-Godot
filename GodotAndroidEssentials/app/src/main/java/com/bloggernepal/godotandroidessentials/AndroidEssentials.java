package com.bloggernepal.godotandroidessentials;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

public class AndroidEssentials extends GodotPlugin {
    public AndroidEssentials(Godot godot) {
        super(godot);
        Log.i("godot", "Initialized");
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotAndroidEssentials";
    }

    @UsedByGodot
    public void showToast(String message, String duration) {
        Log.i("godot", "Showing Toast");
        final int durationInt = duration.equals("short") ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;

        getActivity().runOnUiThread(
                new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getActivity(), message, durationInt).show();
                    }
                });
    }
}