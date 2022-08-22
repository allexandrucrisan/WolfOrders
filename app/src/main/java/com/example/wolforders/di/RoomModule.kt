package com.example.wolforders.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.wolforders.data.model.entity.WolfOrder
import com.example.wolforders.data.repository.room.OrderDao
import org.koin.dsl.module

val roomModule = module {
    single { provideDatabaseInstance(get()) }
    single { provideProjectDao(get()) }
}

private object DatabaseProperties {
    const val DATABASE_VERSION = 1
}

private fun provideDatabaseInstance(applicationContext: Context): AppDatabase {
    return AppDatabase.getAppDataBase(applicationContext)
}

private fun provideProjectDao(appDatabase: AppDatabase): OrderDao {
    return appDatabase.projectDao()
}

@Database(
    entities = [WolfOrder::class],
    version = DatabaseProperties.DATABASE_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun projectDao(): OrderDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room
                        .databaseBuilder(
                            context.applicationContext,
                            AppDatabase::class.java,
                            "qbuzzDB"
                        )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}