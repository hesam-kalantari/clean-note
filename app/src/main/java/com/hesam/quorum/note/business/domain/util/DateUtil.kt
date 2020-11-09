package com.hesam.quorum.note.business.domain.util

import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateUtil
@Inject
constructor(
    private val dateFormat: SimpleDateFormat
) {

    //date format: "2019-07-23 HH:mm:ss

    fun removeTimeFromDateString(sd: String): String {
        return sd.subSequence(0, sd.indexOf(" ")).toString()
    }

    fun convertFirebaseTimestampToStringDate(timestamp: Timestamp) : String {
        return dateFormat.format(timestamp.toDate())
    }

    fun convertStringDateToFirebaseTimestamp(sd: String) : Timestamp {
        return Timestamp(dateFormat.parse(sd))
    }

    fun getCurrentTimestamp() : String {
        return dateFormat.format(Date())
    }
}