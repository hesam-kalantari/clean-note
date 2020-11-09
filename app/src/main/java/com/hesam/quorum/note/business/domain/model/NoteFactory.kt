package com.hesam.quorum.note.business.domain.model

import com.hesam.quorum.note.business.domain.util.DateUtil
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class NoteFactory
@Inject
constructor(private val dateUtil: DateUtil) {

    fun createSingleNote(
        id: String? = null,
        title: String,
        body: String? = null
    ): Note {
        return Note(
            id = id ?: UUID.randomUUID().toString(),
            title = title,
            body = body ?: "",
            created_at = dateUtil.getCurrentTimestamp(),
            updated_at = dateUtil.getCurrentTimestamp()
        )
    }

    fun createNoteList(noteCount: Int): List<Note> {
        val noteList: ArrayList<Note> = ArrayList()
        for (i in 0 until noteCount)
            noteList.add(createSingleNote(
                id = null,
                title = UUID.randomUUID().toString(),
                body = UUID.randomUUID().toString()
            ))

        return noteList
    }
}