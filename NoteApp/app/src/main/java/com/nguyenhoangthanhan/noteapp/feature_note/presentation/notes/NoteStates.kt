package com.nguyenhoangthanhan.noteapp.feature_note.presentation.notes

import com.nguyenhoangthanhan.noteapp.feature_note.domain.model.Note
import com.nguyenhoangthanhan.noteapp.feature_note.domain.util.NoteOrder
import com.nguyenhoangthanhan.noteapp.feature_note.domain.util.OrderType

data class NoteStates(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)