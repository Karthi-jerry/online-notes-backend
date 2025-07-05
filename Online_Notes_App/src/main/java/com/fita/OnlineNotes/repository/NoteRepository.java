package com.fita.OnlineNotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fita.OnlineNotes.entity.Note;



public interface NoteRepository extends JpaRepository<Note, Long> {

}
