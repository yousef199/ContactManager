package com;

import com.anushka.androidtutz.contactmanager.db.ContactDAO;
import com.anushka.androidtutz.contactmanager.db.entity.Contact;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class} , version = 1)
public abstract class ContactsAppDataBase extends RoomDatabase {
        public abstract ContactDAO getContactDAO();
}
