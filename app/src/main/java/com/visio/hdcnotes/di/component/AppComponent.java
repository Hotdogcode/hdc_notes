package com.visio.hdcnotes.di.component;

import android.app.Application;

import com.visio.hdcnotes.HDCNotes;
import com.visio.hdcnotes.di.builder.ActivityBuilder;
import com.visio.hdcnotes.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {
    void inject(HDCNotes hdcNotes);
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }
}
