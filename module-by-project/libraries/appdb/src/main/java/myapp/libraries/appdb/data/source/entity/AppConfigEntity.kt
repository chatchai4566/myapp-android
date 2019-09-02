package myapp.libraries.appdb.data.source.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "AppConfig")
data class AppConfigEntity(
    @ColumnInfo(name = "Title") var Title: String,
    @ColumnInfo(name = "Description") var Description: String,
    @PrimaryKey @ColumnInfo(name = "Id") var Id: String = UUID.randomUUID().toString()
) {


}