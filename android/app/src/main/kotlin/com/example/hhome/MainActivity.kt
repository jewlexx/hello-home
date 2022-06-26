package com.example.hhome

import io.flutter.embedding.android.FlutterActivity
import es.antonborri.home_widget.HomeWidgetPlugin


class MainActivity: FlutterActivity() {
}

abstract class Widget: HomeWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        onUpdate(context, appWidgetManager, appWidgetIds, HomeWidgetPlugin.getData(context))
    }

    abstract fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray, widgetData: SharedPreferences)

}