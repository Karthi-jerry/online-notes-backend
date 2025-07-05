package com.fita.OnlineNotes.service;

import com.fita.OnlineNotes.entity.Note;
import com.fita.OnlineNotes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepo;

    // Get all notes
    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }

    // Get a single note by ID
    public Note getNoteById(Long id) {
        return noteRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));
    }

    // Create a new note
    public Note createNote(Note note) {
        return noteRepo.save(note);
    }

    // Update an existing note
    public Note updateNote(Long id, Note noteDetails) {
        Note note = noteRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));

        note.setTitle(noteDetails.getTitle());
        note.setDescription(noteDetails.getDescription());
        note.setColor(noteDetails.getColor());

        return noteRepo.save(note);
    }

   
    public void deleteNote(Long id) {
        noteRepo.deleteById(id);
    }
}
