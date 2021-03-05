package com.anushka.androidtutz.contactmanager.db;

import com.anushka.androidtutz.contactmanager.db.entity.Contact;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface ContactDAO {
    @Insert
    long addContact(Contact contact);

    @Update
    void updateContact(Contact contact);

    @Delete
    void deleteContact(Contact contact);

    @Query("select * from contacts")
    List<Contact> getContactList();

    @Query("select * from contacts where contact_id ==:contactID")
    Contact getContact(long contactID);
}
