package com.stx.dagger2Test.di;


import com.stx.dagger2Test.scope.UserScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @UserScope
    @Provides
    public DatabaseObject providerDatabaseObject() {
        return new DatabaseObject();
    }
}
