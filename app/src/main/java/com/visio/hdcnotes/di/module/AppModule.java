package com.visio.hdcnotes.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.visio.hdcnotes.data.AppDataManager;
import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.data.local.db.AppDatabase;
import com.visio.hdcnotes.data.local.db.AppDatabseHelper;
import com.visio.hdcnotes.data.local.db.DbHelper;
import com.visio.hdcnotes.data.local.pref.AppPrefHelper;
import com.visio.hdcnotes.data.local.pref.PrefHelper;
import com.visio.hdcnotes.di.DatabaseInfo;
import com.visio.hdcnotes.di.PreferenceInfo;
import com.visio.hdcnotes.utils.AppConstants;
import com.visio.hdcnotes.utils.rx.AppSchedulerProvider;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context){
        return Room.databaseBuilder(context,AppDatabase.class,dbName).fallbackToDestructiveMigration().build();
    }

    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideAppDataBaseName(){
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDatabseHelper databseHelper){
        return databseHelper;
    }

    @Provides
    SchedulerProvider providesSchedularProvider(){
        return new AppSchedulerProvider();
    }

    @Provides
    @PreferenceInfo
    String provideAppPrefName(){
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PrefHelper provideAppPrefHelper(AppPrefHelper appPrefHelper){
        return appPrefHelper;
    }

    @Provides
    @Singleton
    Gson provideGson(){
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }
}
