package com.github.wuxudong.rncharts;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.github.wuxudong.rncharts.charts.BarChartManager;
import com.github.wuxudong.rncharts.charts.BubbleChartManager;
import com.github.wuxudong.rncharts.charts.CandleStickChartManager;
import com.github.wuxudong.rncharts.charts.CombinedChartManager;
import com.github.wuxudong.rncharts.charts.HorizontalBarChartManager;
import com.github.wuxudong.rncharts.charts.LineChartManager;
import com.github.wuxudong.rncharts.charts.PieChartManager;
import com.github.wuxudong.rncharts.charts.RadarChartManager;
import com.github.wuxudong.rncharts.charts.ScatterChartManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MPAndroidChartPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new BarChartManager(reactContext),
                new HorizontalBarChartManager(reactContext),
                new BubbleChartManager(reactContext),
                new CandleStickChartManager(reactContext),
                new LineChartManager(reactContext),
                new PieChartManager(reactContext),
                new RadarChartManager(reactContext),
                new ScatterChartManager(reactContext),
                new CombinedChartManager(reactContext)
        );
    }

}
