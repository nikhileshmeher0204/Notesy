package com.nikhilesh.notes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilesh.notes.entities.Notes;
import com.nikhilesh.notes.entities.User;

public interface NotesRepo extends JpaRepository<Notes, Integer>{
    List<Notes> findByUser(User user);
}
