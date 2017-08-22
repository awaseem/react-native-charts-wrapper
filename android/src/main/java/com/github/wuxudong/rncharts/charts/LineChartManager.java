package com.github.wuxudong.rncharts.charts;


import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.wuxudong.rncharts.data.DataExtract;
import com.github.wuxudong.rncharts.data.LineDataExtract;
import com.github.wuxudong.rncharts.listener.RNOnChartValueSelectedListener;

public class LineChartManager extends BarLineChartBaseManager<LineChart, Entry> {

    private ReactApplicationContext m_reactContext;

    public LineChartManager(ReactApplicationContext reactContext) {
        super(reactContext);
        this.m_reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNLineChart";
    }

    @Override
    protected LineChart createViewInstance(ThemedReactContext reactContext) {
        LineChart lineChart =  new LineChart(reactContext);
        lineChart.setOnChartValueSelectedListener(new RNOnChartValueSelectedListener(lineChart));
        return lineChart;
    }

    @Override
    DataExtract getDataExtract() {
        return new LineDataExtract(m_reactContext);
    }
}
